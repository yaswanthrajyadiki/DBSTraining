package ExamDay5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunMain {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(21, "Ramu"));
		customers.add(new Customer(1, "Somu"));
		customers.add(new Customer(12, "Muttu"));
		customers.add(new Customer(15, "Basha"));
		customers.add(new Customer(6, "Manikyam"));
		System.out.println("Before soritng the list of customers by id");
		System.out.println(customers);
		Thread thread = new Thread() {
			@Override
			public void run() {
//				Collections.sort(customers);
				for(int i = 0; i < customers.size(); i++) {
					Customer min = customers.get(i);
					int minIndex = i;
					for(int j = i; j < customers.size(); j++) {
						if(min.compareTo(customers.get(j)) > 0) {
							min = customers.get(j);
							minIndex = j;
						}
					}
					customers.add(i, customers.remove(minIndex));
				}
				System.out.println("After soritng the list of customers by id");
				System.out.println(customers);
			}
		};
		thread.start();
	}

}
