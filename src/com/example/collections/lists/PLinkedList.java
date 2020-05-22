package com.example.collections.lists;

import java.util.Iterator;
import java.util.LinkedList;

import com.example.BaseCollection;

public class PLinkedList implements BaseCollection{

	private LinkedList<String> students;
	
	public PLinkedList() {
		students = new LinkedList<String>();
	}
	
	public void createData() {
		students = new LinkedList<String>();
		students.add("Anshul");
		students.add("Rahul");
		students.add("Vicky");
		students.add("Shubham");
	}
	
	public LinkedList<String> getStudents(){
		return students;
	}
	
	public void addFirst(String name) {
		students.addFirst(name);
	}
	
	public void addLast(String name) {
		students.addLast(name);
	}
	
	public void removeFirst() {
		students.removeFirst();
	}
	
	public void removeLast() {
		students.removeLast();
	}
	
	@Override
	public void iterate() {
		 Iterator<String> iterator= students.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
	}
}
