/*
 * This class wrote for assessment on 2nd day of Java
 * Question:
 * 	Create a class product with id, pname, price where price has to be a transient variable.
 * 	Create a code to serialize and deserialize this object using a file?
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id;
	String pname;
	transient Double price;
	
	public Product() {
		
	}
	
	public Product(String id, String pname, Double price) {
		this.id = id;
		this.pname = pname;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		Product prod = new Product("TVS123", "TVS Super XL", 30000.0);
		// Serialization
		try {
			File productsSerailizableFile = new File("products");
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(productsSerailizableFile));
			out.writeObject(prod);
			out.flush();
			out.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		// Deserialization
		try {
			File productsSerailizableFile = new File("products");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(productsSerailizableFile));
			prod = (Product) in.readObject();
			System.out.println(prod);
			in.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
		
}
