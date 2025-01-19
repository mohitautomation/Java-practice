package com.programming;

import java.util.Arrays;
import java.util.HashSet;

public class R1 {

	public static void main(String[] args) {
		
		//String arg[]= {"Aew","Negi","Ayu","Mohit","Negi"};
		/*int i;
		for( i = 0;i<arg.length;i++)
		{for(int j=i+1;j<arg.length;j++)
			{if(arg[i].equals(arg[j]))
				{System.out.println("Duplicate entry found as : "+arg[i]);
					break;
				}	)	}*/
		
		/*HashSet<String> set = new HashSet<>(Arrays.asList(arg));
		System.out.println(set);
*/
		
		HashSet<String> set = new HashSet<>();
		set.add("Aew");
		set.add("Negi");
		set.add("Mohit");
		set.add("Negi");
		
		String array[]= new String[set.size()];
		set.toArray(array);
		
		System.out.println("Unique = "+Arrays.toString(array));
		
		
		
		
		
		
	
}
}
