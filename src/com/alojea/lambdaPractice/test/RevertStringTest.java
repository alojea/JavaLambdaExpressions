package com.alojea.lambdaPractice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.RevertString;

public class RevertStringTest {
	
	RevertString revertString;
	
	@Before
	public void setUp() {
		revertString = new RevertString();
	}
	
	@Test
	public void testRevertNormalString() {
		assertEquals("ordnajela",revertString.revertString("alejandro"));
		
	}

}
