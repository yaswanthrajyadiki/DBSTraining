package Concurrency;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	Map<String, String> map = new HashMap<String, String>();
	
	public void set(String key, String value) {
		this.map.put(key, value);
	}
	
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.set("java", "object oriented");
		dictionary.set("linux", "rulez");
		Writer writer = new Writer(dictionary, "Writer");
		Reader reader1 = new Reader(dictionary, "Reader 1");
		Reader reader2 = new Reader(dictionary, "Reader 2");
		Reader reader3 = new Reader(dictionary, "Reader 3");
		Reader reader4 = new Reader(dictionary, "Reader 4");
		Reader reader5 = new Reader(dictionary, "Reader 5"); 
		Reader reader6 = new Reader(dictionary, "Reader 6");
		writer.start();
		reader1.start();
		reader2.start();
		reader3.start();
		reader4.start();
		reader5.start();
		reader6.start();
	}

}
