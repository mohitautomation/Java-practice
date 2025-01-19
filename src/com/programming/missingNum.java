package com.programming;

import java.util.Scanner;

public class missingNum {

	public static void main(String[] args) {
		
		int[] nu = {1,2,5,4,3,7,8};
		
		//Scanner sc= new Scanner(System.in);
		//int n=sc.nextInt();
		
	    //int sum = (N * (N + 1)) / 2;
		int sum = (8 * (8 + 1)) / 2;
	    //Summation of all array elements:
	    int s2 = 0;
	    for (int i = 0; i < 8 - 1; i++) {
	        s2 += nu[i];
	    }

	    int missingNum = sum - s2;
	    System.out.println(missingNum);
	}

}
