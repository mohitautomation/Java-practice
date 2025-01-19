package com.baseCollection;

public class p3 {

	public static void main(String[] args) {

		int num = 3512, reversedNum = 0, remainder;
		
		int origNum=num; // for pallendrome checking
		while(num!=0)
		{
			remainder = num%10;
			reversedNum = reversedNum*10+remainder;
			num/=10;
		}
		System.out.println(reversedNum);
	}

}
