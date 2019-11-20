package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);//pause the execution of current thread for whatever time mentioned in this method
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
