package com.example.generics;

public class GenericsDemo {

	public static void main(String ...args) {
		
		System.out.println();
		System.out.println("----- Simple Generics ------");
		System.out.println();
		
		SimpleGenerics<Integer> intObj = new SimpleGenerics<Integer>(10);
		SimpleGenerics<String> strObj = new SimpleGenerics<String>("abc");
	    intObj.showType();
	    strObj.showType();
	    intObj.showValue();
	    strObj.showValue();
	    
		System.out.println();
		System.out.println("----- Bounded Generics ------");
		System.out.println();
		
		Integer [] iNums = {1,2,3,4};
		BoundedGenerics<Integer> intBoundObj = new BoundedGenerics<Integer>(iNums);
		System.out.println("Integer Array Average "+intBoundObj.average());
		
		Double [] dNums = {1.0,2.0,3.0,4.0};
		BoundedGenerics<Double> doubleBoundObj = new BoundedGenerics<Double>(dNums);
		System.out.println("Double Array Average "+doubleBoundObj.average());
		
		System.out.println("Average is same : "+doubleBoundObj.isSameAverage(intBoundObj));
		
	}
}
