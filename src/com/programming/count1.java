package com.programming;

public class count1 {

	public static void main(String[] args) {

String str ="GoodMorning";
int i,len;
len = str.length();
int c[]=new int[256];
for(i=0;i<len;i++) 
{
	c[(int)str.charAt(i)]++;
}
for(i=0;i<256;i++)
{
	if(c[i]!=0)
	{
		System.out.print((char)i+""+c[i]);
	}
}

}
}
