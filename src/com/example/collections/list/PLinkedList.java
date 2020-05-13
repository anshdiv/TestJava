package com.example.collections.list;

import java.util.LinkedList;
import java.util.List;

public class PLinkedList {

	List<String> students;
	
	void createData() {
		students = new LinkedList<String>();
		students.add("Anshul");
		students.add("Rahul");
		students.add("Vicky");
		students.add("Shubham");
	}
	
	List<String> getStudents(){
		return students;
	}
	
	void addItem(String name) {
		students.add(name);
	}
	
	void removeItem(int position) {
		students.remove(position);
	}
}
