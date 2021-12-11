package com.qac.coreJava.refrigirator;

public class RefrigiratorTest {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Refrigirator refrigerator1 = new Refrigirator("Samsung","Blue",2);
		System.out.println("Refrigerator= "+refrigerator1);
		
		System.out.println(refrigerator1.color+ "\n"+ refrigerator1.doors+ "\n"+ refrigerator1.brand+ "\n"+ refrigerator1.rating);
		
		refrigerator1.cooling();

		System.out.println("Main method ended");


	}

}
