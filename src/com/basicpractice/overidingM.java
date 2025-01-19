package com.basicpractice;


class AA
{
	int i;
	public void show()
	{

		System.out.println("A show" + " " + i );
	}
}

class BB extends AA
{
	int i ;
	@Override	
	public void show()
	{
		
		super.i= 9;
		super.show();
		System.out.println("B show" + " " + i);
	}
}

public class overidingM {

	public static void main(String[] args) {

		//BB obj = new BB();
		AA obj = new BB();  // dynamic method dispatch
		
		obj.show();

	}

}
