
import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {

	private String designation;
	private Date doj;
	
	public Employee() {
		super();
		
	}
	public Employee(int id, String name, String mobile, String email, LocalDate bdate,String designation, Date doj) {
		super(id, name, mobile, email, bdate);
		this.designation = designation;
		this.doj = doj;

	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [designation=" + designation + ", doj=" + doj + "]";
	}
	
	
	
}
