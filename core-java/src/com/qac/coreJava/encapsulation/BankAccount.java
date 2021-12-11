package com.qac.coreJava.encapsulation;

public class BankAccount {

	private long accountNumber;
	private String ifsCode;
	private String branch;
	private double balance;
	public String name;
	public String email;
	public String dob;
	
	public BankAccount(String name, String email, String dob, double balance, String branch) {
		System.out.println("inside 5 parameter constructor");
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.balance = balance;
		this.branch = branch;
		this.ifsCode = "SBIN0040174";
	}
	
	public void createAccount() {
		System.out.println("Creating a bank account");
	}
	
	public void deposit() {
		System.out.println("deposit the amount");
	}
	
	//getter method
	public String getbranch(){
		return this.branch;
	}
	
	public void setbalance(double balance){
		this.balance=balance;
	}
	
	public double getbalance(){
		return this.balance;
	}
	
	public String getifsCode(){
		return this.ifsCode;
	}
}
