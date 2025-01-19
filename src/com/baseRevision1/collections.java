package com.baseRevision1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collections {

	public static void main(String[] args) {
	
		Collection col = new ArrayList();
		col.add(1);
		col.add(3);
		col.add("Revision");
		
		Iterator it = col.iterator();
		{
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}
		
				
				
				
				

	}

}
