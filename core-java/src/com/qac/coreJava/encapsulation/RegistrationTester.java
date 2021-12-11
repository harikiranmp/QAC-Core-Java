package com.qac.coreJava.encapsulation;

public class RegistrationTester {

	public static void main(String[] args) {
		Registration reg = new Registration();
		
		reg.setName("hari");
		reg.setEmail("hari@gmail.com");
		reg.setUserId("hk123");
		reg.setPassword("hari@123");
		
		reg.getdetails();

	}

}
