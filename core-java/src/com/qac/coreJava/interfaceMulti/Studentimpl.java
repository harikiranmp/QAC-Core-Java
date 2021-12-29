package com.qac.coreJava.interfaceMulti;

public class Studentimpl implements iPUStudent, iDipStudent {

		
	@Override
	public void Engineering() {
		System.out.println("The candidate can join Engineering");
	}

	@Override
	public void lateralAadmission() {
		System.out.println("Diploma student can take admission to 3rd semester");
	}

	@Override
	public void admission() {
		System.out.println("PU student must be admitted to 1st semester");
	}

	@Override
	public void Joining() {
		iDipStudent.super.Joining();
	}

	
}
