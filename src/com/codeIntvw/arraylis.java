package com.codeIntvw;

import java.util.ArrayList;
import java.util.List;

public class arraylis {

	public static void main(String[] args) {
		// array list program
		
		ArrayList alist = new ArrayList();
		
		alist.add("elle");
		alist.add(100);
		alist.add("Sam");
		alist.add(true);
		alist.add("C");
		
		
		//System.out.println(alist);
		System.out.println(alist.size());
		System.out.println(alist.get(1));
		
		System.out.println("Before Insert" +alist);
		alist.add(1, "Max");
		System.out.println("After Insert" +alist);
		
		alist.remove(3);
		System.out.println("After remove" +alist);
		
		for(Object s:alist)
		{
			System.out.println(s);
		}
		

	}

}
