package com.example.lambda;

public class LambdaDemo {

	public static void main(String... args) throws EmptyException {

		NumericTest isEven = n -> (n % 2) == 0;
		NumericTest isNonNeg = n -> n >= 0;

		System.out.println("---- Simple Lambda Expression ----");
		if (isEven.test(10))
			System.out.println("10 is Even");
		if (isEven.test(9))
			System.out.println("9 is not Even");

		if (isNonNeg.test(1))
			System.out.println("1 is Positive");
		if (isNonNeg.test(-1))
			System.out.println("-1 is Negative");

		System.out.println();
		System.out.println("---- Lambda Expression with multiple params ----");
		System.out.println();

		NumericTest2 isFactor = (n, d) -> (n % d) == 0;
		if (isFactor.test(10, 2))
			System.out.println("2 is factor of 10");

		System.out.println();
		System.out.println("---- Block Lambda Expression ----");
		System.out.println();

		NumericFunc factorial = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		};
		
		System.out.println("Factorial of 3 is: "+factorial.func(3));
		System.out.println("Factorial of 5 is: "+factorial.func(5));
		

		System.out.println();
		System.out.println("---- Generic Lambda Expression ----");
		System.out.println();
		
		GenericLambda<String> reverse = str->{
			String result="";
			for (int i = str.length()-1; i >= 0; i--) {
				result+=str.charAt(i);
			}
			return result;
		};
		
		GenericLambda<Integer> genericfactorial = n->{
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		};
		
		System.out.println("Factorial of 3 is: "+genericfactorial.fun(3));
		System.out.println("Reverse of Anshul: "+reverse.fun("Anshul"));
		
		System.out.println();
		System.out.println("---- Pass Lambda as Argument ----");
		System.out.println();
		
		System.out.println("Reverse of Anshul: "+stringOp(reverse, "Anshul"));
		
		System.out.println();
		System.out.println("---- Lambda with Exception ----");
		System.out.println();
		
		LambdaWithException<String> stringLambda= str -> {
			if (str.isEmpty()) {
				throw new EmptyException("String is Empty");
			}
			return str;
		};
		
		System.out.println("Lambda with Exception: "+stringLambda.fun("Anshul"));
		
		System.out.println();
		System.out.println("---- Method Reference to static method ----");
		System.out.println();
		System.out.println("Reverse of Lambdas add power to Java: "+reverseStringOps(MyStringOps::strReverse, "Lambdas add power to Java"));
	
		System.out.println();
		System.out.println("---- Method Reference to instance method ----");
		System.out.println();
		MyStringOps myStrOps = new MyStringOps();
		System.out.println("Reverse of Lambdas add power to Java: "+reverseStringOps(myStrOps::instanceStrReverse, "Lambdas add power to Java"));	
		
		System.out.println();
		System.out.println("---- Instance Method Reference with Different Object ----");
		System.out.println();
		
		HighTemp [] weekHighDays = {new HighTemp(89),new HighTemp(82),new HighTemp(90),new HighTemp(89),new HighTemp(89),new HighTemp(91),new HighTemp(84)};
	    int count = counter(weekHighDays, HighTemp::isSameTemp, new HighTemp(89));
	    System.out.println(count+ "days had a high of 89");
	
	    System.out.println();
		System.out.println("---- Constructor Reference with Generics ----");
		System.out.println();
		
		MyFuncCons<MyClass<String>, String> myStringCons = MyClass::new; 
		MyFuncCons<MyClass<Integer>, Integer> myIntegerCons = MyClass::new; 
		MyClass<String> myStringClass = myClassFactory(myStringCons, "Anshul");
		MyClass<Integer> myIntegerClass = myClassFactory(myIntegerCons, 100);
		System.out.println("Value by Constructor Reference of String : "+myStringClass.getVal());
		System.out.println("Value by Constructor Reference of Integer : "+myIntegerClass.getVal());
	}
	
	static String stringOp(GenericLambda<String> strFunc,String str) {
		return strFunc.fun(str);
	}
	
	static String reverseStringOps(StringFunc strFunc,String str) {
		return strFunc.func(str);
	}
	
	static <R,T> R myClassFactory(MyFuncCons<R, T> cons,T value) {
		return cons.func(value);
	}
	
	static<T> int counter(T[] vals,MyFunc<T> f,T v) {
		int count=0;
		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], v)) count++;
		}
		return count;
	}
}
