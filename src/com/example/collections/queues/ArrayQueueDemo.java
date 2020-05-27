package com.example.collections.queues;

import java.util.ArrayDeque;
import java.util.Iterator;

import com.example.BaseCollection;

public class ArrayQueueDemo implements BaseCollection{


	private ArrayDeque<String> queue;
	
	public ArrayQueueDemo(){
		queue = new ArrayDeque<String>();
	}

	public void createData() {
		queue.push("Anshul");
		queue.push("Rahul");
		queue.push("Vicky");
		queue.push("Shubham");
	}
	
	public String pollFirst() {
		return queue.pollFirst();
	}
	
	public void offerFirst(String name) {
		queue.offerFirst(name);
	}
	
	public String pollLast() {
		return queue.pollLast();
	}
	
	public void offerLast(String name) {
		queue.offerLast(name);
	}
	

	public ArrayDeque<String> getQueue() {
		return queue;
	}

	public void setQueue(ArrayDeque<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void iterate() {
		 Iterator<String> iterator= queue.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
	}
}
