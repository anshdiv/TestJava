package main.com.example.generics;

public class WildCartGenerics<T extends Number> {

	T[] arg;

	public WildCartGenerics(T[] arg) {
		this.arg = arg;
	}

	public void showValue() {
		System.out.println("Value: " + arg);
	}

	public double average() {
		double sum = 0.0;
		for (int i = 0; i < arg.length; i++) {
			sum += arg[i].doubleValue();
		}
		return sum;
	}

	public boolean isSameAverage(WildCartGenerics<?> obj1) {
		return average()==obj1.average();
	}

	public void showType() {
		System.out.println("Type of Arg " + arg.getClass().getName());
	}
}
