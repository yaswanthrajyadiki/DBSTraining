package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UtilityMain {

	public static void main(String[] args) {
		Utility<Integer> swap = (a, b) -> {
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("After swap a: " + a + " and b:" + b);
		};
		int a = 1;
		int b = 2;
		System.out.println("Before swap a: " + a + " and b:" + b);
		swap.swap(a, b);
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println("Print all numbers: ");
		eval(list, n->true);
		System.out.println("Print even numbers: ");
		eval(list, n->{
			if (n%2 == 0)
				return true;
			else
				return false;
		});
		System.out.println("Print odd numbers: ");
		eval(list, n->{
			if (n%2 != 0)
				return true;
			else
				return false;
		}); 
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> p) {
		for(Integer n : list) {
			if(p.test(n)) {
				System.out.println(n);
			}
		}
	}
}
