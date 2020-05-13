package com.example.collections.list;

import java.util.ArrayList;
import java.util.List;

public class PArrayList {

	private ArrayList<String> students;
	
	public PArrayList(){
		students = new ArrayList<String>();
	}
	
	public void createData() {
		students.add("Anshul");
		students.add("Rahul");
		students.add("Vicky");
		students.add("Shubham");
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
	
	public void removeItem(String name) {
		students.remove(name);
	}
	
	public void addItem(int position,String name) {
		students.add(position, name);
	}
	
}
