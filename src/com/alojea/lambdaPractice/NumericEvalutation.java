package com.alojea.lambdaPractice;

import com.alojea.lambdaPractice.interfaces.NumericEvaluation;

public class NumericEvalutation {
	
	public boolean isEven(int number) {
		NumericEvaluation isEven = (n)->(n%2)==0;
		return isEven.evaluate(number);
	}
	
	public boolean isOdd(int number) {
		NumericEvaluation isOdd = (n)->(n%2)!=0;
		return isOdd.evaluate(number);
	}
	
	public boolean isNegative(int number) {
		NumericEvaluation isNegative = (n)->(n<0);
		return isNegative.evaluate(number);
	}
	
	public boolean isZero(int number) {
		NumericEvaluation isZero = (n)->(n==0);
		return isZero.evaluate(number);
	}

}
