package com.example.collections.set;

import java.util.LinkedHashSet;

/**
 * 
 * @author Anshul Gour
 * 
 * LinkedHashSet is Similar to HashSet but it maintains the Insertion Order
 *
 */
public class PLinkedHashSet {

	private LinkedHashSet<String> set;
	
	public PLinkedHashSet(){
		setSet(new LinkedHashSet<String>());
	}

	public LinkedHashSet<String> getSet() {
		return set;
	}

	public void setSet(LinkedHashSet<String> set) {
		this.set = set;
	}
	
	public void createData() {
		set.add("Anshul");
		set.add("Rahul");
		set.add("Vicky");
		set.add("Shubham");
	}
	
	public void remove(String name) {
		set.remove(name);
	}
	
	public void add(String name) {
		set.add(name);
	}
}
