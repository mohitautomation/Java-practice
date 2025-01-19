package com.codeIntvw2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsarray {

	public static void main(String[] args) {
		 //duplicate words count in array
		 
		 String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		 
		//1 - simple soultion - worst time complexity solution - O(nxn) algo
		 
		/* for(int i=0;i<names.length;i++)
		 {
			 for(int j=i+1;j<names.length;j++)
			 {
				 if(names[i]==names[j]) 
				 {
					 System.out.println("Duplicate elements is :" +names[i]);
				 }
			 }
		 }*/
		 
		//2. using HashSet: Java Collection: it stores unique values: O(n)
		 /*
		 Set<String> dup = new HashSet<>();
		 for(String s:names)
		 {
			 if(dup.add(s)==false)
			 {
				 System.out.println("Duplicate elements is : " + s);
			 }
		 } */
		 
		//3. using HashMap: O(2n)
		 
		 Map<String , Integer> map = new HashMap<>();
		 for(String s:names)
		 {
			 Integer count = map.get(s);
			 if(count == null)
			 {
				 map.put(s, 1);
			 }
			 else
			 {
				 map.put(s, ++count);
			 }
		 }
		 //get the values from this HashMap:
		 //Set entrySet = map.entrySet();
		 
		 for(Entry<String, Integer> m:map.entrySet()) {
	       if(m.getValue() > 1 ){
	        System.out.println("duplicate element is: "+ m.getKey());
	       }
	      }
		 
	}

}
