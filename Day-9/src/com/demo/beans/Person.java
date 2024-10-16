package com.demo.beans;

import java.time.LocalDate;

public class Person {
private int pid;
private String pname;
private String paddress;
private LocalDate bdate;

public Person() {
	super();
}
public Person(int pid){
	super();
	this.pid=pid;
}
public Person(int pid, String pname, String paddress, LocalDate bdate) {
	this.pid=pid;
	this.pname=pname;
	this.paddress=paddress;
	this.bdate=bdate;
}

public int getPid() {
	return pid;
}
public String getPname() {
	return pname;
}
public String getPaddress() {
	return paddress;
}
public LocalDate getBdate() {
	return bdate;
}
public void setpid(int pid) {
	this.pid=pid;
}
public void setpname(String pname) {
	this.pname=pname;	
}
public void setpaddress(String paddress) {
	this.paddress=paddress;
}
public void setbdate(LocalDate bdate) {
	this.bdate=bdate;
}

public String toString() {
	return "Person [pid="+pid+",pname="+pname+",paddress="+paddress+",bdate="+bdate+"]";
}



}
	
	
