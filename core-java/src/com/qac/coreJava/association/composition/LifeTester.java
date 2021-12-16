package com.qac.coreJava.association.composition;

public class LifeTester {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Man man = new Man("Male", 25, 165, 63.51, heart);
		System.out.println("Gender = "+man.gender+"\n"+"Age = "+man.age+"\n"+"Height = "+man.height+" cm"+"\n"+"Weight = "+man.weight);		
		
		Heart heart = new Heart(4,true);
		System.out.println("No. of chambers in the heart = "+heart.noOfChambers+"\n"+"is heart healthy = "+heart.isHealthy);
		
		man.living();
		man.breathing();
	}

}
