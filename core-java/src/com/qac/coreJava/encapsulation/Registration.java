package com.qac.coreJava.encapsulation;

public class Registration {

	private String name;
	private String email;
	private String userId;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void getdetails() {
		System.out.println("name:"+name + "\n" +"email:"+email +"\n"+ "UID:"+userId +"\n"+ "Password:"+password);
	}
}
