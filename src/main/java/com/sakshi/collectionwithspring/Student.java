package com.sakshi.collectionwithspring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
private String name;
private int rollno;
private Map<Integer,String> subject;

public Student(String name, int rollno, Map<Integer,String> subject) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.subject = subject;
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", subject=" + subject + "]";
}

}
