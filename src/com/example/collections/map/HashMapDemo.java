package com.example.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Anshul Gour
 * Hashmap works on hashing technique. This will not assure the order.
 */
public class HashMapDemo {

	private HashMap<String,String> map;

	public HashMapDemo(){
		map = new HashMap<String,String>();
	}
		
	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
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

