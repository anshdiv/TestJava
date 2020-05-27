package com.example.exceptions;

import com.example.UIUtils;

public class ExceptionDemo {

	public static void main(String ...arg) {
		ExceptionHandling simpleException = new ExceptionHandling();
		UIUtils.addSection("SimpleException Handling");
		simpleException.simpleException();
		
		UIUtils.addSection("Multiple Catches Handling");
		String []array0 = {};
		String []array1 = {"TestArg"};
		String []array2 = {"Arg1","Arg2"};
		simpleException.multipleCatches(array0);
		simpleException.multipleCatches(array1);
		
		UIUtils.addSection("NestedException Handling");
		simpleException.nestedException(array0);
		simpleException.nestedException(array1);
		simpleException.nestedException(array2);
		
		UIUtils.addSection("Throw Exception");
		simpleException.throwException();
		
		UIUtils.addSection("Throws Exception");
		try {
			simpleException.throwsException();
		} catch (IllegalAccessException e) {
		   System.out.println("Handle IllegalAccessException :"+e);
		}
		
		UIUtils.addSection("Custom Exception");
		
		try {
			simpleException.customException(null);
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
	}
}
