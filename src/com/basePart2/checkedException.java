package com.basePart2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkedException {

	public static void main(String[] args) throws IOException {
		
		int n=0;
		System.out.println("Enter a number");
		
		BufferedReader br = null;
		try {
				
		br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine()); //checked exception given by compiler
		
		}
		catch(Exception e)
		{
			System.out.println("Error is due"+ e);
		}
		
		finally
		{
			br.close();
		}

}
}
