import java.time.LocalDate;
import java.util.Date;

public class SalariedEmp extends Employee{
       private int salary;

	public SalariedEmp() {
		super();
		
	}

	public SalariedEmp(int id, String name, String mobile, String email, LocalDate bdate, String designation,
			Date doj,int salary) {
		    super(id, name, mobile, email, bdate, designation, doj);
	        this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+" SalariedEmp [salary=" + salary + "]";
	}
       
       
    
       
}
