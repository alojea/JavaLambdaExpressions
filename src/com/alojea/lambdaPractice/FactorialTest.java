package com.alojea.lambdaPractice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.Factorial;

public class FactorialTest {
	
	Factorial factorial;
	
	@Before
	public void setUp() {
		factorial = new Factorial();
	}
	
	@Test 
	public void evaluateFactorial() {
		assertEquals(120,factorial.calculateFactorial(5));
	}

}
