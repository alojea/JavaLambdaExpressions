package com.alojea.lambdaPractice.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.alojea.lambdaPractice.ConsumerExample;

public class ConsumerExampleTest {
	
	ConsumerExample consumer;
	
	@Before
	public void setUp() {
		consumer = new ConsumerExample();
	}
	
	@Test 
	public void evaluateConsumer() {
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		consumer.printArray(values);
	}

}
