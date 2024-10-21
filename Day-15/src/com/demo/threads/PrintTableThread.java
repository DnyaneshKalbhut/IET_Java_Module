package com.demo.threads;

import com.demo.beans.myClass;

public class PrintTableThread extends Thread {
	private myClass ob;
	private int n;
	
	public PrintTableThread(myClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	public void run() {
		ob.printable(n);
	}
}
