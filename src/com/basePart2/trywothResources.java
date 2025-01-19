package com.basePart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trywothResources {

	public static void main(String[] args) throws Exception {
		
		
		int n=0;
		System.out.println("Enter a Number");
		
		//BufferedReader br=null;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) // try with resources
		{
		//br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		}
		
		System.out.println(n);
		
	}

}
