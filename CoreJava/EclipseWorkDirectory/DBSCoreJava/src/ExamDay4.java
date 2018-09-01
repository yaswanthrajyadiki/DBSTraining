import java.util.*;
/*
 * Assessment on Collections and Threads for Advance Java
 * Question:
 * 	Create a thread
 * 	-> Create a HashMap using a thread
 *  -> Insert 5 values in the HashMap
 *  -> Then display all key value pairs of HashMap
 */
public class ExamDay4 {

	public static void main(String[] args) {
		Thread a = new Thread() {
			public void run() {
				Map<String, String> hashMap = new HashMap<>();
				hashMap.put("Deva", "Das");
				hashMap.put("Shiva", "Mani");
				hashMap.put("Linga", "Raju");
				hashMap.put("Athreya", "Shiva");
				hashMap.put("Rishi", "Kumar");
				for(String key: hashMap.keySet()) {
					System.out.println("Key: " + key + "and Value: " + hashMap.get(key));
				}
			}
		};
		a.start();
	}

}
