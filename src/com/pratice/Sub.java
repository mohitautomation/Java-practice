package com.pratice;

import java.util.Arrays;

public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      String text= new String("Hello, Sachin My name is my Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split("\\.");  
	        System.out.println(Arrays.toString(sentences)); 
	        String t= new String("Hello");
	        
	        System.out.println(t.toLowerCase());
	        System.out.println(t.toUpperCase());
	        System.out.println(t.trim());
	        System.out.println(t.startsWith("He"));
	        System.out.println(t.endsWith("o"));
	        System.out.println(t.charAt(1));
	        System.out.println(t.length());
	        String s=t.intern();
	        System.out.println(s);
	        int a=10;    
	        String s1=String.valueOf(a);    
	        System.out.println(10+s1+29);    
	        
	        String text1= new String("Hello, Sachin My name is My Sachin"); 
	        String tr = text1.replace("My", "Me");
	        		System.out.println(tr);   
	        
	        		
	        String text6= "Mohit";
	        System.out.println(text6.substring(1)); 
	        
	        
	        

	}

}
