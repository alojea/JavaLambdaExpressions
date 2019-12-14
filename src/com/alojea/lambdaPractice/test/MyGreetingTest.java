package com.alojea.lambdaPractice.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.MyGreeting;

public class MyGreetingTest {
	
	MyGreeting myGreeting;
	
	@Before
	public void setUp(){
		myGreeting = new MyGreeting();
		
	}

	@Test
	public void testMorning() {
		assertEquals("Good Morning Alejandro",myGreeting.morning("Alejandro"));
	}

	@Test
	public void testEvening() {
		assertEquals("Good Evening Alejandro",myGreeting.evening("Alejandro"));
	}

	@Test
	public void testNight() {
		assertEquals("Good Night Alejandro",myGreeting.night("Alejandro"));
	}

	
}
