package com.qac.coreJava.Calculator;

public class CalculatorTester {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Calculator Calculator1 = new Calculator();

		int result = Calculator1.adding(1,2);

		System.out.println("result= "+result);

		Calculator Calculator2 = new Calculator();

		double result1 = Calculator2.adding(5.3,2.6);

		System.out.println("result= "+result1);
		
		Calculator Calculator3 = new Calculator();
		
		int sum = Calculator3.adding(2,5,9);
		
		System.out.println("result= "+sum);

		System.out.println("Main method ended");
		}

	}

