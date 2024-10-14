
public class StringWork {

	public static void main(String[] args) {

      
 
		String s1 ="Dnyanesh";
		String s2 = s1;
		
		String s3 = new String(s1);
		
		System.out.println((s1==s2));
		System.out.println((s1==s3));
		System.out.println(s3);
	
		System.out.println(s3);
		s1=s3;
		System.out.println(s1);
		System.out.println(s3.equals(s2));
	}

}

	