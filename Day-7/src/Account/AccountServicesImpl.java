package Account;

import java.util.Scanner;

public class AccountServicesImpl implements AccountServices {

		static Account[] arr;
		static int count;
		static {
			arr= new Account[100];
			arr[0]=new  Account(1,"DK",34343,1111);
			arr[1]=new Account(2,"Ds",12313,2222);
			count=2;
			
		}
	
	@Override
	public void addNewAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int acid = sc.nextInt();
		System.out.println("Enter holder name");
		String name = sc.next();
		System.out.println("Enter account balance");
		double bal=sc.nextDouble();
		System.out.println("Enter account pin");
		int pin=sc.nextInt();
		
		arr[count]= new Account(acid,name,bal,pin);
		count++;
		
	}

	@Override
	public Account[] findall() {
	     return arr;
	}

	
	private int findAccount(int id , int pin) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].getAccid()==id) {
				if(arr[i].getPin()==pin) {
					return i;
				}
			}
		}
		return -1;
	}
	
	@Override
	public double checkBalance(int id, int pin) {
		int pos = findAccount(id, pin);
		
		if(pos>=0) {
			return arr[pos].getBalance();
			}
		
		return pos;
	}

	@Override
	public int deposit(int id, int pin, double amt) {
		int pos = findAccount(id, pin);
		 if(pos>=0) {
			 arr[pos].depositAmt(pos);
			 return pos;
		 }
		 return pos;
		
	}

	@Override
	public int deleteById(int id, int pin) {
		int pos = findAccount(id, pin);
		 if(pos>=0) {
			 for(int i = pos ; i<count ; i++ ) {
				 arr[i]=arr[i+1];
			 }
		 }
		 return pos;
		
		
	}

	@Override
	public int withdrawAmount(int id, int pin, double amt) {
	int	pos = findAccount(id, pin);
		
	if(pos>=0) {
		boolean status = arr[pos].withdraw(amt);
		if(status) {
	    	return 1;
	    }else {
	    	return -3;
	    }
	   
	}
	return pos;
	}
	
	
	

}
