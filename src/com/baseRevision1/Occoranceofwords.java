package com.baseRevision1;

public class Occoranceofwords {

	public static void main(String[] args) {
		
		 String input = "Hello world , my world ello";
		    String[] arr1 = input.split(" ");
		    int count = 0;

		    for (int i = 0; i < arr1.length; i++) {
		        count = 0;

		        for (int j = 0; j < arr1.length; j++) {
		            String temp = arr1[j];
		            String temp1 = arr1[i];

		            if (j < i && temp.contentEquals(temp1)) {
		                break;

		            }
		            if (temp.contentEquals(temp1)) {
		                count = count + 1;

		            }

		            if (j == arr1.length - 1) {
		                System.out.println(arr1[i] + " : " + count );

		            }

		        }

		    }

		

	}

}
