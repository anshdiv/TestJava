package com.example.collections.list;

import java.util.List;
import java.util.Vector;

public class PVector {

	private List<String> students;
	
	PVector(){
		createData();
	}
	
	void createData() {
		students = new Vector<String>();
		students.add("Anshul");
		students.add("Rahul");
		students.add("Vicky");
		students.add("Shubham");
	}
	
	public List<String> getStudents(){
		return students;
	}
	
	public void addItem(String name) {
		students.add(name);
	}
	
	public void removeItem(int position) {
		students.remove(position);
	}
	
}
