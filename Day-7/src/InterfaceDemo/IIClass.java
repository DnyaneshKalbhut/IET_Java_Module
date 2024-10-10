package InterfaceDemo;

public class IIClass implements I1,I2 {

	@Override
	public void m31() {
		
		System.out.println("m31");
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		I2.super.m1();
	}

}
