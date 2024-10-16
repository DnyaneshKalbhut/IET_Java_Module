package com.demo.beans;

import java.time.LocalDate;

public class MasterStudent extends Student {
private String thesissub,thesisdegree;
private int thesismarks;

public MasterStudent() {
		super();
	}



public MasterStudent(int pid, String pname, String paddress, LocalDate bdate,int [] marks,  String thesissub, String thesisdegree, int thesismarks) {
	super(pid,pname,paddress,bdate,marks);
	this.thesissub = thesissub;
	this.thesisdegree = thesisdegree;
	this.thesismarks = thesismarks;
}



public String getThesissub() {
	return thesissub;
}

public void setThesissub(String thesissub) {
	this.thesissub = thesissub;
}

public String getThesisdegree() {
	return thesisdegree;
}

public void setThesisdegree(String thesisdegree) {
	this.thesisdegree = thesisdegree;
}

public int getThesismarks() {
	return thesismarks;
}

public void setThesismarks(int thesismarks) {
	this.thesismarks = thesismarks;
}


public String toString() {
	return "MasterStudent [thesissub=" + thesissub + ", thesisdegree=" + thesisdegree + ", thesismarks=" + thesismarks
			+ "]";
}



@Override
public float calcgrade() {
	// TODO Auto-generated method stub
	return 0;
}


	
}
