package com.baseRevision2;

public class printRepeatingwords {

	public static void main(String[] args) {
		
		String str = "Good is Morn is ng is ng";
		String s[]=str.split(" ");
		int c;
		
		for(int i=0;i<s.length;i++)
		{
			c=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					c++;
					s[j]="0";
				}
			}
			if(c>1 && s[i]!="0")
			{
				System.out.println(s[i]);
			}
		}

	}

}
