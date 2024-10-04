
public class Student {
	private int Sid;
	private String Sname;
    private int m1,m2,m3;
	private String mobile;
	
	Student(){
		Sid=0;
		Sname=null;
		m1=m2=m3=0;
		mobile=null;
	}
	
	Student(int sid, String sname , int m1,int m2,int m3,String mob){
		this.Sid=sid;
		this.Sname=sname;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.mobile=mob;
	}
	
	public void setId(int id) {
		this.Sid=id;
	}
	public void setName(String name) {
		this.Sname=name;
	}
	public void setm1(int m1) {
		this.m1=m1;
	}
	public void setm2(int m2) {
		this.m2=m2;
	}
	public void setm3(int m3) {
		this.m3=m3;
	}
	public void setmobile(String mob) {
		this.mobile=mob;
	}
	
	public int getId() {
		return Sid;
	}
	
	public String getName() {
		return Sname;
	}
	
	public int getm1() {
		return m1;
	}
	public int getm2() {
		return m2;
	}
	public int getm3() {
		return m3;
	}
	public String getMob() {
		return mobile;
	}
	
     public void DisplayAll() {
    	 System.out.println("Id is "+Sid);
    	 System.out.println("Student Name: "+Sname);
    	 System.out.println("Student Mobile Num "+mobile);
    	 System.out.println("marks m1 is "+m1);
    	 System.out.println("marks m2 is "+m2);
    	 System.out.println("marks m3 is "+m3);
     }
     public String toString() {
 		return "Id : " +this.Sid+"\nName : "+Sname+"\nMobile: "+mobile+"\nM1 "+m1+"\nM2 "+m2+"\nM3 "+m3;
 	}
     
}
