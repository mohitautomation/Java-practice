package com.basicpractice;

class Student
{
	int rollNo;
}

public class arrayString {

	public static void main(String[] args) {
		
	//	Student s1 = new Student();
	// Student s2 = new Student();
	//	Student s[]= new Student[4];
	//	Student s[] = {s1,s2};	
		
		/*int a[] = new int[5];
		a[1]= 2;
		a[0] = 1;
		System.out.println(a[1]); */
		
		//int a[][] = new int[3][4];
		int a[][] = {
						{2,4,2,1},
						{3,2,0,3},
						{21,41,23,14},
						{23,4,921},
						{23,4,921,11}
					};
		
		//System.out.println(a[1][1]);
//		for (int i = 0 ; i< a.length ; i++)
//		{
//			for (int j = 0 ; j<a[i].length ; j++)
//			{
//				System.out.print("    " + a[i][j]);
//			}
//			System.out.println();
//		}
		//for each loop // echanced for loop
		
		for(int i[] :a)
		{
			for(int j : i)
			{
				System.out.print("    "+ j);
			}
			System.out.println();
		}
		
		
String[]	array = new String[4];
array[0] = "Mohit";
array[2] = "Mohit1";
System.out.println(array[0]);

for (String i : array)
{
	System.out.println(i + " ");
}
		
			
	}

	}


