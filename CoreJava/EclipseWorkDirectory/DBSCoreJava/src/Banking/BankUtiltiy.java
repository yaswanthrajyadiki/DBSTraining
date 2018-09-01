package Banking;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Date;

public class BankUtiltiy {

	public static void main(String[] args) {
		/* Interface and inheritance example
		SavingsAccount rajuAc = new SavingsAccount("ABC0000123", "Raju", "ABC001", 500.0, "ABC21666");
		BankAccount somuAc = new CurrentAccount("ABC0000234", "Somu", "ABC002", 10000.0, "ABC21666");
		rajuAc.calculateIntrest();
		rajuAc.getAccountType();
		System.out.println(rajuAc);
		somuAc.calculateIntrest();
		System.out.println( somuAc.getAccountType());
		System.out.println(somuAc);
		*/
		/*
		 * Console example
		 Console console = System.console();
		if (console != null) {
			console.printf("Hello at %s. Please tell me your name", new Date());
			String name = console.readLine();
			String nat = console.readLine("Thanks %s, now tell me your nationality: ", name);
			char[] pwchars = console.readPassword("Great %s, you are %s! Password?", name, nat);
			String password = new String(pwchars);
			console.printf("Thanks. Your password is: %s", password);
		} else {
			System.out.println("Sorry, console unavailabe.");
		}*/
		/* File example
		String dirName = "D:/Yaswanth/CoreJava/EclipseWorkDirectory/DBSCoreJava/src/Banking/";
		File dir = new File(dirName);
		if(dir.exists()) {
			System.out.printf("Directory %s already exists.", dirName);
		} else {
			dir.mkdirs();
			System.out.printf("Directory %s was created.", dirName);
		}
		String fileName = "bankDetails.csv";
		File bankDetails = new File(dirName + fileName);
		if (bankDetails.exists()) {
			System.out.println("File exists");
		} else {
			try {
				bankDetails.createNewFile();
				System.out.println("File Name: " + bankDetails.getName());
				System.out.println("File absolute path: " + bankDetails.getAbsolutePath());
				System.out.println("Is this file: " + bankDetails.isFile());
				System.out.println("Is this directory: " + bankDetails.isDirectory());
				System.out.println("Can we read this file: " + bankDetails.canRead());
				System.out.println("Can we write this file: " + bankDetails.canWrite());
				System.out.println("Length of the file: " + bankDetails.length());
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}*/
		
		/* FileInputStream example
		try {
			FileOutputStream fout = new FileOutputStream("bankDetails.csv");
			String s = "account_number, customer_name, customer_id, balance, account_type";
			fout.write(s.getBytes());
			fout.close();
			System.out.println("Wrote column names in the file");
		} catch(Exception e) {
			System.out.println(e);
		}*/
		
		/* FileInputStream Example
		try {
			FileInputStream fin = new FileInputStream("bankDetails.csv");
			int i = 0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch(Exception e) {
			System.out.println(e);
		}*/
		
		try {
			FileReader fr = new FileReader("bankDetails.csv");
			int i = 0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	} 

}
 