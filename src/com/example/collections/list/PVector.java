package com.example.collections.list;

import java.util.Iterator;
import java.util.Vector;

import com.example.BaseCollection;

public class PVector implements BaseCollection{

	private Vector<String> students;
	
	PVector(){
		createData();
	}
	
	public void createData() {
		students = new Vector<String>();
		students.add("Anshul");
		students.add("Rahul");
		students.add("Vicky");
		students.add("Shubham");
	}
	
	public Vector<String> getStudents(){
		return students;
	}
	
	public void addItem(String name) {
		students.add(name);
	}
	
	public void removeItem(int position) {
		students.remove(position);
	}
	
	@Override
	public void iterate() {
		 Iterator<String> iterator= students.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
	}
	
}
