package InterfaceDemo;

public class MyFuncMain {

	public static void main(String[] args) {
	
		MyFunctionalInterface ob1 = new MyFunctionalInterface() {
			
			@Override
			public void m1() {
				System.out.println("In m1 in MyTestClass");
			}
		};
		
		ob1.m1();
		
		
		
		
		
		
		

	}

}
