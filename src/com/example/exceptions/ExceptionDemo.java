package com.example.exceptions;

public class ExceptionDemo {

	public static void main(String ...arg) {
		ExceptionHandling simpleException = new ExceptionHandling();
		System.out.println("----- SimpleException Handling -----");
		simpleException.simpleException();
		
		System.out.println();
		System.out.println("----- Multiple Catches Handling -----");
		System.out.println();
		String []array0 = {};
		String []array1 = {"TestArg"};
		String []array2 = {"Arg1","Arg2"};
		simpleException.multipleCatches(array0);
		simpleException.multipleCatches(array1);
		
		System.out.println();
		System.out.println("----- NestedException Handling -----");
		System.out.println();
		simpleException.nestedException(array0);
		simpleException.nestedException(array1);
		simpleException.nestedException(array2);
		
		System.out.println("----- Throw Exception -----");
		System.out.println();
		simpleException.throwException();
		
		System.out.println("----- Throws Exception -----");
		System.out.println();
		try {
			simpleException.throwsException();
		} catch (IllegalAccessException e) {
		   System.out.println("Handle IllegalAccessException :"+e);
		}
	}
}
