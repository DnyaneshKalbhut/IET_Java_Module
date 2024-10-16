package com.demo.services;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Course;
import com.demo.dao.DaoServiceImpl;
import com.demo.dao.DaoServices;

public class CourseServicesImpl implements CourseServices {

	DaoServices dao;
	
	public CourseServicesImpl() {
	dao= new DaoServiceImpl();
	}
	
	@Override
	public boolean addNewCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course name");
	    String name = sc.next();
	    System.out.println("Enter Course fees");
	     Double fees = sc.nextDouble();
	    System.out.println("Enter Course Duration");
	    int duration = sc.nextInt();
	    System.out.println("Enter Course Capacity");
	    int capacity = sc.nextInt();	    
	    Course c = new Course(name,fees,duration,capacity);
		return dao.save(c);
	}

	@Override
	public Map<String , Course> DisplayAll() {
		return dao.DisplayAll();
		
	}

	@Override
	public boolean DeleteByName(String name) {
		return dao.DeleteByName(name);
		
	}

	@Override
	public boolean updateByName(String cname, int cduration, int capacity) {	
		return dao.updateByName(cname , cduration , capacity);
	}

	@Override
	public List<Course> findByDuration(int cduration) {
		return dao.findByDuration(cduration);
	}

	@Override
	public Course serachByName(String name) {
		return  dao.searchByName(name);
		
	}
	
	

}
