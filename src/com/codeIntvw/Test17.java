package com.codeIntvw;

public class Test17 {

	public static void main(String[] args) {
		// String remove special charaters
		
		String s= "Mohi@#$1!+-=23tt(*()*&^%";
		
		/*String ret="";
		for(int i = 0 ; i<s.length();i++)
		{
		if(s.charAt(i)>64 && s.charAt(i)<123)
		{
			ret=ret+s.charAt(i);
		}
		}
		
		System.out.println(ret);
		*/
		//s=s.replaceAll("\\W", "")  ;
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
