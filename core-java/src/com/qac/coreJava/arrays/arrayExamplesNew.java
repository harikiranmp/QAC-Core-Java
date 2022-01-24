package com.qac.coreJava.arrays;

public class arrayExamplesNew {

	public static void main(String[] args) {
		int tableof10[] = new int[11]; // defining an array using new keyword
		tableof10[0] = 0;
		tableof10[1] = 10;
		tableof10[2] = 20;
		tableof10[3] = 30;
		tableof10[4] = 40;
		tableof10[5] = 50;
		tableof10[6] = 60;
		tableof10[7] = 70;
		tableof10[8] = 80;
		tableof10[9] = 90;
		tableof10[10] = 100;
		
		System.out.println("10 ones are = "+tableof10[0]);
		
		for (int i=0; i < tableof10.length; i++) {
		System.out.println("10 "+i+"'s are = "+tableof10[i]);
		}

	}

}
