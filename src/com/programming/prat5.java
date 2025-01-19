package com.programming;

public class prat5 {

	public static void main(String[] args) {
		
		String str="Pr!ogr#+-am%m*!@in&g Lan&%?#guag(e";  
		String resultStr=""; 
		
		//str=str.replaceAll("\\W", "");
		//System.out.println(str);
		for(int i=0;i < str.length();i++) {
			if(str.charAt(i)> 64 &&  str.charAt(i)<= 122)
			{
				resultStr+=str.charAt(i);
			}
		}
		System.out.println("after removing"+resultStr);
	}

}
