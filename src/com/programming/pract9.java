package com.programming;

import java.util.HashMap;
import java.util.Map;

public class pract9 {

	public static void main(String[] args) {
		String[] name= {"Mohit" , "Negi" , "Aksiay" ,"Siiman" };
		
		StringBuilder builder = new StringBuilder();
		for(String s : name) {
		    builder.append(s);
		}
		String str = builder.toString();
		System.out.println(str);
		int c=0;
		//char ch = 'i';
		for (int i=0;i<str.length();i++)
		{
			//c+=s.length();
			if(str.charAt(i) =='a')
			{
				//System.out.println(name[i]);
				c++;
			}
		}
		System.out.println(c);
		
	}

}
