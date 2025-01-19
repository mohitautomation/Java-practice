package com.baseRevision1;

import java.util.HashMap;

public class Occoranceofcharacter {

	public static void main(String[] args) {
		
		String name = "Good Afternoon mate";
		/*// basic simple naive method
		boolean[] b = new boolean[name.length()];
		
		for(int i = 0 ; i<name.length();i++)
		{
			if(b[i]) continue;
			int c=1;
		for(int j = i+1 ; j<name.length();j++)
		{
			if (name.charAt(i) == name.charAt(j))
			{
				c++;
				b[j]=true;
			}
		}
		
		System.out.println(name.charAt(i) + ":"+c);
		
		}*/
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for (int i=0;i<name.length();i++)
		{
			if(hmap.containsKey(name.charAt(i)))
			{
				int count = hmap.get(name.charAt(i));
					hmap.put(name.charAt(i), ++count)	;
			}
			else
				hmap.put(name.charAt(i), 1)	;
		}
		System.out.println(hmap);

	}

}
