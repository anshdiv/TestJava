package com.example.stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collecting {

	public static void main(String... arg) {

		ArrayList<NamePhoneEmail> myList = new ArrayList<NamePhoneEmail>();
		myList.add(new NamePhoneEmail("Larry", "555-5555", "larry@gmail.com"));
		myList.add(new NamePhoneEmail("James", "555-4444", "james@gmail.com"));
		myList.add(new NamePhoneEmail("Mary", "555-3333", "mary@gmail.com"));

		Stream<NamePhone> namePhoneStream = myList.stream().map((a) -> new NamePhone(a.name, a.phone));
		List<NamePhone> namePhoneList = namePhoneStream.collect(Collectors.toList());
		namePhoneList.forEach(model -> System.out.println(model.name + " " + model.phone));
		namePhoneStream = namePhoneList.stream();

		String joinedList = namePhoneStream.map((model) -> model.name).collect(Collectors.joining(","));

		System.out.println("Joined List By Collectors : " + joinedList);

		Optional<NamePhone> object = namePhoneList.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().findAny()));

		System.out.println("FindAny : " + (object.isPresent() == true ? object.get().name : "NA"));

		ArrayList<Integer> mList = new ArrayList<Integer>();
		mList.add(7);
		mList.add(18);
		mList.add(10);
		mList.add(24);
		mList.add(17);
		mList.add(5);

		IntSummaryStatistics result = mList.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Average : " + result.getAverage());
		System.out.println("Count : " + result.getCount());
		System.out.println("Max : " + result.getMax());
		System.out.println("Min : " + result.getMin());
		System.out.println("Sum : " + result.getSum());
	}
}
