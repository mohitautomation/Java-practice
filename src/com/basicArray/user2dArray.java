package com.basicArray;

import java.util.Scanner;

public class user2dArray {

	public static void main(String[] args) {
		
		int m,n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row elements to be stored:");
		//reading the number of elements from the that we want to enter  
		m=sc.nextInt();
		System.out.print("Enter the number of col elements to be stored:");
		//reading the number of elements from the that we want to enter  
		n=sc.nextInt();
		//creates an array in the memory of length n
		int array[][]= new int[m][n];
		System.out.println("Enter the elements of array");
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
		{
			//reading array elements from the user   
			array[i][j]=sc.nextInt();		
		}
		}
		System.out.println("Array elements are: ");  
		// accessing array elements using the for loop  
		for(i=0;i<m;i++)
		{
		for(j=0;j<n;j++)
		{
			//prints the array elements 
			System.out.print(array[i][j]+ "  ");
			//throws the cursor to the next line  
		}
		System.out.println();
		
		}
	}
}
