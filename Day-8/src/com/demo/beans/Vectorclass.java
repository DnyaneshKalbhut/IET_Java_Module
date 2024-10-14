package com.demo.beans;
import java.util.Vector;

public class Vectorclass {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>(10);
		System.out.println("Capacity : "+v.capacity());
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		v.add(16);
		v.add(17);
		System.out.println(v);
		System.out.println("Size : "+v.size());
		
	}
}
