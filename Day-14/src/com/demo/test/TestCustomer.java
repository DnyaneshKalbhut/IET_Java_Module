package com.demo.test;

import com.demo.beans.Customer;
import com.demo.enums.Gender;

public class TestCustomer {

	public static void main(String[] args) {
    Customer obj=new Customer("Divyansh",12,Gender.male);
    Gender g = Gender.female;
    System.out.println("ordinal :"+g.ordinal());
	System.out.println(g.valueOf("female"));
	}
}
