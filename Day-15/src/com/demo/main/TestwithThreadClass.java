package com.demo.main;

import com.demo.beans.myClass;
import com.demo.threads.FactorialThread;
import com.demo.threads.PrintTableThread;
import com.demo.threads.SumDigitThread;

public class TestwithThreadClass {

	public static void main(String[] args) {
	
		myClass ob = new myClass();
		myClass ob1 = new myClass();
		
		PrintTableThread th1 = new PrintTableThread(ob, 3);
		FactorialThread f1 =new FactorialThread(ob,5);
		PrintTableThread th2 = new PrintTableThread(ob, 3);
		
		SumDigitThread s1 = new SumDigitThread(ob1, 3243);
		
		Thread th3=new Thread(s1);
		
		th3.start();
		th1.start();
		f1.start();
		th2.start();
	
	
	try {
		th1.join();
		f1.join(300);
		th2.join();
		th3.join();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//th3.start(); //runtime exception
	System.out.println("remaining part of main method");
	
}

}


