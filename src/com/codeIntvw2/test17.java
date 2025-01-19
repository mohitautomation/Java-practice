package com.codeIntvw2;

import java.util.HashMap;
import java.util.Map;

public class test17 {

	public static void main(String[] args) {
		// count occurrence of words/character
		
		String str = "my name is Mohit";
		String s[]=str.split(" ");
		
		Map<String , Integer> map = new HashMap<>();
		
		for(String a:s)
		{
			if(map.containsKey(a))
			{
				int count = map.get(a);
				map.put(a, ++count);
			}
			else
			{
				map.put(a, 1);
			}
			
		}
		System.out.println(map);	
		
	}

}
