package AdvanceJava.Threads;

public class SynchronizeExample {

	public static void main(String[] args) {
		Callme target = new Callme();
		Caller obj = new Caller(target, "Hello");
		Caller obj1 = new Caller(target, "Synchronized");
		Caller obj2 = new Caller(target, "World");
		obj.t.setPriority(10);
		obj1.t.setPriority(1);
		obj2.t.setPriority(5);
		try {
			obj.t.join();
			obj1.t.join();
			obj2.t.join();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
 