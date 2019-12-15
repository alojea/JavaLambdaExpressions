package com.alojea.lambdaPractice;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
	
	public boolean predicateEvenNumbers(int number) {
		
		Predicate<Integer> predicate = (value) -> (value%2==0); 
		return predicate.test(number);
	}
	
	public List<Integer> predicateEvenNumbersInList(List<Integer> lstValues) {
		Predicate<Integer> predicate = (value) -> (value%2==0); 
		return lstValues.stream().filter(predicate).collect(Collectors.toList());	
	}
	

}
