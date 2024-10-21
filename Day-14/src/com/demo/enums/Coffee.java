package com.demo.enums;

public enum Coffee {
	small(150,200),medium(200,250),large(250,300);
	private int size;
	private int price;
	private Coffee(int size,int price) {
		this.size=size;
		this.price=price;
		
	}
public int getsize() {
	return size;
}
public int getprice() {
	return price;
}
public void setsize(int size) {
	this.size=size;
}
	public void setprice(int price) {
	this.price=price;
}
}
