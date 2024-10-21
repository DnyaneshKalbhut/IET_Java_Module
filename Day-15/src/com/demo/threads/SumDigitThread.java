package com.demo.threads;

import com.demo.beans.myClass;

public class SumDigitThread extends Thread {

	 private myClass ob;
	    private int num;
	    
		public SumDigitThread(myClass ob, int num) {
			super();
			this.ob = ob;
			this.num = num;
		}

		@Override
		public void run() {
			int ans=ob.sumdigits(num);
			System.out.println("Sumdigits : "+ans);
			
		}
	
}
