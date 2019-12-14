package com.alojea.lambdaPractice;

import com.alojea.lambdaPractice.interfaces.IMyGeneric;
import com.alojea.lambdaPractice.interfaces.IRevertString;

public class RevertStringWithGenerics {
	public String revertString(String str) {
		
		IMyGeneric<String> revertString = (revertStr) -> {
			String reverted = "";
			
			for(int i = str.length()-1; i>=0;i--) {
				reverted = reverted + str.charAt(i);  
			}
			return reverted;
		};
		
		return revertString.compute(str);
		
	}
}
