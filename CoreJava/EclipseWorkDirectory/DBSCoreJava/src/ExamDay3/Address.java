package ExamDay3;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String street_no;
	private String street;
	private String city;
	private String state;
	
	public Address() {
		
	}
	
	public Address(String street_no, String street, String city, String state) {
		this.street_no = street_no;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public String getStreet_no() {
		return street_no;
	}

	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street_no=" + street_no + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
