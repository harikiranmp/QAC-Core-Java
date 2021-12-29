package com.qac.coreJava.interfaceMulti;

public class StudentTester {

	public static void main(String[] args) {
		
		String student = "Diploma student";
		
		Studentimpl stu = new Studentimpl();
		
		if (student == "PU student") {
			stu.Engineering();
			stu.admission();
		}
		
		else if (student == "Diploma student") {
			stu.Engineering();
			stu.lateralAadmission();
		}
		
		else {
			System.out.println("The candidate cannot take admission into Engineering");
		}
		
		stu.Joining();

	}

}
