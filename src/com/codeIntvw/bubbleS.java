package com.codeIntvw;

import java.util.Arrays;
import java.util.Collections;

public class bubbleS {

	public static void main(String[] args) {
		
		String s[] = {"Mohit" , "Akshay" , "Salman" , "Nayjn"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
			if(s[i].compareTo(s[j]) >0)   // ascending order // <0 - for reverse order
			{
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;				
			}
			}
		}
		System.out.println("Bubble Sort Successful !!!");
		System.out.println("Bubble Sort Ascending Order via > 0 Lexicographical order");
		//Arrays.sort(s, Collections.reverseOrder()); 
		//System.out.println(Arrays.toString(s));
		
		for(String sa:s)
		{
			System.out.print(sa + " " );
		}
	}

}
