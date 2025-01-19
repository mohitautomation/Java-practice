package com.basicpractice;

public class wrapperM {

	public static void main(String[] args) {
		
		
		int i = 7;  // primitive data type
		Integer ii = new Integer(i);  // wrapping or boxing
		Integer j = ii.intValue(); // unboxing or unwrapping
		Integer value = i;  // Autoboxing or Autowrapping		
		Integer k = value; // Autounboxing or Autounwrapping
		
		
		String str = "12345";
		int intV = Integer.parseInt(str);
		System.out.println(intV);
		

	}

}
