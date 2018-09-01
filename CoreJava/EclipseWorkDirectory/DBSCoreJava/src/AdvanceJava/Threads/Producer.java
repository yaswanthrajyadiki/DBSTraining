package AdvanceJava.Threads;


public class Producer implements Runnable{
	
	private Resource resource;
	
	public Producer(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		this.add("Raju");
		this.add("Somu");
		this.add("Srikanth");
		this.add("Deepu");
		this.add("Sravya");
		this.add("Kumar");
		this.add("Somesh");
		this.add("Rajesh");
		this.add("Amey");
		this.add("Santhosh");
		this.add("Bhumesh");
		this.add("Ali");
		this.add("Basha");
	}
	
	public synchronized void add(String document) {
		this.resource.add(document);
	}

}
