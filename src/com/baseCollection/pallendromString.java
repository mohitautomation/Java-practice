package com.baseCollection;

import java.util.Scanner;
import java.util.*; 


public class pallendromString {

	public static void main(String[] args) {
		
		String original,reverse="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number or string : ");
		original = in.nextLine();
		int length = original.length();
		for (int i=length-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Enter number or string : " + "Pallendrome");
		}
		else
		{
			System.out.println("Enter number or string : " +  "NOT Pallendrome");
		}

	}

}
