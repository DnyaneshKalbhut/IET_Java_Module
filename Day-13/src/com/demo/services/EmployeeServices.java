package com.demo.services;

import java.util.List;

import com.demo.EmpNotFound.EmployeeNotFound;
import com.demo.beans.Employee;

public interface EmployeeServices {

	void addnewEmployee();

	List<Employee> getAllEmp();

	boolean deleteById(int id) throws EmployeeNotFound;

	boolean updateById(int id, int sal) throws EmployeeNotFound;
	
	

}
