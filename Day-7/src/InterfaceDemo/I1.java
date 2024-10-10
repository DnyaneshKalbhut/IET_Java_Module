package InterfaceDemo;

public interface I1 {

	default void m1(){
		System.out.println("I1111 m1");
	}
	
	void m2();
}
