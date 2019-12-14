package com.alojea.lambdaPractice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.StringComparator;

public class StringComparatorTest {
	
	StringComparator stringComparator;
	
	@Before
	public void setUp() {
		stringComparator = new StringComparator();
	}
	
	@Test
	public void equalTest() {
		assertTrue(stringComparator.compareStrings("alejandro", "alejandro") == 0);
	}

}
