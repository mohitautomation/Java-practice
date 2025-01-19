package com.pratice;

public class StringRev {
	
	public class StringFormatter { 
		public static String reverseString(String str){  
		    StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    return sb.toString();  
		}  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s1="Mohit";
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		System.out.println(s2.reverse());*/
		
	    StringBuilder sb3=new StringBuilder("Mohit is my name");  
	    sb3.reverse();  
	    System.out.println(sb3.toString());  
	    
	    
	   System.out.println(StringFormatter.reverseString("my name is khan"));  
	    
	    String sb4 = "Mohit is my Negi";
	    char ch[] = sb4.toCharArray();
	    String rev = "";
	    for(int i=ch.length-1;i>=0 ;i-- )
	    {
	     rev = rev+ch[i];
	    }
	    
	    System.out.println(rev); 

	}

}
