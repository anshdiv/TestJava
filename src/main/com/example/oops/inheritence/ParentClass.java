package main.com.example.oops.inheritence;

public class ParentClass {

	protected int i;
	protected int j;
	
	ParentClass(int i,int j){
		this.i=i;
		this.j=j;
	}
	
	public void showValues() {
		System.out.println("Value of I: "+i+" and Value of J: "+j);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	
}
