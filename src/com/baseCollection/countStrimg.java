package com.baseCollection;

public class countStrimg {

	public static void main(String[] args) {
		String s="goofmorning";
		char ch='n';
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='n')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
