package Risk;

import java.util.Scanner;

public class RiskyClass {
	
	public static void main(String[] args) {
//		System.out.println("I am in RiskyClass");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Plese enter your name");
//		String name = sc.nextLine();
//		System.out.println("You entered your name as : " + name);
//		sc.close();
//		StringBuffer sb = new StringBuffer();
//		sb.append("Hello world");
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append(sb + "! hoooooo");
//		System.out.println(stringBuilder.toString());
		Integer number = new Integer(671);
		System.out.println(number);
		Double doubleNumber = Double.valueOf(number);
		System.out.println(doubleNumber);
		number = number - 10;
		number++;
		System.out.println(number);
	}

}
