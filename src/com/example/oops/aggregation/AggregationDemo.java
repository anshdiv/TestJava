package com.example.oops.aggregation;

import com.example.UIUtils;

public class AggregationDemo {

	public static void main(String[] args) {
		UIUtils.addSection("Aggregation");
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("gno", "UP", "india");

		Employee e = new Employee(111, "varun", address1);
		Employee e2 = new Employee(112, "arun", address2);

		e.toString();
		e2.toString();

	}
}
