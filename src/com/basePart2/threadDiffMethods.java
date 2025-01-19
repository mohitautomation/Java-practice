package com.basePart2;

public class threadDiffMethods {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()->
		{
		for(int i = 0 ; i <=5 ; i++)
		{
		System.out.println("Hi" + " " + Thread.currentThread().getPriority());
		
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
		});
		Thread t2 = new Thread(() ->
		{
		for(int i = 0 ; i <=5 ; i++)
		{
		System.out.println("Hello");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
		});
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		t2.start();

		/*t1.setName("Hi Thread");
		System.out.println(t1.getName());*/
		
		/*t1.setPriority(1);
		System.out.println(t1.getPriority());
		t2.setPriority(10);*/
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t2.getPriority());
		
	}

}
