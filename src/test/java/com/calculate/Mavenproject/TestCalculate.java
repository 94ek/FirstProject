package com.calculate.Mavenproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculate {
 
	Calculator c = new Calculator();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp()throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		assertEquals(2, c.sum(1, 1), 0);
	    assertEquals(2, c.sum(3, -1), 0);
	    //assertEquals(1.42, c.sum(3.14, -1.72), 0.001);
	   //assertEquals(2.0/3, c.sum(1.0/3, 1.0/3), 0.001);
	}

	@Test
	public void testSubstraction() {
		assertEquals(0, c.substraction(1, 1), 0);
		assertEquals(0, c.substraction(-1, -1), 0);
		assertEquals(-2, c.substraction(-1, 1), 0);
	  //assertEquals(4.86, c.substraction(3.14, -1.72), 0.001);
	   //assertEquals(2.0/3, c.substraction(1.0/3, -1.0/3), 0.001);
	}

	@Test
	public void testMultiply() {
		assertEquals(2, c.multiply(1, 2), 0);
		assertEquals(28, c.multiply(-7, -4), 0);
		assertEquals(-49, c.multiply(-7, 7), 0);
	   // assertEquals(-5.4008, c.multiply(3.14, -1.72), 0.001);
	    //assertEquals(0.111, c.multiply(1.0/3, 1.0/3), 0.001);
	}

	@Test
	public void testDivide() {
		assertEquals(2, c.divide(4, 2), 0);
		assertEquals(0.5, c.divide(4, 8), 0);
	    //assertEquals(-1.826, c.divide(3.14, -1.72), 0.001);
	    //assertEquals(1, c.divide(1.0/3, 1.0/3), 0);
	}

	@Test(expected=ArithmeticException.class)
	public void divideException() {
	    c.divide(4, 0);
	}

}
