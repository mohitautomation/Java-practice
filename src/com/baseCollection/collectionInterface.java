package com.baseCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionInterface {

	public static void main(String[] args) {
		
		Collection value = new ArrayList();
		value.add(4);
		value.add(6);
		value.add("Mohit");
		
		//System.out.println(value);
		
		Iterator it = value.iterator();  // Iteration is interface and iterator is method
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		
	}

}
