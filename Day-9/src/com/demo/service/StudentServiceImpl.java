package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;

public class StudentServiceImpl implements StudentServices {

	@Override
	public void addnewStudent(int ch) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter student id: ");
	     int id = sc.nextInt();
	     System.out.println("enter student name: ");
	     String name = sc.nextLine();

	     System.out.println("enter student address: ");
	     String address = sc.nextLine();
		
	     System.out.println("enter birth date (dd/mm//yy");
	     String bdt = sc.next();
	     LocalDate ldt=LocalDate.parse(bdt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	     
	     int[] marks = new int[2];
	     if(ch==1 || ch==2) {
	    	 System.out.println("enter marks");
	    	 marks[0]=sc.nextInt();

	    	 System.out.println("enter marks");
	    	 marks[1]=sc.nextInt();
	    	 
	    	 
	     }
	}

	@Override
	public List<Student> getAllStudents() {
	
		return null;
	}

	@Override
	public Student getById(int id) {
	
		return null;
	}

	@Override
	public boolean deleteById(int id) {

		return false;
	}

	@Override
	public boolean modifyStudentMarks(int id, int newmarks) {
		
		return false;
	}

	@Override
	public List<Student> getByMarks(int mks) {
	
		return null;
	}

	@Override
	public List<Student> getByName(String nm) {
					
		return null;
	}

	@Override
	public List<Student> sortById() {
	
		return null;
	}

	@Override
	public List<Student> sortByName() {
		
		return null;
	}

	@Override
	public List<Student> sortByMarks() {
		
		return null;
	}

	
}
