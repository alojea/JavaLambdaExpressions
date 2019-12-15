package com.alojea.lambdaPractice;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	
	public String evaluateValuesInArray(List<String> lstValues) {
		
		Supplier<String> supplier = ()-> "List is empty";
		return lstValues.stream().findFirst().orElseGet(supplier);
		
	}

}
