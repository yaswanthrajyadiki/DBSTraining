package ExamDay7;

public class Product {
	
	private String id;
	private String username;
	private String name;
	private Double price;
	private Double quantity;

	public Product() {
		
	}
	
	public Product(String id, String username, String name, Double price, Double quantity) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", username=" + username + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}
