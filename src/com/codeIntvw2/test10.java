package com.codeIntvw2;

public class test10 {

	public static void main(String[] args) {
		// removing junk from string
		
		String s = "å°?ç±³ä½“éªŒç‰ˆ latin string 01234567890";
		String s1 = "@#$@#$@ testing #@^$@#$@#$ Selenium !@#$@#$@# &&&& Java";
		  
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		System.out.println(s1);
		
		// use \\s for replacing white spaces in string

	}

}
