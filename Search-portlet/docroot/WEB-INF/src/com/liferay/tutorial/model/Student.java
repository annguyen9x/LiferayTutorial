package com.liferay.tutorial.model;

import java.util.Date;

//biểu diễn đối tượng (Student)
public class Student {
	private String	code;
	private String	fullname;
	private Date	birthday;
	private boolean	gender;
	private String	address;
	
	public Student() {
		super();
	}
	
	public Student(String code, String fullname, Date birthday, boolean gender,
			String address) {
		super();
		this.code = code;
		this.fullname = fullname;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
