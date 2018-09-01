/*
 * This class was created for assessment on 1st day of CoreJava
 * Question:
 * 	To create a simple calculator
 */

import java.util.Scanner;

public class Calculator {

	public Integer add(int a, int b) {
		return new Integer(a + b);
	}
	
	public Double add(double a, double b) {
		return new Double(a + b);
	}
	
	public Integer substract(int a, int b) {
		return new Integer(a - b);
	}
	
	public Double substract(double a, double b) {
		return new Double(a - b);
	}
	
	public Integer multiply(int a, int b) {
		return new Integer(a * b);
	}
	
	public Double multiply(double a, double b) {
		return new Double(a * b);
	}
	
	public Integer division(int a, int b) {
		try {
			return new Integer(a / b);
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public Double division(double a, double b) {
		try {
			return new Double(a / b);
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = null;
		Calculator calc = new Calculator();
		do {
			System.out.println("Press your input in following format like a * b");
			input = sc.nextLine();
			String[] splitInput = input.split(" ");
			switch(splitInput[1]) {
				case "+":
					try {
						System.out.println(calc.add(Integer.parseInt(splitInput[0]), 
							Integer.parseInt(splitInput[2])));
					} catch(NumberFormatException e) {
						System.out.println(e);
					} catch(Exception e) {
						System.out.println(calc.add(Double.parseDouble(splitInput[0]), 
								Double.parseDouble(splitInput[2])));
					}
					break;
				case "-":
					try {
						System.out.println(calc.substract(Integer.parseInt(splitInput[0]), 
							Integer.parseInt(splitInput[2])));
					} catch(NumberFormatException e) {
						System.out.println(e);
					} catch(Exception e) {
						System.out.println(calc.substract(Double.parseDouble(splitInput[0]), 
								Double.parseDouble(splitInput[2])));
					}
					break;
				case "*":
					try {
						System.out.println(calc.multiply(Integer.parseInt(splitInput[0]), 
							Integer.parseInt(splitInput[2])));
					} catch(NumberFormatException e) {
						System.out.println(e);
					} catch(Exception e) {
						System.out.println(calc.multiply(Double.parseDouble(splitInput[0]), 
								Double.parseDouble(splitInput[2])));
					}
					break;
				case "/":
					try {
						System.out.println(calc.division(Integer.parseInt(splitInput[0]), 
							Integer.parseInt(splitInput[2])));
					} catch(NumberFormatException e) {
						System.out.println(e);
					} catch(Exception e) {
						System.out.println(calc.division(Double.parseDouble(splitInput[0]), 
								Double.parseDouble(splitInput[2])));
					}
					break;
				default:
					break;
			}
			System.out.println("Please enter exit to quit or press no");
			input = sc.nextLine();
		} while (input == null || !input.equals("exit"));
		sc.close();
	}

}
