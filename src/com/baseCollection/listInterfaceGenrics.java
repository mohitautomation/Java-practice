package com.baseCollection;

import java.util.ArrayList;
import java.util.List;

public class listInterfaceGenrics {

	public static void main(String[] args) {
		
		
		//List<Integer> value = new ArrayList<Integer>(); //1.5 java
		List<Integer> value = new ArrayList<>(); //1.7 java
		value.add(41);
		value.add(6);
		value.add(9);
		value.add(2, 45);
		value.add(9);
		
		//System.out.println(value);
		
		for(Object o:value)
		{
			System.out.println(o);
		}
		

	}

}
