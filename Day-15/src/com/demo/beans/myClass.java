package com.demo.beans;

public class myClass {

  synchronized	public void printable(int num) {
		for(int i = 1 ; i<=10; i++) {
			System.out.println(num +" * "+ i +" = " + num*i );
		}
		
		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int factorial(int n) {
		int fact =1;
		for(int i = 1 ; i <= n; i++) {
			fact=fact*i;
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		return fact;
	}
	
	public int sumdigits(int num) {
		int sum=0;
		while(num>0) {
			int digit = num % 10;
			sum = sum + digit;
			num=(int)num/10;
		}
		return sum;
	}
}
