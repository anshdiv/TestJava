package com.example;

import com.example.collections.list.PArrayList;
import com.example.collections.list.PLinkedList;
import com.example.collections.queue.ArrayQueueDemo;
import com.example.collections.queue.PriorityQueueDemo;
import com.example.collections.set.PHashSet;
import com.example.collections.set.PLinkedHashSet;
import com.example.collections.set.PTreeSet;

public class Main {

	public static void main(String args []) {
		
		System.out.println();
        System.out.println("------- ArrayList ------");
        System.out.println();
        
		PArrayList pList = new PArrayList();
		System.out.println(" Initial Size of List "+pList.getStudents().size());
		pList.createData();
		System.out.println("Size of List After adding data"+pList.getStudents().size());
		System.out.println("Data ");
		pList.iterate();
		pList.addItem("New Student");
		System.out.println("Data after adding New Students");
		pList.iterate();
		pList.removeItem(2);
		System.out.println("Data after removing 2 index item");
		pList.iterate();
		pList.addItem(3,"New Student At 3");
		System.out.println("Data after adding New Students at 3rd Index");
		pList.iterate();
		pList.removeItem("Shubham");
		System.out.println("Data after removing Shubham");
		pList.iterate();
	
		System.out.println();
        System.out.println("------- LinkedList ------");
        System.out.println();
		
        PLinkedList pLinkedList = new PLinkedList();
		System.out.println(" Initial Size of List "+pLinkedList.getStudents().size());
		pLinkedList.createData();
		System.out.println("Size of List After adding data"+pLinkedList.getStudents().size());
		System.out.println("Data");
		pLinkedList.iterate();
		pLinkedList.addFirst("First Student");
		System.out.println("Data after adding First Students");
		pLinkedList.iterate();
		pLinkedList.removeLast();
		System.out.println("Data after removing last Item");
		pLinkedList.iterate();
		pLinkedList.addLast("Last Student");
		System.out.println("Data after adding Student at Last");
		pLinkedList.iterate();
		pLinkedList.removeFirst();
		System.out.println("Data after removing First Item");
		

		System.out.println();
        System.out.println("------- HashSet ------");
        System.out.println();
        
        
        PHashSet pHashSet = new PHashSet();
		System.out.println(" Initial Size of Set "+pHashSet.getSet().size());
		pHashSet.createData();
		System.out.println("Size of Set After adding data"+pHashSet.getSet().size());
		System.out.println("Data ");
		pHashSet.iterate();
		pHashSet.add("New Item");
		System.out.println("Data after adding New Item");
		pHashSet.iterate();
		pHashSet.remove("Anshul");
		System.out.println("Data after removing Anshul");
		pHashSet.iterate();
		
		
		System.out.println();
        System.out.println("------- LinkedHashSet ------");
        System.out.println();
        
        
        PLinkedHashSet pLinkedHashSet = new PLinkedHashSet();
		System.out.println(" Initial Size of Set "+pLinkedHashSet.getSet().size());
		pLinkedHashSet.createData();
		System.out.println("Size of Set After adding data");
		System.out.println("Data ");
		pLinkedHashSet.iterate();
		pLinkedHashSet.add("New Item");
		System.out.println("Data after adding New Item");
		pLinkedHashSet.iterate();
		pLinkedHashSet.remove("Anshul");
		System.out.println("Data after removing Anshul");
		pLinkedHashSet.iterate();
		
		System.out.println();
        System.out.println("------- TreeSet ------");
        System.out.println();
        
        
        PTreeSet pTreeSet = new PTreeSet();
		System.out.println(" Initial Size of Set "+pTreeSet.getSet().size());
		pTreeSet.createData();
		System.out.println("Size of Set After adding data"+pTreeSet.getSet().size());
		System.out.println("Data ");
		pTreeSet.iterate();
		pTreeSet.add("New Item");
		System.out.println("Data after adding New Item");
		pTreeSet.iterate();
		pTreeSet.remove("E");
		System.out.println("Data after removing E");
		pTreeSet.iterate();
		
		System.out.println();
        System.out.println("------- Priority Queue ------");
        System.out.println();
        
        
        PriorityQueueDemo pQueueDemo = new PriorityQueueDemo();
		System.out.println(" Initial Size of Queue "+pQueueDemo.getQueue().size());
		pQueueDemo.createData();
		System.out.println("Size of Queue After adding data"+pQueueDemo.getQueue().size());
		System.out.println("Data ");
		pQueueDemo.iterate();
		pQueueDemo.add("New Item");
		System.out.println("Peek - "+pQueueDemo.peek());
		System.out.println("Data after Peek");
		pQueueDemo.iterate();
		System.out.println("Poll - "+pQueueDemo.poll());
		System.out.println("Data after Poll");
		pQueueDemo.iterate();
		
		
		System.out.println();
        System.out.println("------- ArrayDeQueue ------");
        System.out.println();
        
        
        ArrayQueueDemo arrayDeque = new ArrayQueueDemo();
		System.out.println(" Initial Size of Queue "+arrayDeque.getQueue().size());
		arrayDeque.createData();
		System.out.println("Size of Queue After adding data"+arrayDeque.getQueue().size());
		System.out.println("Data ");
		arrayDeque.iterate();
		arrayDeque.offerFirst("First");
		System.out.println("Data after adding First");
		arrayDeque.iterate();
		arrayDeque.offerLast("Last");
		System.out.println("Data after adding Last");
		arrayDeque.iterate();
		arrayDeque.pollFirst();
		System.out.println("Data after removing First");
		arrayDeque.iterate();
		arrayDeque.pollLast();
		System.out.println("Data after removing Last");
		arrayDeque.iterate();
	}
}
