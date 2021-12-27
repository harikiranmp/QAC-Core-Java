package com.qac.coreJava.designPattern;

public class LGimpl implements iAC {
	
	@Override
	public void on() {
		System.out.println("LG AC is switched on");
	}

	@Override
	public void run() {
		System.out.println("LG AC is working with the set temperature");
	}

	@Override
	public void off() {
		System.out.println("LG AC is switched off");
	}
}
