package com.basePart2;

public class threadInterfaceLamda {

	public static void main(String[] args) throws InterruptedException {
				
		Thread t1 = new Thread(()->
		{
		for(int i = 0 ; i <=5 ; i++)
		{
		System.out.println("Hi");
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
		
		//System.out.println("Testing thread is Alive/Active :" + t1.isAlive());
		
		t1.join();  // thread join method
		t2.join();
		
		System.out.println("Testing join() thread method");
		System.out.println("Testing thread is Alive/Active :" + t1.isAlive());  // thread is alive method
		
	}

}
