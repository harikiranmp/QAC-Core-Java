package com.qac.coreJava.association.composition;

public class LifeTester {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Heart heart = new Heart(4,true);
		//System.out.println("No. of chambers in the heart = "+heart.noOfChambers+"\n"+"is heart healthy = "+heart.isHealthy);
		
		Man man = new Man("Male", 25, 165, 63.51, heart);
		//System.out.println("Gender = "+man.gender+"\n"+"Age = "+man.age+"\n"+"Height = "+man.height+" cm"+"\n"+"Weight = "+man.weight+"\n"+"No. of chambers in the heart = "+heart.noOfChambers+"\n"+"is heart healthy = "+heart.isHealthy);		
		
		man.display();
		man.living();
		man.breathing();
	}

}
