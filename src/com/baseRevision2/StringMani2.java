package com.baseRevision2;

public class StringMani2 {

	public static void main(String[] args) {
		
		// upper case letter for each reverse word of string
		
				String str = "my name is mohit";
				String s[]=str.split(" ");
				String rev= "";
				String rev1="";
				
				/*
				for(String a:s )
				{		
					for(int i = a.length()-1;i >=0;i--)
					{
						rev = rev + a.charAt(i) ;	
						
					}		
					rev = rev + " ";

				}
				String r[]=rev.split(" ");
				for(int i=0;i<r.length;i++)
				{
					String s1=r[i].substring(0,1).toUpperCase();
					String s2=r[i].substring(1).toLowerCase();
					String s3=s1+s2;
					rev1=rev1 + " "+s3;
				}
				
					
				System.out.println(rev1);
				
				*/
				
				for(String a:s )
				{		
					for(int i = a.length()-1;i >=0;i--)
					{
						rev = rev + a.charAt(i) ;	
						
					}		
					rev = rev + " ";

				}
				
				String r[]=rev.split(" ");
				for(int i=0;i<r.length;i++)
				{
					String s1=r[2].substring(0,1).toUpperCase();
					String s2=r[2].substring(1).toLowerCase();
					 rev1=s1+s2;
				}
				
				r[2]=rev1;
						
				for(String c:r)
				{
					System.out.print(c+ " ");
				}
				
				
	}

}
