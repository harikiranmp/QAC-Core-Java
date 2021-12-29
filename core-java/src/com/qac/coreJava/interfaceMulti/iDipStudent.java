package com.qac.coreJava.interfaceMulti;

public interface iDipStudent {

	void Engineering();
	void lateralAadmission();
	
	default void Joining() {
		System.out.println("The student must join to the same stream studied in Diploma");
	}
}
