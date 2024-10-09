package Shape;

public class Triangle extends Shape {

	private int b,h,s1,s2;
	
	public Triangle() {
		super();
	
	}
	
	public Triangle(String colour, int b, int h, int s1, int s2) {
		super(colour);
		this.b = b;
		this.h = h;
		this.s1 = s1;
		this.s2 = s2;
	}
	

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public int calArea() {
		return b*h;
	}

	public int calPara() {
		return b+s1+s2;
	}

	@Override
	public String toString() {
		return super.toString()+"Triangle [b=" + b + ", h=" + h + ", s1=" + s1 + ", s2=" + s2 + "]";
	}


	
	
	
}
