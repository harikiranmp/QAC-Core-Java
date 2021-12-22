package com.qac.coreJava.animal;

public class Dog extends Animal {

	String dogBreed;
		
	@Override
	public void eating() {
		System.out.println("The dog is eating rice");
	}

	public void barking() {
		System.out.println("The dog will bark");
	}
	
		
}
