package com.baseCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionsClass {

	public static void main(String[] args) {
		
		List<Integer> value = new ArrayList<>(); 
		value.add(945);
		value.add(619);
		value.add(431);
		value.add(793);		
		/*Comparator<Integer> c = new Comparator<Integer>()
				{
					public int compare(Integer i , Integer j)
					{
						if (i%10 > j%10)
							return 1;
						else
							return -1;
					}
				};*/		
		/*Comparator<Integer> c = new Comparator<Integer>()
		{
			public int compare(Integer i , Integer j)
			{
				return i%10 > j%10 ? 1:-1 ;
			}
		};*/
		
		//Comparator<Integer> c = (i ,j)-> i%10 > j%10 ? 1:-1 ; // using lamba expression to remove boiling code
		
		//Collections.sort(value, c);  // do sorting based on last numeric(ones place of number) of added values
		
		Collections.sort(value, (i ,j)-> i%10 > j%10 ? 1:-1 );   // Most simplied form using lamda expression
		
		
		
		//Collections.sort(value);
		//Collections.reverse(value);
		//Collections.shuffle(value);
		
		for(Object o:value)
		{
			System.out.println(o);
		}
		


	}

}
