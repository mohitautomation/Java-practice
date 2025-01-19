package com.basicpractice;

class A
{
 public A()
 {
	 System.out.println("in A");
 }
 public A(int i)
 {
	 System.out.println("in A param");
 }
}

class B extends A
{
 public B()
 {
	 super(7);
	 System.out.println("in B");
 }
 public B(int i)
 {
	 super(i);
	 System.out.println("in B param");
 }
}



public class superM {

	public static void main(String[] args) {
	
		B obj = new B();
		B obj1 = new B(8);

	}

}
