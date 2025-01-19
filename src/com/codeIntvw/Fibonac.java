package com.codeIntvw;

import java.util.Scanner;

public class Fibonac {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter fibonacii series nth number");
		int n=sc.nextInt();
		
		int first=0;
		int second=1;
		
		for (int i=1;i<=n;i++)
		{
			System.out.print(first+", ");
			int next=first+second;
			first = second;
			second=next;
		}
		
		
	}

}
