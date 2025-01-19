package com.pratice;

import java.util.HashMap;
import java.util.Map;

public class HMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();
				{
					map.put(1, "Ayushi");
					map.put(2, "Max");
					map.put(3, "Mohit");
					
					System.out.println(map.get(2));
					System.out.println(map);
					
		for(Map.Entry m:map.entrySet()) {
			//System.out.println(m.getKey()+" "+m.getValue());
			System.out.println(m.getKey());
			
		}
		
	}

	}
}
