package com.qac.coreJava.animal;

public class AnimalTester {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Horse h=new Horse();
		h.age=10;
		h.color="black";
		h.family="Equidae";
		h.weight=10.25;
		h.horseBreed = "Arabian";
		
		h.getAnimalDetails();
		h.wildAnimal("False");
		h.running();
		
		Dog d=new Dog();
		d.age=5;
		d.color="White";
		d.family="Canidae";
		d.dogBreed="Labrador";
		
		
		d.getAnimalDetails();
		System.out.println("dog breed is:"+d.dogBreed);
		d.wildAnimal("False");
		d.barking();
		System.out.println("Main method ended");

	}

}
