package AdvanceJava.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorThreadPool {

	private static final int NTHREADS = 10;
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
		for(int i = 0; i < 13; i++) {
			Runnable work = new MyRunnable(10+i);
			executor.execute(work);
		}
		executor.shutdown();
		try {
			executor.awaitTermination(60000, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Finished all threads");
	}

}

class MyRunnable implements Runnable {
	
	int counter;
	
	public MyRunnable(int counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		long sum = 0;
		for(long i =0; i < this.counter; i++)
			sum += i;
		System.out.println(sum);
	}
}