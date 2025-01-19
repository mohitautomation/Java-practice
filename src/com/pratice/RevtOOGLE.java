package com.pratice;

public class RevtOOGLE {
	
	
	public static void main(String[] args) {
		
	 String str="My nam eis mohit";
  
	    String words1[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words1){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  	        	
	}
 	
	 String words[]=reverseWord.split(" ");
	    String capitalizeWord="";
	    
	    for(String w:words){  

	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  

}
System.out.println(capitalizeWord);
}
}

