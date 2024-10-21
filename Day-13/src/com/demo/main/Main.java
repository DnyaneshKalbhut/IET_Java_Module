package com.demo.main;

import java.util.List;
import java.util.Scanner;

import com.demo.EmpNotFound.EmployeeNotFound;
import com.demo.beans.Employee;
import com.demo.services.EmployeeServices;
import com.demo.services.EmployeeServicesImpl;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeServices eservice = new EmployeeServicesImpl();
		do {
		System.out.println("1. Add new Employee\n2. delete Employee\n3. update employee\n");
		System.out.println("4. display all\n5.exit\nchoice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1 -> {
			eservice.addnewEmployee();
		}
		
		case 2 ->{
		
			try {
			System.out.println("Enter id");
			int id= sc.nextInt();
			
			boolean status = eservice.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}
		     }catch(EmployeeNotFound e) {
			System.out.println(e.getMessage());
		} 
		}
		
		case 3 ->{
			
			try {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter new salary");
			int sal = sc.nextInt();
			
			boolean status=eservice.updateById(id,sal);
			if(status) {
				System.out.println("updated successfully");
			}
		}catch(EmployeeNotFound e) {
			System.out.println(e.getMessage());
		}
		}
		
		case 4 ->{
			List<Employee> lst= eservice.getAllEmp();
			
			for(Employee e : lst) {
				System.out.println(e);
			}
		}
		case 5 ->{
			System.out.println("Thank you for visiting");
			sc.close();
		}
		default->{
			
		}
		}
		}while(choice!=5);

	}

}
