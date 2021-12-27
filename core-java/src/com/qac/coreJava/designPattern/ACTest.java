package com.qac.coreJava.designPattern;

public class ACTest {

	public static void main(String[] args) {
		
		String brand = "LG";

		iAC AC = ACShowRoom.getAC(brand);
		
		if(AC != null) {
		AC.on();
		AC.run();
		AC.off();
		}
	}

}
