package com.demo.test;

import com.demo.beans.Customer;
import com.demo.enums.Coffee;
import com.demo.enums.Gender;

public class TestCoffeeEnum {

	public static void main(String[] args) {
	Coffee c=Coffee.medium;
	System.out.println(" Display menu");

	switch(c){ 
	case small:
	System.out.println("Small size Selected");
    break;
	case medium:
	System.out.println("Medium size selected");
	break;
	case large:
	System.out.println("Large size is selected");
}
}
}