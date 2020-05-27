package com.example.collections.maps;

import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Anshul Gour
 * TreeMap is a SortedMap in which items are sorted in ascending order by default
 */
public class TreeMapDemo {

	private TreeMap<String,String> map;
	
	public TreeMapDemo(){
		map = new TreeMap<String,String>();
	}
	
	public TreeMap<String, String> getMap() {
		return map;
	}



	public void setMap(TreeMap<String, String> map) {
		this.map = map;
	}
	
	public void createData() {
		map.put("1", "Anshul");
		map.put("2", "Rahul");
		map.put("3", "Vicky");
		map.put("4", "Shubham");
	}
	
	public void put(String rollNo, String name) {
		map.put(rollNo, name);
	}
	
	public String get(String rollNo) {
		return map.get(rollNo);
	}
	
	public void show() {
		for (Map.Entry<String, String> item : map.entrySet()) {
			System.out.println("Roll NO: "+item.getKey()+" Name: "+item.getValue());
		}
	}
	

	public void remove(String rollNo) {
		map.remove(rollNo);
	}
}

