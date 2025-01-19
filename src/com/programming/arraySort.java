package com.programming;

import java.util.Arrays;
import java.util.Collections;

public class arraySort {

	public static void main(String[] args) {


		String[] name= {"Mohit" , "Negi" , "Akshay" ,"Salman" };
		
		int size=name.length;
		
		for (int i=0;i<size-1;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if(name[i].compareToIgnoreCase(name[j])>0)
				{
					//System.out.println(name[i]);
					String temp = name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
	Arrays.sort(name, Collections.reverseOrder());   
	System.out.println(Arrays.toString(name));
	
	}	
		
	}


