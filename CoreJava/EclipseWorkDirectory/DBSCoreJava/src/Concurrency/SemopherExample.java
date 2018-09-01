package Concurrency;

import java.util.concurrent.Semaphore;

public class SemopherExample {

	static Semaphore semaphore = new Semaphore(4);
	
	static class MyATMThread extends Thread {
		
		String name;
		
		public MyATMThread(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			try {
				System.out.println(name + ": acquiring lock..");
				System.out.println(name + ": available semaphore permits " + semaphore.availablePermits());
				semaphore.acquire();
				for(int i = 0; i < 5; i++) {
					System.out.println(name + ": i is " + i 
							+ " and available semaphore permits " + semaphore.availablePermits());
					sleep(1000l);
				}
			} catch(Exception e){
				System.out.println(e);
			} finally {
				System.out.println(name + ": releasing lock..");
				semaphore.release();
				System.out.println("available semaphore permits " + semaphore.availablePermits());
			}
		}
	}
	
	public static void main(String[] args) {
		MyATMThread t1 = new MyATMThread("A");
		t1.start();
		MyATMThread t2 = new MyATMThread("B");
		t2.start();
		MyATMThread t3 = new MyATMThread("C");
		t3.start();
		MyATMThread t4 = new MyATMThread("D");
		t4.start();
		MyATMThread t5 = new MyATMThread("E");
		t5.start();
		MyATMThread t6 = new MyATMThread("F");
		t6.start();
		MyATMThread t7 = new MyATMThread("G");
		t7.start();
	}

}
