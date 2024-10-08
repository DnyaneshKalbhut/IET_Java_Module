import java.time.LocalDate;
import java.util.Date;

public class ContractEmp extends Employee {
    private int hrs;
    private int hrcharge;
	public ContractEmp() {
		super();
		
	}
	public ContractEmp(int id, String name, String mobile, String email, LocalDate bdate, String designation,
			Date doj , int hrs , int hrcharge) {
		super(id, name, mobile, email, bdate, designation, doj);
		this.hrs=hrs;
		this.hrcharge=hrcharge;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getHrcharge() {
		return hrcharge;
	}
	public void setHrcharge(int hrcharge) {
		this.hrcharge = hrcharge;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", hrcharge=" + hrcharge + "]";
	}
           
}
