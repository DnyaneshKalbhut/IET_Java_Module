package com.demo.main;

import com.demo.beans.myClass;

public class NothreadClass {

	public static void main(String[] args) {
		myClass ob=new myClass();
		ob.printable(3);
		int ans=ob.factorial(5);
		System.out.println("Factorial : "+ans);
		ob.printable(7);
		System.out.println("remaining part of main method");

	}

}
