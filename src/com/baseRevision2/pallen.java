package com.baseRevision2;

import java.util.Scanner;

public class pallen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the number to check pallndrome");
		
		int n = sc.nextInt();
		int rev = 0;
		int rem ;
		
		int pallen = n;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		
		System.out.println(rev);
		
		if(pallen == rev)
		{
			System.out.println("P");
		}
		else
		{
			System.out.println("NP");
		}*/
		
		System.out.println("Enter the String to check pallendome");
		
		String num = sc.nextLine();
		String rev = "";
		int  length = num.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
		}
		
		if(rev.equals(num))
		{
			System.out.println("P");
		}
		else
		{
			System.out.println("NP");
		}
		
	}

}
