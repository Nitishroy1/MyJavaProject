package com.multihtreadingdemo;

public class MuthithreadingDemo extends Thread {
	
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				IO.println(i+" by "+ Thread.currentThread().getName());
			}
		}
	}
   void main() {
	   MuthithreadingDemo t=new MuthithreadingDemo();
	   t.start();
	   for(int i=1;i<=100;i++) {
			if(i%2==0) {
				IO.println(i+" by "+ Thread.currentThread().getName());
			}
		}
   }
}
