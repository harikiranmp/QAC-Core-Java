package com.qac.coreJava.designPattern;

public class Voltasimpl implements iAC {

	@Override
	public void on() {
		System.out.println("Voltas AC is switched on");
	}

	@Override
	public void run() {
		System.out.println("Voltas AC is working with the set temperature");
	}

	@Override
	public void off() {
		System.out.println("Voltas AC is switched off");
	}

	
}
