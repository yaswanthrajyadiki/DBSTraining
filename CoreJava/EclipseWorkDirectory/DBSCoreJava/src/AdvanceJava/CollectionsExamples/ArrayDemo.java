package AdvanceJava.CollectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] x[] = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
		String[][] y = x;
		System.out.println(y[2][2]);
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add(1);
		System.out.println(al.get(1).getClass().getSimpleName());
		System.out.println(al.get(0).getClass().getSimpleName());
		
		ArrayList<String> alOfStrings = new ArrayList<>();
		alOfStrings.add("hello everyone!");
		alOfStrings.add("haaa");
		for(String a: alOfStrings) {
			System.out.println(a);
		}
		Collections.sort(alOfStrings); 
		System.out.println(alOfStrings);
//		ListIterator itr = alOfStrings.listIterator();
//		while(itr.hasPrevious())
//			System.out.println(itr.previous());
//		Set set = new HashSet();
//		set.addAll(alOfStrings);
//		System.out.println(set);
//		Set treeSet = new TreeSet(alOfStrings);
//		System.out.println(treeSet);
//		
//		HashMap hm = new HashMap();
//		hm.put(1, "DBS");
//		hm.put(2, "HSBC");
//		Set s = hm.entrySet();
//		Iterator setItr = s.iterator();
//		while(setItr.hasNext()) {
//			Map.Entry element = (Map.Entry)setItr.next();
//			System.out.println("Key: " + element.getKey() + ", Value: " + element.getValue());
//		}
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Raju", 21, 700000.0));
		employees.add(new Employee("Somu", 22, 600000.0));
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(!o1.name.equals(o2.name))
					return o1.name.compareTo(o2.name);
				else if (!o1.age.equals(o2.age))
					return o1.age.compareTo(o2.age);
				return o1.salary.compareTo(o2.salary);
			} 
		});
		System.out.println(employees);
		
	}

}

class Employee implements Comparable<Employee>{
	String name;
	Integer age;
	Double salary;
	
	Employee() {
		
	}
	
	Employee(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(!this.name.equals(o.name))
			return this.name.compareTo(o.name);
		else if (!this.age.equals(o.age))
			return this.age.compareTo(o.age);
		return this.salary.compareTo(o.salary);
	}
	
}