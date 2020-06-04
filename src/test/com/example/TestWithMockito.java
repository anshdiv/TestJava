package test.com.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Captor;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import main.com.example.serialization.Student;

public class TestWithMockito {

	@Test
	public void test1() {
		Student student = mock(Student.class);
		when(student.getName()).thenReturn("Anshul");
		assertEquals(student.getName(), "Anshul");
		assertEquals(student.getClassName(), null);
		assertEquals(student.getRollNo(), null);
	}

	@Test
	public void testMultipleReturnValue() {
		Iterator<String> iterator = mock(Iterator.class);
		when(iterator.next()).thenReturn("First").thenReturn("Second");
		assertEquals(iterator.next(), "First");
		assertEquals(iterator.next(), "Second");
	}

	@Test
	public void testReturnValueDependentOnMethodParameter() {
		Comparable<String> comparable = mock(Comparable.class);
		when(comparable.compareTo("Mockito")).thenReturn(1);
		when(comparable.compareTo("Java")).thenReturn(2);
		assertEquals(1, comparable.compareTo("Mockito"));
		assertEquals(2, comparable.compareTo("Java"));
	}

	@Test
	public void testValueBasedOnType() {
		Comparable<Student> c = mock(Comparable.class);
		when(c.compareTo(isA(Student.class))).thenReturn(1);
		Student student = mock(Student.class);
		assertEquals(1, c.compareTo(student));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testThrowException() {
		Student student = mock(Student.class);
		when(student.getClassName()).thenThrow(new IllegalArgumentException());
		student.getClassName();
	}

	@Test
	public void testSpyVsMock() {

		List<String> list = new ArrayList<String>();
		List<String> mockList = mock(ArrayList.class);
		List<String> spyList = spy(list);

		mockList.add("Anshul");
		spyList.add("Anshul");

		// Mock list only show that method is called, but real method was not called
		// internally
		assertEquals(0, mockList.size());

		// Spy actually call the real methods
		assertEquals(1, spyList.size());

	}

	@Test
	public void verifyMethodCalls() {

		Student student = mock(Student.class);
		when(student.getName()).thenReturn("Anshul");
		student.setRollNo("12");
		student.getName();
		student.getName();

		verify(student).setRollNo(ArgumentMatchers.eq("12"));
		verify(student, times(2)).getName();
		verify(student, never()).getClassName();
		verify(student, atLeast(1)).getName();
		assertEquals(null, student.getRollNo());

	}

	@Captor
	private ArgumentCaptor<String> captor;
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Test
	public void verifyCaptor() {
		Student student = mock(Student.class);
		student.setRollNo("12");
		verify(student).setRollNo(captor.capture());

		assertEquals("12", captor.getValue());
	}
}
