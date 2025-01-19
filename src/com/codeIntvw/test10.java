package com.codeIntvw;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palendrome series");
		
		int num = sc.nextInt();
		int rev=0;
		int rem;
		
		int pallen = num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		if(pallen==rev)
		{
			System.out.println("Pallendrome");
		}
		else
		{
			System.out.println("not pallendrome");
		}
			

	}

}
