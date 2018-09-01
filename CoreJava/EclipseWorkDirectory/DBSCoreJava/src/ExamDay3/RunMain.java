package ExamDay3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RunMain {

	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		customers[0] = new Customer("CUST1", "Manik", "Basha", "2", "4", "OrionMall", "Mumbai", "Maharastra");
		customers[1] = new Customer("CUST2", "Kaala", "Kari", "3", "5", "Daravi", "Mumbai", "Maharastra");
		customers[2] = new Customer("CUST3", "Vasikaran", "Chitti", "4", "7", "AnnaNagar", "Chennai", "TamilNadu");
		try {
			File customerSerailizerFile = new File("customers");
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(customerSerailizerFile));
			out.writeObject(customers);
//			for(int i = 0; i < customers.length; i++) {
//				out.writeObject(customers[i]);
//			}
			out.flush();
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(customerSerailizerFile));
			customers = (Customer[]) in.readObject();
			in.close();
			System.out.println(customers[0]);
			System.out.println(customers[1]);
			System.out.println(customers.length);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
