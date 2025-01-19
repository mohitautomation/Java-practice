package com.basicpractice;

// in abstract method - we can declare and define methods

abstract class testA
{
	public abstract void eat();
	public void walK()
	{
		
	}
	
}

interface testB
{
	void study();
}

class eat extends testA  implements testB// concrete class
{
	public void eat()
	{
		
	}
	public void study()
	{
		
	}
}

public class abstractM {

	public static void main(String[] args) {
		
		//testA obj = new testA();
		testA obj1 = new eat();
		

    // or use anonymous class 
		testA obj2 = new testA()
				{
						public void eat()
						{
							
						}
				};
				// we can now remove repeating sub/class or sub interface
				testB obj5 = new testB()
						{
							public void study()
							{
								
							}
						};
	}

}
