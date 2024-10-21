package Interface;

public final class MyClass implements Interface1,Interface2 {

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
    public int m2(int x) {
		System.out.println("m2");
		return x*10;
	}

	@Override
	 public void m3() {
		
		System.out.println("m3");
	}

	
}

