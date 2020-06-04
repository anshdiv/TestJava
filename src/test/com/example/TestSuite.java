package test.com.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses(value = { TestShape.class,ParameterizedTestShape.class })
@RunWith(Suite.class)
public class TestSuite {

}
