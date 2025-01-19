package com.codeIntvw2;

public class MinMaxArray {

	public static void main(String[] args) {
		
		// MaxAndMinElementInArray
		
		 int array[]={10,100,20,50,109,5,60};
		 
		 int max = array[0];
		 
		 for(int i=0;i<array.length;i++)
		 {
			 if(array[i]> max)
			 {
				 max=array[i];
			 }
		 }
		 
		 System.out.println("Max value in array is : " + max);
		 
		 int min = array[0];
		 
		 for(int i=0;i<array.length;i++)
		 {
			 if(array[i]< min)
			 {
				 min=array[i];
			 }
		 }
		 System.out.println("Min value in array is : " + min);

	}

}
