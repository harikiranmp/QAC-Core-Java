package com.qac.coreJava.designPattern;

public class ACShowRoom {

	public static iAC getAC(String brand) {
		
		if(brand.equalsIgnoreCase("Voltas")){
			//Voltasimpl voltas = new Voltasimpl();
			return new Voltasimpl();
		}
		
		else if(brand.equalsIgnoreCase("LG")){
			return new LGimpl();
		}
		
		else {
			System.out.println(brand+" is not available");
			return null;
		}
		
	}
}
