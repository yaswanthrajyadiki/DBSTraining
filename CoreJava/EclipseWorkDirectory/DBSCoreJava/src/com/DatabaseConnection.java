package com;
import java.sql.*;

public class DatabaseConnection {
	static final String DATABASE_HOST = "localhost";
	static final String DATABASE_PORT = "3306";
	static final String DATABASE_NAME = "banking";
	static final String DATABASE_USER = "root";
	static final String DATABASE_PASSWORD = "dbs123";
	
	private static Connection dbConn = null;
	
	DatabaseConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			if (dbConn == null) {
				dbConn = DriverManager.getConnection("jdbc:mariadb://" + DATABASE_HOST 
					+  ":" + DATABASE_PORT + "/" + DATABASE_NAME
					+ "?user=" + DATABASE_USER + "&password=" + DATABASE_PASSWORD);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public String getAllRowsInTabale(String tableName) {
		return tableName;
	}
	
}
