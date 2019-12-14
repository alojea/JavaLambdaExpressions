package com.alojea.lambdaPractice;

import com.alojea.lambdaPractice.interfaces.IMyGeneric;

public class Factorial {
	
	public int calculateFactorial(int number) {
		IMyGeneric<Integer> factorial = (fact) -> {
			
			Integer result = 1;
			
			for(int i=1;i<=fact;i++) {
				result = result * i;
			}
			return result;
		};
		return factorial.compute(number);
	}
	

}
