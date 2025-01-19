package com.basicpractice;

import java.util.Arrays;

public class arrayPactice {

	public static void main(String[] args) {
		
//1D array		
		/*int[] a = new int[5];
		a[0]=10;
		a[2]=56;
		a[2]=33;
		//int[] a1 = {1,3,4,6,1,7,8,111,444,666};
		
		System.out.println(Arrays.toString(a1));
		System.out.print("{");
		for (int i:a)
		{
			System.out.print("" +i + ",");
		}
		System.out.print("}");*/
		
//2D Array
		int[][] arr = new int[4][4];
		arr[0][0] = 19;
		arr[1][3] = 47;
		arr[0][3] = 171;
		arr[2][3] = 499;
		 
		//int arr[][] = {{1,2} , {22,34}};
		//System.out.println(arr[2][2]);
		
		System.out.println(Arrays.deepToString(arr));
		
		//Arrays.asList(arr).stream().forEach(s -> System.out.println(s));
		//Arrays.stream(arr).forEach(System.out::println);
		//Stream.of(arr).forEach(System.out::println);
		
		System.out.println("Length of row 1: " + arr[0].length);
		System.out.println("Length of row 2: " + arr[3].length);

		
       /* for (int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.println(arr[i][j]);*/
		

	}
}
