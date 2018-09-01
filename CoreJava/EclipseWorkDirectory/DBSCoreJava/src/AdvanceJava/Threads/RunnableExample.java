package AdvanceJava.Threads;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Inside thread RunnableExample " + name);
		for(int i =0; i < 5; i++) {
			System.out.println("From RunnableExample thread " + name + " i = " + i);
		}
		System.out.println("End of thread RunnableExample " + name);
	}

	public static void main(String[] args) {
		RunnableExample runnableExp = new RunnableExample();
		Thread thread = new Thread(runnableExp);
		thread.setName("thread A");
		Thread thread1 = new Thread(new RunnableExample());
		thread1.setName("thread B");
		thread1.setPriority(10);
		thread.start();
		System.out.println("End of main thread");
		thread1.start();
	}

}
