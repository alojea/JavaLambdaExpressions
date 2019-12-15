package com.alojea.lambdaPractice.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.SupplierExample;


public class SupplierExampleTest {
	
	SupplierExample supplier;
	
	@Before
	public void setUp() {
		supplier = new SupplierExample();
	}
	
	@Test 
	public void testEmptyList() {
		List<String> values = Arrays.asList();
		assertEquals("List is empty",supplier.evaluateValuesInArray(values));
	}
	
	@Test 
	public void testFistCoincidence() {
		List<String> listValues = Arrays.asList("alejandro","want","to","be","developer");
		Assert.assertEquals("alejandro", supplier.evaluateValuesInArray(listValues));
	}

}
