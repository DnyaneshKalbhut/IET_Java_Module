package com.demo.beans;

import java.time.LocalDate;

public class Faculty extends Person {
	private String sub;

	public Faculty() {
		super();
	}

	public Faculty(int pid, String pname, String paddress, LocalDate bdate, String sub) {
		super(pid, pname, paddress, bdate);
	    this.sub=sub;
	}

	

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Faculty(int pid) {
		super(pid);
		
	}
	@Override
	public String toString() {
		return super.toString()+"Faculty [sub=" + sub + "]";
	}

}
