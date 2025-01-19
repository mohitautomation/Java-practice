package com.baseRevision1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lamdaExpression {

	public static void main(String[] args) {
		
		List<Integer> value = new ArrayList<>();
		value.add(342344);
		value.add(234);
		value.add(1111);
		value.add(192);
		
		/*Comparator<Integer> c = new Comparator<Integer>()
				{
			public int compare(Integer i , Integer j)
			{
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
				};*/ // Step 1 :Lets remove boiling code form above using lamda expressions
	
		
			/*Comparator<Integer> c = new Comparator<Integer>()
					{
				public int compare(Integer i , Integer j)
				{
					return i%10 > j%10 ? 1 : -1 ;
				}			
					};*/ //Step 2 :Lets remove further boiling code form above using lamda expressions

			
		// Comparator<Integer> c = (i,j) -> i%10 > j%10 ? 1 : -1 ; // Final Lamda Expression results
		
		///Collections.sort(value, (i,j)->i%10 > j%10 ? 1 : -1); // Most simplified form using lamda expression
		
		Collections.sort(value);
		 
		for(Object o:value)
		{
			System.out.println(o);
		}
				
}
}
