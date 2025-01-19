package com.basicpractice;

//post java 1.8 we can now define method in interface using default keyword


//will have only one asbtract method - @FunctionalInterface

@FunctionalInterface          
interface Demo
{
	void show();	
	default void draw()
	{
		System.out.println("Use of default demo method in interface");
	}
}

interface MyDemo
{
	default void draw()
	{
		System.out.println("Use of default MyDemo method in interface");
	}
}

// As we can't create object for interface we implement it in class

class Abc implements Demo,MyDemo
{
	public void show()
	{
		System.out.println("Created implemeted class to create object");
	}
	/*public void draw()
	{
		System.out.println("Created Overiding happpening implemeted class to create object");
	}*/

	@Override
	public void draw() {
		
		MyDemo.super.draw();
	}
}


public class defaultInterface {

	public static void main(String[] args) {

		Demo obj = new Abc();
		obj.show();
		obj.draw();

	}

}
