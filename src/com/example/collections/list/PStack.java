package com.example.collections.list;

import java.util.List;
import java.util.Stack;

public class PStack {

	private Stack<String> students;
	
	PStack(){
		createData();
	}
	
	void createData() {
		students = new Stack<String>();
		students.add("Anshul");
		students.add("Rahul");
		students.add("Vicky");
		students.add("Shubham");
	}
	
	public List<String> getStudents(){
		return students;
	}
	
	public void push(String name) {
		students.push(name);
	}
	
	public void pop() {
		students.pop();
	}
	
}
