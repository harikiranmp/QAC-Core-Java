package com.qac.coreJava.association.aggregation;

public class TVTester {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Remote rem = new Remote("white", "IR", false, 100);
		System.out.println("color = "+rem.color+"\n"+"type = "+rem.type+"\n"+"Is voice Controlled = "+rem.voiceControl+"\n"+"Weight = "+rem.weight);
		
		Television tv = new Television("LG",55,63000,true,40);
		System.out.println("Brand = "+tv.brand+"\n"+"size = "+tv.size+"\n"+"price = "+tv.price+"\n"+"Is smart TV = "+tv.isSmart+"\n"+"Sound Output = "+tv.soundOutput);

		tv.rem = rem;
		
		tv.streaming();
		rem.changeVolume();
		
		System.out.println("Main method ended");
	}

}
