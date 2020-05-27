package com.example.exceptions;

public class ExceptionHandling {

	public void simpleException() {
		int a, d;
		try {
			d = 0;
			a = 24 / d;
			System.out.println("Value of " + a);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero");
		}
	}

	public void multipleCatches(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;

		} catch (ArithmeticException e) {
			System.out.println("Division by zero :" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index oob :" + e);
		}

		System.out.println("After try/catch block");
	}

	public void exceptionWithFinally(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;

		} catch (ArithmeticException e) {
			System.out.println("Division by zero :" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index oob :" + e);
		} finally {
			System.out.println("Finally");
		}

		System.out.println("After try/catch block");
	}

	public void nestedException(String[] args) {
		try {
			int a = args.length;
			System.out.println("a = " + a);

			try {
				if (a == 1) a = a / (a - a);
				
				if(a==2) {
					int b = 42 / a;
					int c[] = { 1 };
					c[42] = 99;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index out of bound"+ e);
			}
	
		} catch (ArithmeticException e) {
			System.out.println("Division by zero :" + e);
		}finally {
			System.out.println("Finally");
		}

		System.out.println("After try/catch block");
	}
	
	public void throwException() {
		try {
			throw new NullPointerException("Throw Exception Demo");
		} catch (NullPointerException e) {
			System.out.println("Handle NullPointerException");
		}
	}
	
	public void throwsException() throws IllegalAccessException {
		throw new IllegalAccessException("Throw IllegalException Demo");
	}
	
	
	public void customException(String name) throws NameNotFoundException {
		if(name==null) {
			throw new NameNotFoundException("Name cannot be null");
		}else {
			System.out.println(name);
		}
	}
	
}
