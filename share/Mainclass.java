package org.ThreadExampLE.Sharedresource;

public class Mainclass
{
	public static void main(String[] args) {
		
		SharedREsource sr1=new SharedREsource();
		 
		TThread t1=new TThread(sr1);
		TThread t2=new TThread(sr1);
		t1.start();
		t1.setPriority(1);
		t2.start();
		t2.setPriority(2);
		
		
	}

}
