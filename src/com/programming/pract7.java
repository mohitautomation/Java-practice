package com.programming;

public class pract7 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 7, 5 };
		int size= arr.length;
		int x = 3;
		boolean ret = false;
		int ret1=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==x)
			{
				ret1= i;
				ret=true;
			}

		}
		
		if(ret == false)
		{
			System.out.println("Linear search value not found");
		}
		else
		{
			System.out.println("Linear search value is:"+ret1);
			
			
		}

	}

}
