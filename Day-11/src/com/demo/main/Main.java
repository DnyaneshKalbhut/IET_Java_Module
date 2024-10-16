package com.demo.main;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Course;
import com.demo.services.CourseServices;
import com.demo.services.CourseServicesImpl;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int choice =0;
    
    CourseServices service = new CourseServicesImpl();
    
    do {
    System.out.println("1. add new course\n2. delete course\n3. update course\n4. display all");
    System.out.println("5. display by name\n6. display based on duration\n7. display in sorted order of course name\n8. display in sorted order of duration\n9.exit\nchoice:");
    choice=sc.nextInt();
    
    switch(choice) {
    
    case 1 -> {
    	
    boolean status=  service.addNewCourse();
    	if(status) {
    		System.out.println("Added Successfully");
    	}else {
    		System.out.println("Error");
    	}
    }
    case 2 -> {
    System.out.println("Enter a name to delete");
    String name = sc.next();
   boolean status=  service.DeleteByName(name);
    	if(status) {
    		System.out.println("Deleted Successfully");
    	}else {
    		System.out.println("Not Found");
    	}
    }
  
    case 3 -> {
       System.out.println("Enter a course name");
       String cname= sc.next();
       	System.out.println("Enter course new  Duration");
       	int cduration=sc.nextInt();
		System.out.println("Enter course new  capacity");
		int capacity=sc.nextInt();
		service.updateByName(cname,cduration,capacity);		
    }
    case 4 -> {
 	
    	Map<String,Course> hm1= service.DisplayAll();  	
    	Set<String> s= hm1.keySet();
    	s.stream().forEach(ob->System.out.println(ob+"--->"+hm1.get(ob)));
    	
    }
    
    
    
   case 5 -> {
    System.out.println("Enter course name to display:");
    String cname = sc.next();
    Course course = service.serachByName(cname);
    if (course != null) {
        System.out.println(course);  // Assuming Course has a properly overridden toString() method
    } else {
        System.out.println("Course not found");
    }

   
    }
    case 6 -> {
             System.out.println("Enter a Duration");
             int cduration = sc.nextInt();
             List<Course> lst = service.findByDuration(cduration);
          if(lst!=null) {
					lst.forEach(System.out::println);
				}else {
					System.out.println("Not found");
				}
    
    }
    case 7 -> {}
    case 8 -> {}
    case 9 -> {
    	System.out.println("Thank you for visiting.......");
    	sc.close();
    }
    default->{
    	System.out.println("Thanks For Visiting");
    }
    }
    
    
    
    
    
    
    }while(choice!=9);

	}

}



