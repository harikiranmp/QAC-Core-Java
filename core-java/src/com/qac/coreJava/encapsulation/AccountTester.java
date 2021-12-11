package com.qac.coreJava.encapsulation;

public class AccountTester {

	public static void main(String[] args) {


	BankAccount acc1 = new BankAccount("hari", "hk@gmail.com", "22/12/1991", 12900.84, "Chelur");
	acc1.name = "hari";
	acc1.email = "hari@gmail.com";
	//acc1.branch = "tumkur";
	//acc1.setbalance(15600.24);

		System.out.println(acc1.email);
		System.out.println(acc1.getbranch());
		System.out.println(acc1.getifsCode());
		System.out.println(acc1.getbalance());
	}

}
