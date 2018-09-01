package com;

import java.util.Arrays;

public class Initiate {

	public static void main(String[] args) {
		DatabaseConnection dbConn = new DatabaseConnection();
		System.out.println(dbConn.getAllRowsInTabale("customer"));
		String[] strings = new String[10];
		for(int index = 0; index < strings.length; index++) {
			strings[index] = (char)(index + 65) + "";
		}
		for(int index = 0; index < strings.length; index++) {
			System.out.print(strings[index]);
		}
		System.out.println();
		Integer[] number = {4, 3, 2, 1};
		for(int index = 0; index < number.length; index++) {
			System.out.print(number[index]);
		}
		System.out.println();
		Arrays.sort(number);
		System.out.println(number[1]);
	}

}
