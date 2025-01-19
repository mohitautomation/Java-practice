package com.codeIntvw;

public class Evenoddarr {

	public static void main(String[] args) {
		// even and odd array
		
		int a[]= {3,2,12,10,30,40,31,41,33,11,7,33};
		
		int n=a.length;
		
		System.out.println("Even Number in array are ----->>>");
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.print(a[i] + "  ");				
			}
		}
		
		System.out.println(" ");
		System.out.println("Odd Number in array are ----->>>");
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.print(a[i] + "  ");				
			}
		}

	}

}
