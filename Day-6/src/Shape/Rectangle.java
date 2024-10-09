package Shape;

public class Rectangle extends Shape {
     private int len , bre ;

 	public Rectangle() {
		super();
		
	}

	public Rectangle(String colour, int len, int bre) {
		super(colour);
		this.len = len;
		this.bre = bre;
	}



	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBre() {
		return bre;
	}

	public void setBre(int bre) {
		this.bre = bre;
	}
	
	@Override
	public int calArea() {
		
		return len*bre;
	}

	@Override
	public int calPara() {
		
		return 2*(len+bre);
	}
	
	@Override
	public String toString() {
		return super.toString()+"Rectangle [len=" + len + ", bre=" + bre + "]";
	}
     
}
