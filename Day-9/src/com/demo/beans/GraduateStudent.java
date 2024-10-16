package com.demo.beans;

import java.time.LocalDate;

abstract public class GraduateStudent extends Student {
	private int spsub;
	
public GraduateStudent() {
	super();
}
public GraduateStudent(int pid, String pname, String paddress, LocalDate bdate,int[] marks,int spsub) {
	super(pid,pname,paddress,bdate,marks);
	this.spsub=spsub;	
}
public int getSpsub(){
	return spsub;
}

public void setSpsub(int Spsub){
	this.spsub=spsub;	
}
//public float calcgrade() {
//	return();
//}
public String toString() {
	return super.toString()+"GraduateStudent[Spsub="+spsub+"]";
}

}
		