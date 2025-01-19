package com.codeIntvw2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class hashset {

	public static void main(String[] args) {
		
		 //Removing Duplicate Elements From ArrayList Using HashSet
		
        List listWithDuplicateElements = new ArrayList();
        
        listWithDuplicateElements.add("JAVA"); 
        listWithDuplicateElements.add("J2EE"); 
        listWithDuplicateElements.add("JSP"); 
        listWithDuplicateElements.add("SERVLETS"); 
        listWithDuplicateElements.add("JAVA"); 
        listWithDuplicateElements.add("STRUTS"); 
        listWithDuplicateElements.add("JSP");
        
        System.out.print("ArrayList With Duplicate Elements :");        
        System.out.println(listWithDuplicateElements);

        HashSet hset = new HashSet(listWithDuplicateElements);        
        ArrayList listWithoutDuplicateElements = new ArrayList(hset);
        
        System.out.print("ArrayList After Removing Duplicate Elements :");        
        System.out.println(listWithoutDuplicateElements);
        
	}
}
