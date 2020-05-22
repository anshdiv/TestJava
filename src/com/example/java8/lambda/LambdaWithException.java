package com.example.java8.lambda;

public interface LambdaWithException<T> {
	T fun(T t) throws EmptyException;
}
