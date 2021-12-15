package com.qac.coreJava.association.aggregation;

public class Television {

	String brand;
	int size;
	int price;
	boolean isSmart;
	int soundOutput;
	Remote rem;
	
	public Television(String brand, int size, int price, boolean isSmart, int soundOutput) {
		System.out.println("The specifications of TV is shown below");
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.isSmart = isSmart;
		this.soundOutput = soundOutput;
	}
	
	public void streaming() {
		rem.changeChannel();
		System.out.println("A live concert is streaming");
	}
	
	public void watchingMovie() {
		System.out.println("A movie is being played");
	}
}
