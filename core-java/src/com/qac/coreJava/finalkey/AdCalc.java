package com.qac.coreJava.finalkey;

public class AdCalc {

	final float pi = 3.14159f;
	double d;
	
	public void areaOfCircle(double d) {
		double result = (pi*d*d)/4;
		System.out.println("Area of Circle = "+result);
	}
}
