package com.programming;

public class prat4 {

	public static void main(String[] args) {
		
		int a[]= {1,3,2,5,4,7,8};
		
		int sum=(8*(8+1))/2;
		int s=0;
for(int i =0;i<8-1;i++ ) {
s+=a[i];	
}
int missingNum= sum-s;
System.out.println(missingNum);
	}

}
