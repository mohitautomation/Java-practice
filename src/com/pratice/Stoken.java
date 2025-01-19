package com.pratice;

import java.util.StringTokenizer;

public class Stoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	         
	         
	     }  
	   
	}

}
