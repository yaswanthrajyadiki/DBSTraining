import com.XYZ;

public class DBSHello {
	int a,b;
	String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	DBSHello() {
		a= 5;
		b = 6;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	DBSHello(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void some(String s) {
		s = null;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Everyone. Welcome DBS!!!");
		XYZ.var = 10;
		System.out.println("XYZ's finalVar" + XYZ.finalVar);
		DBSHello hello = new DBSHello();
		DBSHello helloEveryone = new DBSHello(1, 2);
		System.out.println("Object hello has a as "  + hello.a + " and b as " + hello.b);
		System.out.println("Object helloEveryone has a as "  + helloEveryone.a 
				+ " and b as " + helloEveryone.b);
		// Call by value
		hello.setA(1);
		
		String name = "Raju";
		// Call by reference
		hello.some(name);
		System.out.println(name);
		
		Utility utility = Utility.getUtilityObj();
		System.out.println(utility.flag);
		
		
	}

}
