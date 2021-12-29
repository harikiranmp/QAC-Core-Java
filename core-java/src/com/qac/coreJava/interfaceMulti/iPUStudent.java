package com.qac.coreJava.interfaceMulti;

public interface iPUStudent {

	void Engineering();
	void admission();
	
	default void Joining() {
		System.out.println("The student can select any stream of his choice");
	}
}
