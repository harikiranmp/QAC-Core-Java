package com.qac.coreJava.refrigirator;

public class Refrigirator {
	String brand;
	String color;
	int doors;
	int rating;
	String capacity;
	double price;

	public Refrigirator(){
	this("Samsung","Blue",2);
	System.out.println("creating the object with no parameter");
	}

	public Refrigirator(String brand, String color, int doors){
	this("Samsung","Blue",2, 3);
	System.out.println("creating the object with 4 parameter");
	this.brand = brand;
	}

	public Refrigirator(String brand, String color, int doors, int rating){
	System.out.println("creating the object with 3 parameter");
	this.color = color;
	this.doors = doors;
	this.rating = rating;
	}

	public void on(){
	System.out.println("Switch on the refrigerator");
	System.out.println("Refrigerator is ON");
	}

	public void cooling(){
	System.out.println("Refrigerator is cooling");
	this.on();
	}

	public void off(){
	System.out.println("Switch off the refrigerator");
	System.out.println("Refrigerator is OFF");
	}

}
