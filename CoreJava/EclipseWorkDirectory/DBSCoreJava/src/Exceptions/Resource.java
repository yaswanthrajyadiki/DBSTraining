package Exceptions;

/*
 * Try with resources example 
 */
public class Resource implements AutoCloseable {

	public void hello() {
		System.out.println("Hello resource");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Resource was closed");
	}
	
	private static void del() throws Exception {
		try(Resource resource = new Resource()) {
			resource.hello();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		try {
			Resource.del();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
