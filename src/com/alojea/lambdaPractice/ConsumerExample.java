package com.alojea.lambdaPractice;

import java.util.List;
import java.util.function.Consumer;

//@FunctionalInterface
//public interface Consumer {
//  void accept(T t);
//}

public class ConsumerExample {
	
	public void printArray(List<Integer> values) {
		
		Consumer<List<Integer>> consumer = (value) -> System.out.println(value);
		consumer.accept(values);
	}
		

}
