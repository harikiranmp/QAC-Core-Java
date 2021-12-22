package com.qac.coreJava.association.composition;

public class Man {

	String gender;
	int age;
	int height;
	double weight;
	final Heart heart;
	
	public Man(String gender, int age, int height, double weight, Heart heart) {
		this.age=age;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
		this.heart=heart;
	}
	
	public void display() {
		System.out.println("No. of chambers in the heart = "+heart.noOfChambers+"\n"+"is heart healthy = "+heart.isHealthy);		
	}
	
	public void living() {
		heart.pumping();
		System.out.println("The man is living since he has a heart");
	}
	public void breathing() {
		heart.circulating();
		System.out.println("The man is breathing to be able to live");
	}
}
