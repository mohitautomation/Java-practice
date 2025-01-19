package com.baseRevision1;

public class ArraytoString {

	public static void main(String[] args) {
		
	String arr[] = {"G","o","o","d"," ","m","o","r","n","i","n","g"};
	StringBuilder sb = new StringBuilder();
	
	for(String s : arr)
	{
		sb=sb.append(s);
	}
	String sb1=sb.toString();
	System.out.println(sb1);
	
	}

}
