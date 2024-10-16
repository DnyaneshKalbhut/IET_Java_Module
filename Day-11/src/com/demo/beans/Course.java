package com.demo.beans;

public class Course implements Comparable<Course> {
	private String cname;
	private double fees;
	private int capacity; 
	private int duration;

	public Course() {
		super();
	}
		
	public Course(String cname,double fees,int capacity,int duration) {
		super();	
		this.cname=cname;
		this.duration=duration;
		this.fees=fees;
		this.duration=duration;
		}
    public String getcname() {
    	return cname;
    }
    public void setCname(String cname) {
    	this.cname=cname;
    }
    public double getfees() {
    	return fees;
    }
    public void setFees(double fees) {
    	this.fees=fees;
    
    }
    public int getcapacity() {
    	return capacity;
    }
    public void setCapacity(int capacity) {
    	this.capacity=capacity;
    }
    public int getDuration() {
    	return duration;
    }
    public void setDuration(int duration) {
    	this.duration=duration;
}
	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + ", capacity=" + capacity + ", duration=" + duration + "]";
	}
	
	
}
