package com.example;

import com.example.collections.list.PArrayList;
import com.example.collections.list.PLinkedList;

public class Main {

	public static void main(String args []) {
		
		System.out.println("------- ArrayList ------");
		
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
		System.out.println();
		System.out.println();
        System.out.println("------- LinkedList ------");
		
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
	}
}
