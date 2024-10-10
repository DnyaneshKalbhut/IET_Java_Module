package Account;

public interface AccountServices  {

	void addNewAccount();
	Account[] findall();
	public double checkBalance(int id , int pin);
	public int deposit(int id , int pin , double amt);
	int withdrawAmount(int id, int pin, double amt);
	public int deleteById(int id,int pin);
}
