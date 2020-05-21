package com.example.stream;

import java.util.ArrayList;
import java.util.Optional;

public class ParallelStream {

	public static void main(String ...args) {
		
		ArrayList<Integer> mList = new ArrayList<Integer>();
		mList.add(7);
		mList.add(18);
		mList.add(10);
		mList.add(24);
		mList.add(17);
		mList.add(5);
		
		Optional<Integer> productObj = mList.parallelStream().reduce((a,b) -> a*b);
		
		/**
		 *  Third argument in reduce method is combiner i.e how the two streams will combine.
		 *  In the given use case the combiner is same as accumulator which may defer depends on the use case.
		 */
		Integer productInt = mList.parallelStream().reduce(1, (a,b) -> a*b,(a,b) -> a*b);
		System.out.println("Product With Parallel Stream as Optional : "+((productObj.isPresent()== true) ? productObj.get(): 0));
		System.out.println("Product With Parallel Stream as Integer : "+productInt);
	}
}
