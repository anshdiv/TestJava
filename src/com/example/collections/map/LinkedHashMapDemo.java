package com.example.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author Anshul Gour
 * LinkedHashMap maintain the insertion order.
 */
public class LinkedHashMapDemo {

	private LinkedHashMap<String,String> map;
	
	public LinkedHashMapDemo(){
		map = new LinkedHashMap<String,String>();
	}
	
	public LinkedHashMap<String, String> getMap() {
		return map;
	}

	public void setMap(LinkedHashMap<String, String> map) {
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

