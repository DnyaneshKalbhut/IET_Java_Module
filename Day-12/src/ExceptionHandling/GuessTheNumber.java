package ExceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		int num = 25;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("enter the number");
				int num1= sc.nextInt();
				
				if(num!=num1) {
					throw new WrongNumberInputException("Lost! try again");
				}else {
					System.out.println("you won "+num);
					break;
				}
				}catch(InputMismatchException e){
					System.out.println("Cannot enter a string, input should be a number ");
				}catch(WrongNumberInputException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}


