package com.codeIntvw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

//import org.apache.poi.xssf.usermodel.*;

public class Test9 {

	public static void main(String[] args) throws FileNotFoundException  {
		
		String str= "Hello world , my world ello";
		String s[] = str.split(" ");
		Map<String , Integer> map = new HashMap<>();
		for (String s1:s)
		{
		
		if(map.containsKey(s1))
		{
			int count = map.get(s1);
			map.put(s1, ++count);
		}
		else
		{
			map.put(s1, 1);
		}
		}
		
		System.out.println(map);
	}

}
