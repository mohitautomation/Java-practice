package com.pratice;

public class StringReVEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is mohit";
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  	        	
	}
	    System.out.println(reverseWord);

}}
