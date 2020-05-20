package com.example.lambda;

public class HighTemp {

	private int hTemp;
	
	HighTemp(int ht){
		hTemp=ht;
	}
	
	boolean isSameTemp(HighTemp ht2) {
		return hTemp==ht2.hTemp;
	}
	
	boolean isLessThanTemp(HighTemp ht2) {
		return hTemp<ht2.hTemp;
	}
}
