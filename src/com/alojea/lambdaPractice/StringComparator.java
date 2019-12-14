package com.alojea.lambdaPractice;

import java.util.Comparator; 



public class StringComparator {
	
	public int compareStrings(String s1, String s2) {
		Comparator<String> stringComparator = (String str1, String str2)-> s1.compareTo(s2);
		return stringComparator.compare(s1, s2);
	}

}
