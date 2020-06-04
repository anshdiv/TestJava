package main.com.example.generics;

public class BoundedGenerics<T extends Number> {

	T[] arg;
	
	public BoundedGenerics(T[] arg){
		this.arg=arg;
	}
	
	public void showValue() {
		System.out.println("Value: "+arg);
	}
	
	public double average() {
		double sum=0.0;
		for(int i=0;i<arg.length;i++) {
			sum+=arg[i].doubleValue();
		}
		return sum;
	}
	
	
	public void showType() {
		System.out.println("Type of Arg "+arg.getClass().getName());
	}
	
	public boolean isSameAverage(BoundedGenerics<?> obj1) {
		return average()==obj1.average();
	}
}
