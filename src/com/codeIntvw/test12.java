package com.codeIntvw;


public class test12 {

	public static void main(String[] args) {
		

		int c;
		
		for(int i=2;i<=100;i++)
		{
			c=0;
		for(int j=i;j>=1;j--)
		{
			if(i%j==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println(i);
		}
		
		}

	}

}
