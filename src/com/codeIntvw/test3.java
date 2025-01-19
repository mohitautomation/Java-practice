package com.codeIntvw;

public class test3 {
//program to reverse only second word of string
	public static void main(String[] args) {
	    String s="Good Morning";
	    String str[]=s.split(" ");
	    String rev="";
	    
	    for(int i=0;i<str[1].length();i++)
	    {
	    char ch=str[1].charAt(i);
	    rev=ch+rev;
	    }  
	    String rev1=rev.substring(0,1).toUpperCase();
	    String rev2=rev.substring(1);
	    String resRev = rev1+rev2;
	    str[1]=resRev;  
	    
	    
	    for(int i=0;i<str.length;i++)
	    {
	        System.out.print(str[i]+" ");
	    }
	}
	}


