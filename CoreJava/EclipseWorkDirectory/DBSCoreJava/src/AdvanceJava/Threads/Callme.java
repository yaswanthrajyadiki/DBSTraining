package AdvanceJava.Threads;

public class Callme {

	synchronized public void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000l);
		} catch (Exception e) {
			System.out.println("Interepted");
		}
		System.out.println("]");
	}

}
