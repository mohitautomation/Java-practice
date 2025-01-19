package com.codeIntvw2;

public class CountNoofIntergerValue {

	public static void main(String[] args) {
		
		// count number of number is an Integer value
		
		int num = 7238965;
		int count = 0;
		while(num!=0)
		{
			num=num/10;
			++count;
		}
		System.out.println(count);
		

	}

}
