package com.codeIntvw;

public class BubbleNum {

	public static void main(String[] args) {
		
		int a[] = {3,45,5,34,95,12,19,24,77};
		for(int i=0; i<a.length; i++)
		{
			for (int j=i+1; j<a.length; j++)
			{
			if(a[i] > a[j])  //ascending order // < for reverse order
			{
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		System.out.println("Bubble Sort Successful !!!");
		System.out.println("Bubble Sort Ascending Order via > symbol");
		for(int i=0;i<a.length;i++)
		{				
		System.out.print(a[i] + "  ");
		}
	}
}
