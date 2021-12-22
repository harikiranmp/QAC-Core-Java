package com.qac.coreJava.animal;

public class Horse extends Animal{

	String horseBreed;
		
	@Override
	public void eating() {
		System.out.println("The horse is eating grass");
	}

	public void running() {
		System.out.println("The horse run very fast");
	}
}
