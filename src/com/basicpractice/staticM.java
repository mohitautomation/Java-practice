package com.basicpractice;
// Static method can be called with class name - Object not required

interface Demo1
{
	static int i = 8;
	void show();
	static void draw()
	{
		System.out.println("Hello");
	}
}

class Mydemo1 implements Demo1
{
	public void show()
	{
		//i = 10;
	}
}


public class staticM {

	public static void main(String[] args) {

		Demo1.draw();
		//Demo1.i=10;

	}

}
