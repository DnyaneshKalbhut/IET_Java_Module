import java.util.Scanner;

public class ArraysFunc {

			public static void acceptData(int[] arr) {
				 Scanner sc = new Scanner(System.in);
				for(int i=0;i<arr.length;i++) {
			    	System.out.println("enter number");
			    	arr[i]=sc.nextInt();
			    }
				
			}
			
			public static void displaydata(int[] arr) {
				for(int i=0;i<arr.length;i++) {
			    	System.out.println(arr[i]);
			    	
			    }
			}
			
			
			public static int searchNumber(int [] arr,int target) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==target)
						return i;
					
				}
				return -1;
			} 
			
			public static int addAllEvenNum(int[] arr) {
				int sum=0;
				for(int n:arr) {
					if(n%2==0)
						sum=sum+n;
				}
				return sum;
			}
			
			private static boolean checkPrime(int num) {
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						return false;
					}
				}
				return true;
			}
			
			public static int[] findAllPrimeNum(int[] arr) {
				int[] primearr=new int[arr.length];
				int cnt=0;
				for(int n:arr) {
					boolean ans=checkPrime(n);
					if(ans) {
						primearr[cnt]=n;
						cnt++;
					}
				}
				if(cnt>0) {
					return primearr;
				}
				return null;
			}
			
	}


