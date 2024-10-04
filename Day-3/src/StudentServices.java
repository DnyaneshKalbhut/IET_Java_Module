import java.util.Scanner;

public class StudentServices {

	private static Student[] stdarr;
	private static int count;
	static {
		stdarr=new Student[10];
		stdarr[0]=new Student(1,"Dk",17,21,23,"4321123");
		stdarr[1]=new Student(2,"Ds",18,22,25,"54245644");
		stdarr[2]=new Student(3,"Ds",15,21,22,"78687687");
		count=3;
	}
	
	
	public static void addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int Stdid = sc.nextInt();
		sc.nextLine(); // to remove \n from scanner buffer
		System.out.println("Enter Name");
		String Stdname=sc.nextLine();
		System.out.println("Marks1");
		int m1 = sc.nextInt();		
		System.out.println("Marks2");
		int m2 = sc.nextInt();
		System.out.println("Marks3");
		int m3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Mobile Number");
		String mob=sc.nextLine();
		
		stdarr[count]=new Student(Stdid,Stdname,m1,m2,m3,mob);
	    count++;	
	}
	
	public static Student[] DisplayAll() {
		return stdarr;
	}
	 
	public static Student getById(int id) {
		for(Student s : stdarr){
			if(s!=null) {
				if(s.getId()==id) {
					return s;
				}
			}else {
				return null;
			}
		}
		return null;
	}
	
	public static Student[] searchByName(String nm) {
		Student[] arr = new Student[stdarr.length];
		int count=0;
		for(Student s : stdarr ) {
			if(s!=null) {
				if(s.getName().equals(nm)) {
				arr[count]=s;
				count++;
				}
			}else {
				break;
			}
		}
		if(count>0) {
			return arr;
		}else {
			return null;
		}
		
	}
	
	public static boolean ModifyName(int id, String name) {
	 Student s = getById(id);
	 if(s!=null) {
		 s.setName(name);
	     return true;
	 }return false;
	}	
	
	public static boolean deleteById(int id) {
		for(int i = 0 ; i <count ; i++) {
			if(stdarr[i].getId()==id) {
				for(int j =i ; j<count ; j++) {
					stdarr[j]=stdarr[j+1];
						}
				count--;
				return true;
			}
		}
		return false;		
	}
	 
	
	public static float AverageOfStd(int id) {
		 Student s = getById(id);
		 float average=0f;
		 if(s!=null) {
			 float sum =s.getm1()+s.getm2()+s.getm3();
			  average = sum/3;
		 }
		return average;
	}
	
	
}
