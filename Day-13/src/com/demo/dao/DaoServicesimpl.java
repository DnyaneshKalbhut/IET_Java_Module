package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.EmpNotFound.EmployeeNotFound;
import com.demo.beans.Employee;

public class DaoServicesimpl implements DaoServices {

	static List<Employee> elst;
	static {
		elst= new ArrayList<>();
	}
	
	@Override
	public void save(Employee e) {
		elst.add(e);
	}

	@Override
	public List<Employee> getAll() {
		
		return elst;
	}

	@Override
	public boolean deleteById(int id) throws EmployeeNotFound {
		
		boolean flag = elst.remove(new Employee(id));
		if(flag)
			return flag;
		throw new EmployeeNotFound("Not found "+id);
		
	}

	@Override
	public boolean updateById(int id, int sal) throws EmployeeNotFound {
		
	int pos = elst.indexOf(new Employee(id));
	if(pos!=-1) {
		Employee e = elst.get(pos);
		e.setsalary(sal);
		return true;
	}
	throw new EmployeeNotFound("updation fail, not found "+id);
	}
	

}
