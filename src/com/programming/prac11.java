package com.programming;

public class prac11 {

	public static void main(String[] args) {
		
		int p = 1558;
		 int rev=0,rim;
		 
		 int o=p;
		 while(p!=0)
		 {
			rim=p%10;
			rev=rev*10+rim;
			p=p/10;
		 }
		 System.out.println(rev);
	}

}
