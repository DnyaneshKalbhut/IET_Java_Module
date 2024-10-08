import java.time.LocalDate;

public class Member extends Person {
    private int amount_paid;
    private String type_of_membership;
	public Member() {
		super();
		
	}
	public Member(int id, String name, String mobile, String email, LocalDate bdate,int amount_paid,String type_of_membership) {
		super(id, name, mobile, email, bdate);
	    this.amount_paid=amount_paid;
	    this.type_of_membership=type_of_membership;
	}
	public int getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(int amount_paid) {
		this.amount_paid = amount_paid;
	}
	public String getType_of_membership() {
		return type_of_membership;
	}
	public void setType_of_membership(String type_of_membership) {
		this.type_of_membership = type_of_membership;
	}
	@Override
	public String toString() {
		return super.toString()+"Member [amount_paid=" + amount_paid + ", type_of_membership=" + type_of_membership + "]";
	}
    
    
}
