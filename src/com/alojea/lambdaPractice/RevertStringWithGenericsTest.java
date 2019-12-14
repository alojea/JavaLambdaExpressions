package com.alojea.lambdaPractice.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.RevertStringWithGenerics;

public class RevertStringWithGenericsTest {
	
	RevertStringWithGenerics revertString;
	
	@Before
	public void setUp() {
		revertString = new RevertStringWithGenerics();
	}
	
	@Test
	public void testRevertNormalString() {
		assertEquals("ordnajela",revertString.revertString("alejandro"));
		
	}

}
