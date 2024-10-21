package com.demo.dao;

import java.util.List;

import com.demo.EmpNotFound.EmployeeNotFound;
import com.demo.beans.Employee;

public interface DaoServices {

	void save(Employee e);

	List<Employee> getAll();

	boolean deleteById(int id) throws EmployeeNotFound;

	boolean updateById(int id, int sal) throws EmployeeNotFound;


}
