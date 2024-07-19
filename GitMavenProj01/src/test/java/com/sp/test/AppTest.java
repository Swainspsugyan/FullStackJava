package com.sp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sp.service.Arithmetic;

public class AppTest {
	
	
	
	@Test
	public void TestWithPositive() {
		Arithmetic ar = new Arithmetic();
		int expected = 300 ;
		int actual 	 = ar.sum(100, 200);
		assertEquals(expected, actual);
		
	}
	@Test
	public void TestWithNegetive() {
		Arithmetic ar = new Arithmetic();
		int expected = -300 ;
		int actual 	 = ar.sum(-100, -200);
		assertEquals(expected, actual);
		
	}
	@Test
	public void TestWithZero() {
		Arithmetic ar = new Arithmetic();
		int expected = -0 ;
		int actual 	 = ar.sum(0, 0);
		assertEquals(expected, actual);
		
	}
	
}
