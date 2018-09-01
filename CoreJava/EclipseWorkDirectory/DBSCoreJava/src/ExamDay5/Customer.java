package ExamDay5;

public class Customer implements Comparable<Customer> {

	Integer id;
	String name;
	
	public Customer(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Customer customer) {
		return this.id - customer.id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

}
