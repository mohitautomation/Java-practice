package com.basicArray;

import java.util.Scanner;

public class user1Darray 
{
public static void main(String []args)
		{
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements to be stored:");
			//reading the number of elements from the that we want to enter  
			n=sc.nextInt();
			//creates an array in the memory of length n
			int array[]= new int[n];
			System.out.println("Enter the elements of array");
			for(int i=0;i<n;i++)
			{
				////reading array elements from the user   
				array[i]=sc.nextInt();
				
			}
			System.out.println("Array elements are: ");  
			// accessing array elements using the for loop  
			for(int i=0;i<n;i++)
			{
				System.out.println(array[i]);  
			}
			
	
		}
}
