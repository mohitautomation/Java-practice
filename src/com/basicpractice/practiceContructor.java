package com.basicpractice;

public class practiceContructor {

public static void main(String[] args)

{

	classChild obj = new classChild(4,5);
		String out1 = obj.add();
		int out2 = obj.multi();
		
		System.out.println(out1);
		System.out.println(out2);
		
		
		obj.init();
		
		
		

}

}
