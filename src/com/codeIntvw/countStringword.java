package com.codeIntvw;

public class countStringword {

	public static void main(String[] args) {
		// count words in string
		
		String s = "my name is pavan and i am engineer";
		int c=1;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				c++;
			}
		}
		System.out.println(c);

	}

}
