package com.codeIntvw;

public class LinearSch {

	public static void main(String[] args) {
		
		int a[] = {3,45,5,34,95,12,19,24,77};
		int num = 77;
		int pos=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == num)
			{
				pos = i;
			}
		}
		
		if(pos >= 0)
		{
			System.out.println("Element --> " + num + " Present in array at positon --> " + pos + " - linear search");
		}
		else
		{
			System.out.println("Element not present in array - linear search");
		}
		
	}

}
