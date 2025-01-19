package com.baseCollection;

public class stringSpecialChar {

	public static void main(String[] args) {
		
	/*	String str= "This#string%+-contains^special*^ ^^-- ^^^ +!characters&.";   
		//str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		//str = str.replaceAll("[-+^]*", " "); 
		//str=str.replaceAll("\\W", " ")  ;
		System.out.println(str);  */
		

		//declare a string having special characters   
		String str="Pr!ogr#+-am%m*!@in&g Lan&%?#guag(e";  
		String resultStr="";  
		//loop execute till the length of the string   
		for (int i=0;i<str.length();i++)  
		{  
		//comparing alphabets with their corresponding ASCII value  
		if (str.charAt(i)>64 && str.charAt(i)<=122) //returns true if both conditions returns true  
		{  
		//adding characters into empty string   
		resultStr=resultStr+str.charAt(i);  
		}  
		}  
		System.out.println("String after removing special characters: "+resultStr);  
		
		//or //str=str.replaceAll("\\W", " ")  ;

	}

}
