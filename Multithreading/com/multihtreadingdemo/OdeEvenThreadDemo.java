package com.multihtreadingdemo;

class EvenThread extends Thread{
	
	
	public void run() {
		
		
	for(int i=1;i<=100;i++) {
		if(i%2==0) {
			IO.println(i+" Even No  by "+ Thread.currentThread().getName());
		}
	}
	
}
}
class OddThread extends Thread{
	
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				IO.println(i+" Odd No by "+ Thread.currentThread().getName());
			}
		}
		
	}
}

public class OdeEvenThreadDemo {
	void main() {
		EvenThread e=new EvenThread();
		OddThread o=new OddThread();
		e.start();
		try {
			o.join();
		} catch (Exception e2) {
			IO.println("InteriputedException");
		}
		
		o.start();
	}
	

}
