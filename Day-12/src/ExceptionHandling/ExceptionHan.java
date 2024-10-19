package ExceptionHandling;

public class ExceptionHan {
	
	
	public static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied- you must be at least 18 year old");
		}else {
			System.out.println("Accesed approved");
		}
	}

	public static void main(String[] args) {	
		try {
		int[] number= {1,2,3,4,5};
		System.out.println(number[10]);
		}catch(Exception e){
			System.out.println("Something went wrong");
		}finally {
			System.out.println("the 'try catch' block ends here");
		}
		checkAge(20);
	}

}
