package com.alojea.lambdaPractice;

import com.alojea.lambdaPractice.interfaces.IMyGreeting;

public class MyGreeting {
	
	public String morning(String name) {
		IMyGreeting myGreeting = (str)-> "Good Morning " + str;
		return myGreeting.processName(name);
	}
	
	public String evening(String name) {
		IMyGreeting myGreeting = (str)-> "Good Evening " + str;
		return myGreeting.processName(name);
	}
	
	public String night(String name) {
		IMyGreeting myGreeting = (str)-> "Good Night " + str;
		return myGreeting.processName(name);
	}

}
