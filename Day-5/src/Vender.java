import java.time.LocalDate;
import java.util.Date;

public class Vender extends Employee {
   private int no_of_emp;
   private int amount;
public Vender() {
	super();
	
}
public Vender(int id, String name, String mobile, String email, LocalDate bdate, String designation, Date doj,int no_of_emp , int amount) {
	super(id, name, mobile, email, bdate, designation, doj);
	this.amount=amount;
	this.no_of_emp=no_of_emp;
}
public int getNo_of_emp() {
	return no_of_emp;
}
public void setNo_of_emp(int no_of_emp) {
	this.no_of_emp = no_of_emp;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return super.toString()+"Vender [no_of_emp=" + no_of_emp + ", amount=" + amount + "]";
}
   
   
}
