package com.basicpractice;

public class classChild extends parentClass{

	public int i,l;
	public int j;
	public int result ;
	public String test= "ABC";
	public int k=200;
	
	
	public classChild()
	{
			i=10;
			j=11;				
	}
	
	public classChild(int i, int j)
	{
		 this.i=14;
		 this.j=15;
	}
	
	public void init()
	{
		/*k=11;
		l=11;
		int sum = k+l;
		return sum;*/
		
		System.out.println(this.k);
				
	}
	
	public String add()
	{
	  String replaceE = test.replace("A", "B");
	  return replaceE;
	}
	 public int multi()
	{		
		 result = i*j;
		 return result;
	}
	
}
