package com.qac.coreJava.arrays;

public class arrayLiteral {

	public static void main(String[] args) {
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
		// using literal way of declaring an array
		
		for (int i=0; i < months.length; i++) {
			System.out.println(+i+"th month of year is= "+months[i]);
			}

	}

}
