package com.baseCollection;

public class reverseString {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Mohit");
		//System.out.println(sb.reverse());
		String reverse="";
		for(int i=sb.length()-1 ; i>=0;i--)
				{			
			reverse= reverse + sb.charAt(i)	;						
				}
		System.out.println(reverse);
	}
}
