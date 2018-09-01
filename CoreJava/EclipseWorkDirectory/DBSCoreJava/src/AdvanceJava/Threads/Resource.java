package AdvanceJava.Threads;

import java.util.ArrayList;
import java.util.List;

public class Resource {

	final int LIMIT = 10;
	private List<String> documents;
	
	public Resource() {
		this.documents = new ArrayList<>(this.LIMIT);
	}

	public void remove() {
		try {
			if (!documents.isEmpty()) {
				System.out.println("Removing document " + documents.get(0) + " from queue");
				this.documents.remove(0);
			} else {
				System.out.println("Queue was empty");
				notify();
				wait();
			}
		} catch(Exception e) {
			System.out.println(e + " " + Thread.currentThread().getName());
		}
	}

	public void add(String document) {
		try {
			System.out.println("Adding document " + document + " to queue");
			if(this.documents.size() < this.LIMIT) {
				this.documents.add(document);
			} else {
				System.out.println("Queue was full");
				notify();
				wait();
			}
		}  catch(Exception e) {
			System.out.println(e + " " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		Resource resource = new Resource();
		Producer producer = new Producer(resource);
		Thread producerThread = new Thread(producer);
		Consumer consumer = new Consumer(resource);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}

}
