package AdvanceJava.Threads;

public class Caller implements Runnable {

	Callme target;
	Thread t;
	String name;
	
	Caller(Callme targ, String s) {
		name = s;
		target = targ;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
//		synchronized (target) {
			target.call(name);
//		}
	}

}
