package com.codeIntvw2;

public class singlecharcount {

	public static void main(String[] args) {
		
		// occurance of particular character in string without loop
		/*
		String s = "my name is pavan and i am engineer";
		int count = s.length() - s.replace("a","").length();
		System.out.println(count);*/
		
		// occurance of particular character in string with loop
		
		String s = "my name is pavan and i am engineer";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
