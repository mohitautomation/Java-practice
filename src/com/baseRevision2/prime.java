package com.baseRevision2;

public class prime {

	public static void main(String[] args) {
		
		/*int num =18;
		Boolean b = false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				b=true;
				break;
			}
		}
		if(!b)
		System.out.println("prime");
		else
			System.out.println("not prime");
			*/
		
		//print prime b/w 1and 100
		
		int num=0;
		int i=0;
		String out="";
		
		for(i=1;i<=100;i++)
		{
			int c=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
				c++;
				}
				
			}
			if(c==2)
			{
			out=out+i+ " " ;	
			}
		}
		System.out.println(out);
		
		
		
	}

}
