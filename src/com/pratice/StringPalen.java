package com.pratice;

public class StringPalen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = "Nitin";
		
		char ch[]=s.toCharArray();
		String rev="";
		
		for(int i = ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
			
		}
		System.out.println(rev);
		
		if(rev.toString().toLowerCase().equals(s.toLowerCase()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		

	}

}
