package com.nt.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	/*
	 * @Test public void shouldAnswerWithTrue() { assertTrue( true ); }
	 */
	@Test
	public void testWithNegetives() {
		int a = -10;
		int b = -20;
		int expected = -30;
		App obj = new App();
		int actual = obj.sum(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void testWithPosities() {
		int a = 10;
		int b = 20;
		int expected = 30;
		App obj = new App();
		int actual = obj.sum(a, b);
		assertEquals(expected, actual);
	}
	@Test
	public void testWithMixed() {
		int a = 10;
		int b = -20;
		int expected = -10;
		App obj = new App();
		int actual = obj.sum(a, b);
		assertEquals(expected, actual);
	}
}
