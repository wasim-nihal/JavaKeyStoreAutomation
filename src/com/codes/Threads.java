package com.codes;

public class Threads implements Runnable{
	Thread t;
	String name;
	
	public Threads(String s)
	{
		t=new Thread(this,s);
		t.start();
		
	}
	
	public void run()
	{
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t.getName()+"   "+i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e){
			System.out.println(e);
			
		}
	}

	

}
