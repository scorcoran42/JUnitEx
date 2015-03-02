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
		assertEquals("11 X 5 must be 55", 55, tester.multiply(11, 5));
	}

}
