package com.codeIntvw2;

public class Test15 {

	public static void main(String[] args) {
		// reverse with upper case letter
		
		String str = "my name is mohit";
		String s[]=str.split(" ");
		String rev= "";
		String rev1="";
		
		for(String a:s )
		{		
			for(int i = a.length()-1;i >=0;i--)
			{
				rev = rev + a.charAt(i) ;	
				
			}		
			rev = rev + " ";
			
			if(rev.contains("si"))
			{
				String s1=a.substring(0, 1);
				String s2=a.substring(1).toUpperCase();;
				String s3=s1+s2;	
				
				for(int i = s3.length()-1;i >=0;i--)
				{
					rev1 = rev1 + s3.charAt(i) ;						
				}				

				rev = rev.replaceAll("si", rev1);
							
			}
			

			}
		System.out.println(rev);
		
		
	}

}
