package Shape;
import java.util.Scanner;

public class ShapeServices {

	static Shape[] sarr;
	static int count;

	static {
		sarr= new Shape[5];
		count = 0;
	}
	public static void acceptData(int choice) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter color");
		String color = sc.next();		
		switch(choice) {
		case 1:
			System.out.println("enter base");
			int b=sc.nextInt();
			System.out.println("enter height");
			int h=sc.nextInt();
			System.out.println("enter side1");
			int s1=sc.nextInt();
			System.out.println("enter side2");
			int s2=sc.nextInt();
			
			sarr[count]=new Triangle(color,b,h,s1,s2);
		break;
		
		case 2:
			System.out.println("enter radius");
			int r=sc.nextInt();
			sarr[count]=new Circle(color,r);
			break;
			
		case 3:
			System.out.println("enter length");
			int len=sc.nextInt();
			System.out.println("enter breadth");
			int bre=sc.nextInt();
			sarr[count]=new Rectangle(color,len,bre);
			break;
		}
		count++;
		
	}

	
	public static void Calculatedetails(int pos) {
		System.out.println(pos+" : Area: "+sarr[pos].calArea());
		System.out.println(pos+" :Area: "+sarr[pos].calPara());
		
	}
	
	public static Shape[] getAllShapes() {
		return sarr;
	}
	
	
}
