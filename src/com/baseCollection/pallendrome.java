package com.baseCollection;

public class pallendrome {

	public static void main(String[] args)
	{
		
		int r,sum=0,temp;
		int num = 1551;
		
		temp = num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if (temp==sum)
		{
			System.out.println("Pallendrome");
		}
		else
		{
			System.out.println("Not pallendrome");
		}

	}

}
