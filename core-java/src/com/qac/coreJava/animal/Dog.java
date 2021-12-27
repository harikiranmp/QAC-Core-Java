package com.qac.coreJava.animal;

public class Dog extends Animal {

	String dogBreed;
	String color = "Black";
		
	@Override
	public void eating() {
		super.eating();
		System.out.println("The dog is eating rice");
	}

	public void barking() {
		System.out.println("The dog will bark");
	}
	
	public void getcolor() {
		System.out.println("The color of the dog is "+color);
	}
	
		
}
