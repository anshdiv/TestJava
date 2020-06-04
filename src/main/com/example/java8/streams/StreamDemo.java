package main.com.example.java8.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String ...args) {
		
		ArrayList<Integer> mList = new ArrayList<Integer>();
		mList.add(7);
		mList.add(20);
		mList.add(1);
		mList.add(4);
		mList.add(2);
		mList.add(89);

		System.out.println("Original List : " + mList);

		Stream<Integer> mStream = mList.stream();

		Optional<Integer> max = mStream.max(Integer::compare);
		if (max.isPresent()) {
			System.out.println("Max value : " + max.get());
		}

		mStream = mList.stream();

		Optional<Integer> min = mStream.min(Integer::compare);
		if (max.isPresent()) {
			System.out.println("Min value : " + min.get());
		}

		Stream<Integer> sortedStream = mList.stream().sorted();
		System.out.println("Sorted List : ");
		sortedStream.forEach(System.out::println);
		
		Stream<Integer> oddVals = mList.stream().sorted().filter(n -> (n % 2) == 1);
		System.out.println("Odd Values : ");
		oddVals.forEach(System.out::println);

	}
}
