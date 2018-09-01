package Concurrency;

public class Reader extends Thread {
	
	Dictionary dictionary;
	String name;
		
	public Reader(Dictionary dictionary, String name) {
		this.dictionary = dictionary;
		this.name = name;
	}

	@Override
	public void run() {
		
	}

}
