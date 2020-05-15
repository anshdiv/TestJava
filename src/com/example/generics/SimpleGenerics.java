package com.example.generics;

public class SimpleGenerics<T> {

	T arg;

	public SimpleGenerics(T arg){
		this.arg=arg;
	}
	
	public void showValue() {
		System.out.println("Value: "+arg);
	}
	
	public void showType() {
		System.out.println("Type of Arg "+arg.getClass().getName());
	}
}
