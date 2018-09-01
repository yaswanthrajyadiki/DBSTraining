package ExamDay3;

import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerId;
	private String fname;
	private String lname;
	private String counter;
	private Address address;
	
	public Customer() {
		
	}
	
	public Customer(String customerId, String fname, String lname, String counter, 
			String street_no, String street, String city, String state) {
		this.customerId = customerId;
		this.fname = fname;
		this.lname = lname;
		this.counter = counter;
		this.address = new Address(street_no, street, city, state);
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCounter() {
		return counter;
	}

	public void setCounter(String counter) {
		this.counter = counter;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fname=" + fname + ", lname=" + lname + ", counter=" + counter
				+ ", address=" + address + "]";
	}
	
}
