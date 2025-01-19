package com.codeIntvw;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for prime");
		
		int num = sc.nextInt();	
		boolean flag=false;
		
		for(int i=2;i<=num/2;++i)
		{
			if(num%i==0)
			{
				//System.out.println("not prime");
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println(" prime");
		}
		else
		{
			System.out.println("not prime");
		
		}

	}

}
