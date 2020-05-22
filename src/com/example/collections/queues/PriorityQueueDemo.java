package com.example.collections.queues;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.example.BaseCollection;

public class PriorityQueueDemo implements BaseCollection {


	private PriorityQueue<String> queue;
	
	public PriorityQueueDemo(){
		queue = new PriorityQueue<String>();
	}

	public void createData() {
		queue.add("Anshul");
		queue.add("Rahul");
		queue.add("Vicky");
		queue.add("Shubham");
	}
	
	public String peek() {
		return queue.peek();
	}
	
	public String poll() {
		return queue.poll();
	}
	
	public void add(String name) {
	    queue.add(name);
	}
	

	public PriorityQueue<String> getQueue() {
		return queue;
	}

	public void setQueue(PriorityQueue<String> queue) {
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
