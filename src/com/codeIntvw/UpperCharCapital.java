package com.codeIntvw;

public class UpperCharCapital {

	public static void main(String[] args) {
		
		//String 1 st character Upper case for each word in string 
		
		String s = "my name is pavan";
		  String rev = "";
		  
		  String s1 [] = s.split(" ");

		  for(int i=0;i<s1.length;i++)
		  {
			  String f = s1[i].substring(0, 1).toUpperCase();
			  String l = s1[i].substring(1, s1[i].length());
			  
		  
		  rev = rev+ " "+f+l;
		  
	}
		  
		  System.out.println(rev.trim());
		  
		 }

	}

