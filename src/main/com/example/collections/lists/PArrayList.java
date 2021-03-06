package main.com.example.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.com.example.BaseCollection;

public class PArrayList implements BaseCollection {

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

	@Override
	public void iterate() {
		 Iterator<String> iterator= students.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
	}
		
}
