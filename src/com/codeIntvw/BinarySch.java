package com.codeIntvw;

public class BinarySch {

	public static void main(String[] args) {
		
		int a[] = {3,5,15,34,95,99,111,200}; //ordered array for binary search
		int num = 3;
		int start=0;
		int end=a.length-1;
		
		int mid = (start+end)/2;
		while( start <= end )
		{			
			if(a[mid] == num)
			{
		        System.out.println("Element -> " + num + " is present in array at position " + mid );
		        break;  
			}
			else if(a[mid] > num)
			{
				end = mid -1;
			}
			else
			{
				start = mid+1;
			}				
			mid = (start+end)/2;
		}						
		if(start > end)
		{
			System.out.println("Element not present in array - Binary Search for sorted array");
		}
	}
}
