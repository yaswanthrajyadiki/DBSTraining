package AdvanceJava.Threads;


public class Consumer implements Runnable {
	
	private Resource resource;
	private Thread thread;
	
	public Consumer(Resource resource) {
		this.resource = resource;
		this.thread = new Thread(this);
		this.thread.start();
	}
	
	@Override
	public void run() {
		this.remove();
		this.remove();
		this.remove();
		this.remove();
		this.remove();
		this.remove();
		this.remove();
		this.remove();
	}
	
	public synchronized void remove() {
		this.resource.remove();
	}
	
}
