package main.com.example.collections.sets;

import java.util.HashSet;
import java.util.Iterator;

import main.com.example.BaseCollection;
/**
 * 
 * @author Anshul Gour
 * 
 * HashSet store value with Hashing technique hence printing values doesn't assure the sequence.
 *
 */
public class PHashSet implements BaseCollection{

	private HashSet<String> set;
	
	public PHashSet(){
		setSet(new HashSet<String>());
	}

	public HashSet<String> getSet() {
		return set;
	}

	public void setSet(HashSet<String> set) {
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
	
	@Override
	public void iterate() {
		 Iterator<String> iterator= set.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
	}
}
