package org.ThreadExampLE.Sharedresource;

public class SharedREsource {


synchronized	 public void Sequence1()
	{
		Thread th1=Thread.currentThread();
		String sname =th1.getName();
		
		System.out.println("printinh 1-10");
		
		for (int i = 1; i <=10; i++) {
			
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
 public void sequence()
	{
		
		Thread th1=Thread.currentThread();
		String sname =th1.getName();
		
		System.out.println("printinh 11-20");
		
		for (int i = 11; i <=20; i++) {
			
			System.err.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}





	}}
