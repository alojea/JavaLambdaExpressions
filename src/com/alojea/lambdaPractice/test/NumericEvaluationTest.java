package com.alojea.lambdaPractice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.NumericEvalutation;

public class NumericEvaluationTest {
	
	NumericEvalutation numericEvaluation;
	
	@Before
	public void setUp(){
		numericEvaluation = new NumericEvalutation();
		
	}

	@Test
	public void testEven() {
		assertTrue(numericEvaluation.isEven(2));
	}
	
	@Test
	public void testOdd() {
		assertTrue(numericEvaluation.isOdd(1));
	}
	
	@Test
	public void testNegative() {
		assertTrue(numericEvaluation.isNegative(-1));
	}
	
	@Test
	public void testZero() {
		assertTrue(numericEvaluation.isZero(0));
	}

}
