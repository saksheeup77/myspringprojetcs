package com.sakshi.springjavaapp;

import org.springframework.stereotype.Component;

@Component(value="student1")
public class Student {
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, Address studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	private int studentId;
	private String studentName;
	private Address studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	
	

}
