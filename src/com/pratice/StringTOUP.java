package com.pratice;

public class StringTOUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str="My nam eis mohit";
		 String words[]=str.split(" ");  
		    String capitalizeWord="";  
		    for(String w:words){  
		        String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  

	}
System.out.println(capitalizeWord);
	}
		    	
		    }

