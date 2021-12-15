package com.qac.coreJava.association.aggregation;

public class Remote {

	String color;
	String type;
	boolean voiceControl;
	int weight;
	
	public Remote(String color, String type, boolean voiceControl, int weight) {
		System.out.println("Remote specifications assigned.");
		this.color = color;
		this.type = type;
		this.voiceControl = voiceControl;
		this.weight = weight;
	}
	
	public void changeChannel() {
		System.out.println("channel is changed");
	}
	
	public void changeVolume() {
		System.out.println("volume is incresed");
	}
	
}
