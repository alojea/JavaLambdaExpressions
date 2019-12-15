package com.alojea.lambdaPractice;

import java.util.List;

//@FunctionalInterface
//public interface Consumer {
//  void accept(T t);
//}

public class Consumer {
	
	public void printArray(List<Integer> values) {
		values.forEach(i -> System.out.println(i));
	}

}
