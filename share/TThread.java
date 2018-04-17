package org.ThreadExampLE.Sharedresource;

public class TThread extends Thread 
{
 SharedREsource sr;
 public TThread(SharedREsource sr) {
	 this.sr=sr;
 }
 
 @Override
	public void run() {

	sr.Sequence1();
	 sr.sequence();

 }
}
