import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1. Add new student\n2. delete by ID\n3. search by Id");
			System.out.println("4. Search by name\n5. display all\n6. modify name\n7.Avearge marks\n8.exit \nChoice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				StudentServices.addNewStudent();
				break;
			case 2:
				System.out.println("Enter Id to delete");
				int id = sc.nextInt();
				boolean status =StudentServices.deleteById(id);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}	
				break;
			case 3:
				System.out.println("Enter Id to search");
				 id = sc.nextInt();
				Student s= StudentServices.getById(id);
				if(s!=null) {
					System.out.println(s);
				}else {
					System.out.println("Not Found");
				}
				break;
			case 4:
				System.out.println("Enter name to search");
				sc.nextLine();
				String name = sc.nextLine();
				Student[] arr= StudentServices.searchByName(name);
				if(arr!=null) {
					for(Student s1 : arr) {
						if(s1!=null) {
						System.out.println(s1);
					}else {
						break;
					}
						}
				}
				break;
			case 5:
				arr=StudentServices.DisplayAll();
				for(Student s2 : arr) {
					if(s2!=null) {
						System.out.println(s2);
					}else {
						break;
					}
				}
				break;
			case 6:System.out.println("Enter id to Modify name");
			    id=sc.nextInt();
			    sc.nextLine();
			    System.out.println("Enter name ");
			    String str=sc.nextLine();
			    status = StudentServices.ModifyName(id, str);
			    if(status) {
			    	System.out.println("Updated successfully");
			    }else {
			    	System.out.println("Not Found");
			    }
			    break;
			case 7:
				System.out.println("Enter Id of Student to Calculate average");
				id=sc.nextInt();
                 if(id>=0) {
				float result=StudentServices.AverageOfStd(id);
				System.out.println(result);
                 }else {
                	 System.out.println("Not Found");
                 }
				break;
			case 8:
				System.out.println("Thank you for visiting....");
				sc.close();
				break;
			default:
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}while(choice!=7);

	}

}
