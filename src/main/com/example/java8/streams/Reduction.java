package main.com.example.java8.streams;

import java.util.ArrayList;
import java.util.Optional;

public class Reduction {

	public static void main(String ...args) {
		
		ArrayList<Integer> mList = new ArrayList<Integer>();
		mList.add(7);
		mList.add(18);
		mList.add(10);
		mList.add(24);
		mList.add(17);
		mList.add(5);
		
		Optional<Integer> productObj = mList.stream().reduce((a,b) -> a*b);
		Integer productInt = mList.stream().reduce(1, (a,b) -> a*b);
		System.out.println("Product as Optional : "+((productObj.isPresent()== true) ? productObj.get(): 0));
		System.out.println("Product as Integer : "+productInt);

		
	}
}
