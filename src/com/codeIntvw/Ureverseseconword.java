package com.codeIntvw;

public class Ureverseseconword {

	public static void main(String[] args) {

		//String s[] = {"Mohit" , "Akshay" , "Salman" , "Zayjn"};
		String str = "Good Morning";		
		String s[] = str.split(" ");
		String rev="";
		
		for(int i=0;i<s[1].length();i++)
		{
			char ch = s[1].charAt(i);
			rev=ch+rev;
		}
		
		s[1]=rev;
		for(int i=0;i<s.length;i++)
		{
		System.out.print(s[i]+" ");
		
		}


	}

}
