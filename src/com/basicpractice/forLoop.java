package com.basicpractice;

public class forLoop {

	public static void main(String[] args) {


		System.out.println("For while star pattern ...");
		
		/* *****
		   *****
		   *****
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		/* 
		   *
		   **
		   ***
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/

		/* 
		   ****
		   ***
		   **
		   *
		   
		for(int i=5;i>=1;i--)
		{			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}*/
		
		/*
		     *
		   ***
		  ****
		   
		for(int i=1;i<=5;i++)
		{			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for( int j=1;j<= i;j++)
			{
				System.out.print("*");
			}

			System.out.println("");
			
		}*/
		
		/*
*
**
***
****
*****
****
***
**
*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
	/*	

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
    
		for(int i=1;i<=5;i++)
		{			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for( int j=1;j<= i;j++)
			{
				System.out.print("*");
			}

			System.out.println("");
			
		}
		for(int i=1;i<=5;i++)
		{			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for( int j=i+1;j<=5;j++)
			{
				System.out.print("*");
			}

			System.out.println("");
			
		}*/
		
		/*

    *
   ***
  *****
 *******
*********
		
		for(int i=1;i<=5;i++)
		{			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for( int j=1;j<= i;j++)
			{
				System.out.print("*");
			}

			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}

			System.out.println("");
			
		}*/
		
		/*


    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
		
		for(int i=1;i<=5;i++)
		{			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for( int j=1;j<= i;j++)
			{
				System.out.print("*");
			}

			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}

			System.out.println("");
			
		}
		for(int i=1;i<=5;i++)
		{			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for( int j=5;j>i;j--)
			{
				System.out.print("*");
			}

			for(int j=5;j>i+1;j--)
			{
				System.out.print("*");
			}


			System.out.println("");
			
		}*/
		
		/*
*****
 ****
  ***
   **
    *		
		for(int i=5;i>=1;i--)
		{			
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");		
		}*/
		
		/*
*********
 *******
  *****
   ***
    *
		
		for(int i=5;i>=1;i--)
		{			
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");	
			 
		}*/

		/*
*
 *
  *
		for(int i=1;i<=5;i++)
		{			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");				 
		}*/
		

		/*

		      
   *
  *
 *
*
		 
		for(int i=1;i<=5;i++)
		{			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.println("*");				 
		}*/
		
		/*

    *
   *
  *
 *
*
*
 *
  *
   *
    *
		
		for(int i=1;i<=5;i++)
		{			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.println("*");				 
		}
		for(int i=1;i<=5;i++)
		{			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");				 
		}*/
		
	/*

*         *
 *       *
  *     *
   *   *
    * *
     *
		
		for(int i=5;i>=0;i--)
		{	
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}			
			System.out.print("*");	

			
			for (int j = 1; j < (i * 2); j++)
			
			{
				System.out.print(" ");//Print space
			}
				if ( i >= 1)	
				{
					System.out.print("*");				
				}
		System.out.println("");//Enter newline
						
		}*/

		
/*

     *
    * *
   *   *
  *     *
 *       *
*         *



 
		int n=0;
		
		for(int i=5;i>=0;i--)
		{			
			for(int j=5;j>n;j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j=1;j<n*2;j++)
			{
				System.out.print(" ");
			}
			if(i<5)
			{
				System.out.print("*");
			}
			System.out.println("");
			n++;
		}*/

		/*
		 

* * * * * 
*       * 
*       * 
*       * 
* * * * * 		 

		int n=4;
		for(int i=0;i<5;i++)
		{			
			for(int j=0;j<5;j++)
			{
				if (i == 0 || i == 5 - 1 || j == 0 || j == 5 - 1)
		        {
		          System.out.print("*"+" ");
		        }
		        else {
		          System.out.print(" "+ " ");
		        }
			}
			System.out.println("");

		}
		*/
/*

A
AA
AAA
AAAA
AAAAA
		for(int i =1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				char A =65;
				System.out.print(A);
			}
			System.out.println("");
		}
		*/

		/*

A
AB
ABC
ABCD
ABCDE
	
		for(int i =1;i<=5;i++)
		{
			int printA =65;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print((char)printA);
				printA++;
			}
			System.out.println("");
		}
		*/
		int printA =65;
		for(int i =1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print((char)printA);
				
			}
			printA++;
			System.out.println("");
		}
		
		
	}
}


