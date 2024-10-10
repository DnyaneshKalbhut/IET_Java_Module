package InterfaceDemo;

public interface MyFunctionalInterface {

	void m1();
	
	default void m2() {
		m4();
		System.out.println("at m2");
	}
	
	static void m3() {
		m4();
		System.out.println("at m3");
	}
	
	private static void m4(){
		System.out.println("at m4");
	}
}
