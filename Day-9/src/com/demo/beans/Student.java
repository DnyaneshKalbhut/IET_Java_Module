package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;

abstract public class Student extends Person {
	protected int[] marks; 
public Student() {
	System.out.println("default constructor");
}
public Student(int pid, String pname, String paddress, LocalDate bdate,int [] marks) {
	super(pid,pname,paddress,bdate);
	this.marks=marks;
		}
public int[] getmarks() {
	return marks;	
}
public void setmarks(int[] marks) {
	this.marks=marks;
}
abstract public float calcgrade();
public String toString(){
	return super.toString()+"Student[marks="+Arrays.toString(marks)+"]";
}
}

