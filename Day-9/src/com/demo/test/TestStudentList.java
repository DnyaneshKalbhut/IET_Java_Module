package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentServices;

public class TestStudentList {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int choice = 0;
     do {
 		System.out.println("1. add new student\n2. delete student by id\n 3. modify marks\n4. search by id");
 		System.out.println("5. search by marks > given marks\n6. sort by id\n 7. sort by name\n8. sort by marks");
 		System.out.println("9.display all\n10. search by name and display in sorted order\n 11. exit\nchoice:");
 	    choice=sc.nextInt();
 	    
 	    switch(choice) {
 	    case 1:
 	    	StudentServices.addnewStudent(choice);
 	    	break;
 	   case 2:
	    	break;
 	    case 3:
	    	break;
 	     case 4:
	    	break;
 	     case 5:
	    	break;
 	    case 6:
	    	break;
 	    case 7:
	    	break;
 	    case 8:
	    	break;
 	     case 9:
	    	break;
 	     case 10:
	    	break;
 	     case 11:
	    	break;
 	     default:
 		System.out.println("Thank you for visiting");
	    	break;
	    	
 	    }
 	    
 	   
 	    
     }while(choice!=11);
	}

}
