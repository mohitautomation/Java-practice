package com.basePart2;

import java.util.Scanner;

public class scannerInput {

	public static void main(String[] args) {
		
		int n=0;
		String src;
		System.out.println("Enter number");
		 
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		
		System.out.println(n);
		
		System.out.println("Enter String");
		
		Scanner  sc1 = new Scanner(System.in);
		//src = sc.next();
		src = sc1.nextLine();
		
		System.err.println(src);
		

	}

}
