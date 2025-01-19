package com.baseCollection;

public class pact1 {

	public static void main(String[] args) {

		String name= "Mohit Negi";
		
		char ch;
		String rev="";
		
		for(int i =name.length()-1; i>=0;i--)
		{
			ch=name.charAt(i);
			rev=rev+ch;
		}
		
		System.out.println(rev);
	}

}
