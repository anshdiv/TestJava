package main.com.example.java8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Mapping {

	public static void main(String ...args) {
		
		ArrayList<NamePhoneEmail> myList = new ArrayList<NamePhoneEmail>();
		myList.add(new NamePhoneEmail("Larry","555-5555","larry@gmail.com"));
		myList.add(new NamePhoneEmail("James","555-4444","james@gmail.com"));
		myList.add(new NamePhoneEmail("Mary","555-3333","mary@gmail.com"));
		
		System.out.println("Original List : ");
		myList.stream().forEach((a)-> System.out.println(a.name+" "+a.phone+" "+a.email));
		
		Stream<NamePhone> namePhone  = myList.stream().map((a) -> new NamePhone(a.name,a.phone));

		System.out.println("Modified List : ");
		namePhone.forEach((a)-> System.out.println(a.name+" "+a.phone));
	}
}
