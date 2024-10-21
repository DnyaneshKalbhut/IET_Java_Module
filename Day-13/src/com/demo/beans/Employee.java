package com.demo.beans;

public class Employee {
private int empid;
private String ename;
private int salary;
private int bonus;

 public Employee() {
 super();	
 }
 
 public Employee(int empid,String ename,int salary,int bonus) {
 super();
 this.bonus=bonus;
 this.empid=empid;
 this.ename=ename;
 this.salary=salary;
 }
 
 public Employee(int empid) {
	 super();
	 this.empid = empid;
	 }
 
 @Override
 public boolean equals(Object ob) {
		System.out.println("in employee equals method "+this.empid+"-----"+((Employee)ob).empid);
	 return this.empid == ((Employee)ob).empid; 
 }
 
 public int getempid() {
	 return empid;
 }
 public void setempid(int empid) {
	 this.empid=empid;
 }
 public int getbonus() {
	 return bonus;
 }
 public void setbonus(int bonus) {
	this.bonus=bonus;
}
 public String getename() {
	 return ename;
 }
 public void setename(String ename) {
	 this.ename=ename;
 }
 public int getesalary() {
	 return salary;
 }
 public void setsalary(int salary) {
	 this.salary=salary;
 }
@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", bonus=" + bonus + "]";
}

 
}
