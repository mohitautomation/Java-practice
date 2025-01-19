package com.basePart2;

public class tryCatchFinally {

	public static void main(String[] args) {
		
		try {
			
		int arr[] = new int[6];
		arr[6] = 99;
		int i = 7;
		int j = 0;
		int k = i/j;
		System.out.println(k);
		//System.out.println("TEsted");
		
		}
		
		// use of pipe | was introduce in java 1.7
		// we can have multiple catch block or exception , but code look messy or boiler plate
		//catch(Exception e)
		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error " + e );
			//System.out.println("TEsted");
		}
		/*catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error " + e );
			//System.out.println("Tested");
		}*/
		
		// Exception class should come at end
		catch (Exception e) // unchecked exception
		{
			System.out.println("Error " + e );
			//System.out.println("Tested");
		}
		
		// reduce code redandancy by using finally which will be execute no matter what
		finally
		{
			System.out.println("Tested");
		}
		

	}

}
