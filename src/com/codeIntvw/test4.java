package com.codeIntvw;

import java.util.HashMap;
import java.util.Map;

public class test4 {

	public static void main(String[] args) {
		
		String str[] = {"G","o","o","d" , " " , "m","o" ,"r" , "g"};
		
		StringBuilder sb = new StringBuilder();
		for(String s:str)
		{
			
			sb=sb.append(s);			
		}
		String sb1 = sb.toString();
		System.out.println(sb1);
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<sb1.length();i++)
		{
			if(map.containsKey(sb1.charAt(i)))
			{
				int count = map.get(sb1.charAt(i));
				map.put(sb1.charAt(i), ++count);
			}
			else
			{
				map.put(sb1.charAt(i), 1);
			}						
		}
		System.out.println(map);
	}

}
