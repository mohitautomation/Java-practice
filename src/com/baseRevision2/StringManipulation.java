package com.baseRevision2;

public class StringManipulation {

	public static void main(String[] args) {
		
		// reverse second word of string "good morning"
		// to UpperCase first char of each word in string "good morning"
		//count word in string and character in string
		
		String s= "my name is mohit negi and i work for IT";
		String[] sp=s.split(" ");
		String rev ="";
		
		/*
		// to UpperCase first char of each word in string "good morning"
		for(int i=0;i<sp.length;i++)
		{
			String rev1= sp[i].substring(0, 1).toUpperCase();
			String rev2= sp[i].substring(1, sp[i].length()).toLowerCase();
			rev=rev+ " " + rev1+rev2;
		}
		System.out.println(rev.trim());
		 */
		
		// reverse second word of string "good morning"
		
		/*
		String res="";
		for(int i=0;i<sp[1].length();i++)
		{
			rev=sp[1].charAt(i)+rev;
			String rev1=rev.substring(0, 1).toUpperCase();
			String rev2=rev.substring(1, rev.length());
			res=rev1+rev2;
		}
		sp[1]=res;
		for(String s1:sp)
		{
			System.out.print(s1+ " ");
		}
		*/
		
		//count word in string and character in string
		
		int c=1;
		int d=0;
		for(int i=0;i<s.length();i++) 
			
		{
			if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
			{
				c++;
			}
		}
		System.out.println("words "+c);
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				d++;
			}
		}
		System.out.println("character "+d);

	}

}
