package com.alojea.lambdaPractice.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.PredicateExample;

public class PredicateExampleTest {
	

	PredicateExample predicate;
	
	@Before
	public void setUp(){
		predicate = new PredicateExample();
		
	}

	@Test
	public void testIsEvenNumber() {
		assertTrue(predicate.predicateEvenNumbers(2));
	}
	
	@Test
	public void testPredicateEvenNumbersInList() {
		List<Integer> lstValues = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> lstEvenValues = Arrays.asList(2,4,6,8);
		Assert.assertEquals(lstEvenValues, predicate.predicateEvenNumbersInList(lstValues));
	}

	

}
