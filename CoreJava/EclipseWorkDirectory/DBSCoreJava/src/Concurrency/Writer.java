package Concurrency;

public class Writer extends Thread {
	
	Dictionary dictionary;
	String name;
	
	public Writer(Dictionary dictionary, String name) {
		this.dictionary = dictionary;
		this.name = name;
	}

	@Override
	public void run() {
		
	}
}
