package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnecter{
	public static Object stmt;

	public static Connection Connect;
	
	private static String host = "jdbc:mysql://localhost/block3m1";
	private static String username = "root";
	private static String password = "";
	
	public DBConnecter() {
		//Getter and setter for string properties
		
	}
	
	public static void OpenConnection(){
		try {
			Connect = DriverManager.getConnection(host, username, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void CloseConnection(){
		try {
			Connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
