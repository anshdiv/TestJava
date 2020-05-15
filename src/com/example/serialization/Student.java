package com.example.serialization;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8297769401669962987L;
	
	private String name;
	private String rollNo;
	transient private String className;
	
	public Student(String name, String rollNo, String className) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.className = className;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
    
	@Override
	public String toString() {
		return "Roll No. : "+rollNo+" Name :"+name+" Class :"+className;
	}
}
