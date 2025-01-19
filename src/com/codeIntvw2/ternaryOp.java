package com.codeIntvw2;

public class ternaryOp {

	public static void main(String[] args) {
		//ternaey operator
		
		int i=19;
		int j=2;
		
		boolean max1 = i > j ? true : false ;
		System.out.println(max1);
		
		int a=10,b=11,c=22,max;
		if(a>b && a>c)
		{
			System.out.println("A is greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greatest");
		}
		else
		{
			System.out.println("C is greatest");
		}
		
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(max);
		

	}

}
