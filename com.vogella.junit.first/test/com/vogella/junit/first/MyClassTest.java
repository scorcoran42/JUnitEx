package com.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class MyClassTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		MyClass tester = new MyClass();
		tester.multiply(1000, 5);
	}
	
	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("10 X 5 must be 50", 50, tester.multiply(10, 5));
	}

}
