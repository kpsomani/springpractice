package com.practice1.model;

import java.time.LocalDate;

public class UserData {

	private String userID;
	private String psw;
	private String firstname;
	private String lastname;
	private int age;
	private String contactNo;
	private String email;
	private LocalDate dob;
	
	
	
	
	
	
	
	public UserData(String userID, String psw, String firstname, String lastname, int age, String contactNo,
			String email, LocalDate dob) {
		super();
		this.userID = userID;
		this.psw = psw;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.contactNo = contactNo;
		this.email = email;
		this.dob = dob;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getContactNo() {
		return contactNo;
	}



	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	
	
}
