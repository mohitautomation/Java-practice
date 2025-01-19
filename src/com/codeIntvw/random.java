package com.codeIntvw;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		// Random class 
		
		
		Random random = new Random();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Random Value's b/w 0 to 15 are --->" + random.nextInt(50));
		
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Random Value's b/w 0 to 15  using math .ranodm are --->" + (int)(Math.random()*50));
		}

	}

}
