package com.codeIntvw2;

public class reverseEachword {

	public static void main(String[] args) {
		// reverse each word in a string
        
		String str = "Java Concept Of The Day" ;
		String sp[]= str.split(" ");
		String rev= "";
		//String newStr = "";
		
		for(String s:sp)
		{
			for(int i = s.length() -1; i>=0 ; i--)
			{
				rev=rev  +s.charAt(i) ;
			}
			rev=rev+" ";
		}		
		
		System.out.println(rev);
        
	}

}
