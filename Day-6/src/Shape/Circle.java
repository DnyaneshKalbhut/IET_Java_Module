package Shape;

public class Circle extends Shape{
	 private int radius;
	 static final int pi=3;

	public Circle() {
		super();
	}

	public Circle(String colour,int radius) {
		super(colour);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public int calArea() {
		return pi*radius*radius;
	}

	@Override
	public int calPara() {
		return 2*pi*radius;
	}
	 
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}

	}

