package com.programming;

public class prat111 {

	public static void main(String[] args) {
		
		 String str = "Good is Morn is ng is ng";
		 String words[]=str.split(" ");
		 int c;
		 for(int j= 0;j<words.length;j++)
			 
		{
			 c=1;
		for(int k=j+1;k<words.length;k++)
		{
			 if(words[j].equals(words[k]))
		 {
			c++;	
			words[k]="0";
		 }
		 }
		if(c>1 && words[j]!="0")
		{
System.out.println(words[j]);
		}
		}
	}

}
