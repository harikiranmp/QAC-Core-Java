package com.qac.coreJava.animal;

public class Animal {

	String color;
	int age;
	double weight;
	String family;
	boolean wild;
	
	public void getAnimalDetails() {
		System.out.println("- - - Animal Details - - -");
		System.out.println("color:"+color);
		System.out.println("age:"+age);
		System.out.println("weight:"+weight);
		System.out.println("family:"+family);
	}
	
	public void wildAnimal(String wild) {
		System.out.println("is it a wild animal:"+wild);
	}
	
	public void eating() {                           //method signature
		System.out.println("The animal is eating");  //method implementation
	}
}
