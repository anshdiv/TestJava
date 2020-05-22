package com.example.collections.sets;

import java.util.Iterator;
import java.util.TreeSet;

import com.example.BaseCollection;

/**
 * 
 * @author Anshul Gour
 * 
 * TreeSet store objects in sorted form (Ascending order)
 *
 */
public class PTreeSet implements BaseCollection{

	private TreeSet<String> set;
	
	public PTreeSet(){
		setSet(new TreeSet<String>());
	}

	public TreeSet<String> getSet() {
		return set;
	}

	public void setSet(TreeSet<String> set) {
		this.set = set;
	}
	
	public void createData() {
		set.add("A");
		set.add("D");
		set.add("E");
		set.add("F");
	}
	
	public void remove(String name) {
		set.remove(name);
	}
	
	public void add(String name) {
		set.add(name);
	}
	
	@Override
	public void iterate() {
		 Iterator<String> iterator= set.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
	}
}
