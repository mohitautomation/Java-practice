package com.baseCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapInterface {

	public static void main(String[] args) {
		
		
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1, "Mohit");
		mp.put(3, "Ayushi");
		mp.put(2, "John");
		mp.put(3, "Yash"); // it replace old 3 value ayushi // value is not unique , but key is unique
		
		//System.out.println(mp);
		//System.out.println(mp.get(1));
		
		Set<Integer> keys = mp.keySet();
		
		for(int key : keys)
		{
			System.out.println(key + "   " + mp.get(key) );
		}
		
		

	}

}
