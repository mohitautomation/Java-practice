package com.basePart2;

public class userDefinedException {

	public static void main(String[] args) {
		
		int i = 7;
		int j = 9;
		
		
		try
		{			
			int k = i/j;			
			System.out.println(k);
			
			if(k==0)
				// Belwo line we are calling catch  Exception  and printing error value
				// throw new Exception();   
				throw new MohitException("this is not possible new MESSAGE"); // created custom user exception //my own exception
			
		}
		catch(Exception e)
		{
			System.err.println("Error user defined : " + e.getMessage());
		}
		

	}

}
