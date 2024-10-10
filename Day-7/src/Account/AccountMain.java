package Account;

import java.util.Scanner;

public class AccountMain {

	public static void main() {
		Scanner sc=new Scanner(System.in);
		
		
		AccountServices ac =new AccountServicesImpl();
		int choice = 0;
		do {
			System.out.println("1. Add new Account\n2. Delete by id\n3. withdrawal\n");
			System.out.println("4. deposit\n5. check balance\n6. display all\n7. exit\n choice :");
			choice=sc.nextInt();
		switch(choice) {
		case 1:
			ac.addNewAccount();
			break;
		case 2:
			System.out.println("enetr acid");
			int id=sc.nextInt();
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			int status=ac.deleteById(id,pin);
			
			if(status>0) {
				System.out.println("Deleted");
			}else if(status==-1) {
				System.out.println("not found");
			}else {
				System.out.println("pin is wrong");
			}
			break;
			
		case 3:
			
			break;
			
		case 4:
			System.out.println("Enter id");
			 id= sc.nextInt();
			System.out.println("Enter pin");
			 pin= sc.nextInt();
			System.out.println("Enter amount");
			double amt= sc.nextDouble();
			
		     status = ac.deposit(id, pin, amt);
			
			if(status>0) {
				System.out.println("Money deposited");
			}else if(status==-1) {
				System.out.println("not found");
			}else {
				System.out.println("pin is wrong");
			}
			
			break;
			
		case 5:
			System.out.println("Enter id");
			 id= sc.nextInt();
			System.out.println("Enter pin");
			 pin= sc.nextInt();
			double bal = ac.checkBalance(id,pin);
			
			if(bal>0) {
				System.out.println("Balance of account  :"+id+": " +bal);
			}else if(bal==-1) {
				System.out.println("not found");
			}else {
				System.out.println("pin is wrong");
			}
			break;
			
		case 6:
			    Account[] arr = ac.findall();
				for(Account a:arr) {
					if(a!=null)
					   System.out.println(a);
					else
						break;
				}
				
				//java 1.8
				//Arrays.stream(arr).forEach(ob->{System.out.println(ob);});
				//Arrays.stream(arr).forEach(ob->System.out.println(ob));
				//Arrays.stream(arr).forEach(System.out::println);
			    break;
			
		case 7:
			sc.close();
			break;
		default:
			System.out.println("wrong choice");
			break;
			
		}
	}while(choice!=7);
		
	}
}
