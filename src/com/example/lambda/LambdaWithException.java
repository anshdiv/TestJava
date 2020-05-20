package com.example.lambda;

public interface LambdaWithException<T> {
	T fun(T t) throws EmptyException;
}
