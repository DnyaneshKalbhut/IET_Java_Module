import java.util.Scanner;

public class Array2Dfuncs {

	public static void acceptArray(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			System.out.println("Enter value for 2d array");
			arr[i][j]=sc.nextInt();
		}
	}
	}
	
	public static void displayArray(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			System.out.println(arr[i][j]);
		}
			System.out.println();
	}
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
