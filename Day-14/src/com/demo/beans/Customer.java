package com.demo.beans;

import com.demo.enums.Gender;

public class Customer {
private String cname;
private int cid;
private Gender gender;

public Customer() {
	super();
}
public Customer(String cname,int cid,Gender gender) {
	super();
this.cname=cname;
this.cid=cid;
this.gender=gender;
}
public int getcid() {
	return cid;
}
public String getcname() {
	return cname;
}
public Gender getgender() {
	return gender;
}
public void setcid(int cid) {
	this.cid=cid;
}
public void setcname(String cname) {
	this.cname=cname;	
}
public void setgender(Gender gender) {
	this.gender=gender;	
}
public String toString(){
	return "Customer[cid="+ cid +", cname="+ cname +",gender="+gender+"]";
}
}