package com.programming;

public class pract2 {

	public static void main(String[] args) {
		
		String str = "Mohit";
		String rev="";
		for(int i =str.length()-1;i>=0;i--)
		{
			 rev+=str.charAt(i);
		}
		System.out.println(rev);
	}

}
