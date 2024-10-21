package com.demo.services;

import java.util.List;
import java.util.Scanner;

import com.demo.EmpNotFound.EmployeeNotFound;
import com.demo.beans.Employee;
import com.demo.dao.DaoServices;
import com.demo.dao.DaoServicesimpl;

public class EmployeeServicesImpl implements EmployeeServices{
       
	private DaoServices edao ;
	
	
	public EmployeeServicesImpl() {
		edao=new DaoServicesimpl();
	}
	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter salary");
		int sal=sc.nextInt();
		System.out.println("enter bonus");
		int bonus=sc.nextInt();
		
		Employee e = new Employee(id,nm,sal,bonus);
		edao.save(e);
	}
	@Override
	public List<Employee> getAllEmp() {
		
		return edao.getAll();
	}
	
	
	public boolean deleteById(int id) throws EmployeeNotFound {
		
		return edao.deleteById(id);
		
	}
	@Override
	public boolean updateById(int id, int sal) throws EmployeeNotFound {
		
		return edao.updateById(id,sal);
	}

}
