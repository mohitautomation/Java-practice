package com.codeIntvw2;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		// find the missing number in array
		
		  int a[] = {-1,0,1,2,4,5,6,3,8,9,10};
		
		//int sum = (N * (N + 1)) / 2; for positive number only 
		
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}	
		System.out.println(sum);
		
		for(int j=-1; j<=10; j++)
		{
		   sum1 = sum1 + j;
		}
		  
		System.out.println(sum1);
		  
		System.out.println("missing number is:"+ (sum1-sum));	
		

	}

}