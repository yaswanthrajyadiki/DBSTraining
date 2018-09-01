package AdvanceJava.Threads;

public class ThreadExample {
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		A a = new A();
		B b = new B();
		a.start();
		b.start();
		System.out.println("Exit main thread");
	}
	
}


class A extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i ++)
			System.out.println("Thread A and i is " + i);
	}
}


class B extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i ++)
			System.out.println("Thread B and i is " + i);
	}
}
