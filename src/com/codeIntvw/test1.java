package com.codeIntvw;

import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
		
		
		String str[] = {"G","o","o","d" , " " , "m","o" ,"r" , "g"};
		StringBuilder sb = new StringBuilder();
		for(String s:str)
		{			
			sb.append(s);			
		}
		String sb1=sb.toString();
HashMap<Character,Integer> map =new HashMap<>();

//for(int i=str.length()-1;i>=0;i--)
for(int i=0;i<sb1.length();i++)
{
if(map.containsKey(sb1.charAt(i)))
{
int count = map.get(sb1.charAt(i));
map.put(sb1.charAt(i), ++count)		;	
}
else
{
map.put(sb1.charAt(i), 1)	;
}
}

System.out.println(map);		
}
}
