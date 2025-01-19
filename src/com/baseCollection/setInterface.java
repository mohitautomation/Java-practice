package com.baseCollection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setInterface {

	public static void main(String[] args) {
	
		/*
		Set<Integer> s = new HashSet<>();
		s.add(11);
		s.add(2001);
		s.add(11);
		s.add(9999);
		
		for(int i: s)
		{
			System.out.println(i);
		}*/
		
		
		Set<Integer> s = new TreeSet<>();
		s.add(11);
		s.add(2001);
		s.add(11);
		s.add(999);
		
		for(int i: s)
		{
			System.out.println(i);
		}
		
		
	}

}
