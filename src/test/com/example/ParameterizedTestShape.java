package test.com.example;






import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import main.com.example.oops.polymorphism.Shape;

@RunWith(Parameterized.class)
public class ParameterizedTestShape {
	
	  // fields used together with @Parameter must be public
    @Parameter(0)
    public double side;
    @Parameter(1)
    public double area;
    
    @Before
    public void before() {
    	System.out.println("Test start");
    }
    
    @After
    public void after() {
    	System.out.println("After Test");
    }


    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 2.0,4.0 }, { 3.0,9.0 }, { 4.0, 16.0} };
        return Arrays.asList(data);
    }


    @SuppressWarnings("deprecation")
	@Test
    public void testArea() {
        Shape shape = new Shape();
        System.out.println(side +" "+area);
        assertEquals(area, shape.getArea(side));
    }


 
}
