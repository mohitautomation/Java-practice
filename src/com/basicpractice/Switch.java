package com.basicpractice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		/*Scanner n = new Scanner(System.in);
		int dayNum;
		System.out.println("Enter a day number (1-7): ");
		dayNum = n.nextInt();*/ // above code int from system
		
		String project = "SwagLabs";
		switch(project)
		{
		case "SwagLabs":
		{	
			System.out.print("Monday");
		break;
		}
		
		case "Swag.Labs":
		{
			System.out.print("Tuesday");
		break;	
		}
		default :
		{			
			System.out.print("Invalid");
			break;
	    }	

		}
	}
}
