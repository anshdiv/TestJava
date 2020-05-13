package com.example;

import com.example.collections.list.PArrayList;
import com.example.collections.list.PLinkedList;
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
		System.out.println("Data "+pList.getStudents().toString());
		pList.addItem("New Student");
		System.out.println("Data after adding New Students"+pList.getStudents().toString());
		pList.removeItem(2);
		System.out.println("Data after removing 2 index item"+pList.getStudents().toString());
		pList.addItem(3,"New Student At 3");
		System.out.println("Data after adding New Students at 3rd Index"+pList.getStudents().toString());
		pList.removeItem("Shubham");
		System.out.println("Data after removing Shubham"+pList.getStudents().toString());
	
		System.out.println();
        System.out.println("------- LinkedList ------");
        System.out.println();
		
        PLinkedList pLinkedList = new PLinkedList();
		System.out.println(" Initial Size of List "+pLinkedList.getStudents().size());
		pLinkedList.createData();
		System.out.println("Size of List After adding data"+pLinkedList.getStudents().size());
		System.out.println("Data "+pLinkedList.getStudents().toString());
		pLinkedList.addFirst("First Student");
		System.out.println("Data after adding First Students"+pLinkedList.getStudents().toString());
		pLinkedList.removeLast();
		System.out.println("Data after removing last Item"+pLinkedList.getStudents().toString());
		pLinkedList.addLast("Last Student");
		System.out.println("Data after adding Student at Last"+pLinkedList.getStudents().toString());
		pLinkedList.removeFirst();
		System.out.println("Data after removing First Item"+pLinkedList.getStudents().toString());
		

		System.out.println();
        System.out.println("------- HashSet ------");
        System.out.println();
        
        
        PHashSet pHashSet = new PHashSet();
		System.out.println(" Initial Size of Set "+pHashSet.getSet().size());
		pHashSet.createData();
		System.out.println("Size of Set After adding data"+pHashSet.getSet().size());
		System.out.println("Data "+pHashSet.getSet().toString());
		pHashSet.add("New Item");
		System.out.println("Data after adding New Item"+pHashSet.getSet().toString());
		pHashSet.remove("Anshul");
		System.out.println("Data after removing Anshul"+pHashSet.getSet().toString());
		
		
		System.out.println();
        System.out.println("------- LinkedHashSet ------");
        System.out.println();
        
        
        PLinkedHashSet pLinkedHashSet = new PLinkedHashSet();
		System.out.println(" Initial Size of Set "+pLinkedHashSet.getSet().size());
		pLinkedHashSet.createData();
		System.out.println("Size of Set After adding data"+pLinkedHashSet.getSet().size());
		System.out.println("Data "+pLinkedHashSet.getSet().toString());
		pLinkedHashSet.add("New Item");
		System.out.println("Data after adding New Item"+pLinkedHashSet.getSet().toString());
		pLinkedHashSet.remove("Anshul");
		System.out.println("Data after removing Anshul"+pLinkedHashSet.getSet().toString());
		
		
		System.out.println();
        System.out.println("------- TreeSet ------");
        System.out.println();
        
        
        PTreeSet pTreeSet = new PTreeSet();
		System.out.println(" Initial Size of Set "+pTreeSet.getSet().size());
		pTreeSet.createData();
		System.out.println("Size of Set After adding data"+pTreeSet.getSet().size());
		System.out.println("Data "+pTreeSet.getSet().toString());
		pTreeSet.add("New Item");
		System.out.println("Data after adding New Item"+pTreeSet.getSet().toString());
		pTreeSet.remove("E");
		System.out.println("Data after removing E"+pTreeSet.getSet().toString());
	}
}
