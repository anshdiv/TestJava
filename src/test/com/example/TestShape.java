package test.com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.com.example.oops.polymorphism.Shape;

public class TestShape {

	@SuppressWarnings("deprecation")
	@Test
	public void whenSideIs5ThenAreaOfSquareShouldBe() {
		System.out.println("TestShape");
		Shape shape = new Shape();
		assertEquals(25, shape.getArea(5));
	}
}
