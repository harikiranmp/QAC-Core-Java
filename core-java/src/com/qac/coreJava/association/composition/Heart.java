package com.qac.coreJava.association.composition;

public class Heart {

	int noOfChambers;
	boolean isHealthy;
	
	public Heart(int noOfChambers, boolean isHealthy) {
		this.isHealthy=isHealthy;
		this.noOfChambers=noOfChambers;
	}
	public void circulating() {
		System.out.println("Heart is circulating oxygen");
	}
	
	public void pumping() {
		System.out.println("Heart is pumping the blood");
	}
}
