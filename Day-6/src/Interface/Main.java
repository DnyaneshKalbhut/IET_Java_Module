package Interface;

public class Main {

	public static void main(String[] args) {
		
		MyClass c1 = new MyClass();
		c1.permutation(5, 3);
		c1.combination(4, 6);
		
		Interface1 ob = new MyClass();
		
		ob.m1();
		ob.m2(2);
		
		Interface2 ob1 = new MyClass();
		ob1.m1();
		ob1.m3();
		
		c1.m3();
	}

}
