package com.codeIntvw;

public class array2 {

	public static void main(String[] args) {
		
		// add 2 arrays
		int a[][] = { {2,4} , {4,4} , {9,6} , {1,8}};
		int b[][] = { {6,4} , {7,7} , {2,6} , {2,5}};
		
		int m = a.length;
		int n = b[0].length;
		
		int c[][] = new int[m][n]; 
		
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				 c[i][j] = a[i][j] + b[i][j]; // replace to "-" for substraction
			}
		}
		//System.out.println(c);
		System.out.println("Printing Result for Arrays");
		
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.print(c[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}

}
