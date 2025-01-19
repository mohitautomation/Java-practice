package com.codeIntvw2;

public class test16 {

	public static void main(String[] args) {
		// reverse fourth word in string with first reverse work in upper case

		String str = "my name is mohit";
		String s[]=str.split(" ");
		String rev1="";
		
		String s1=s[3].substring(0, 4);
		String s2=s[3].substring(4).toUpperCase();;
		String s3=s1+s2;
		
		for(int i = s3.length()-1;i >=0;i--)
		{
			rev1 = rev1 + s3.charAt(i) ;	
		}
		System.out.println(rev1);
		
	}

}
