package com.basicpractice;

class Calc   // super // base // parent
{
	public int add(int i , int j)
	{
		return i+j;
	}
}

class CalAc extends Calc   // sub //child / derived
{
	public int sub(int i , int j)
	{
		return i-j;
	}
}

class CalAcc extends CalAc
{
	public int mul(int i , int j)
	{
		return i*j;
	}
}


public class InheritanceT {

	public static void main(String[] args) {

		CalAcc c1 = new CalAcc();
		int result1 = c1.add(4, 5);
		int result2 = c1.sub(4, 5);
		int result3 = c1.mul(4, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
