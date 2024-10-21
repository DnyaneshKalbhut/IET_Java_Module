package com.demo.threads;

import com.demo.beans.myClass;

public class FactorialThread extends Thread {

	private myClass obj;
	private int n;
	
	public FactorialThread(myClass ob, int i) {
		this.obj=ob;
		this.n=i;
	}

	
	
	public void run() {
		int ans = obj.factorial(n);
		System.out.println("Factorial : "+ans);
	 }
	 
}