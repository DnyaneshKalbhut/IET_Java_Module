package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

public class Arraylst {

	public static void main(String[] args) {
        
	 ArrayList<Integer> ls = new ArrayList<>();
		ls.add(231);
		ls.add(120);
		ls.add(332);
		System.out.println("index position :"+ls.indexOf(120));
		System.out.println("contains :"+ls.contains(120));

		List<Integer> lst1=List.of(24,43,46,57,68,84,54,63);
		//ls.add()//gives exception error
		lst1.stream().forEach(System.out::println);
	}

}
