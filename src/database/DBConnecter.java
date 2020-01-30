package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnecter{
	protected Connection Connect;
	
	private String host = "jdbc:mysql://localhost/block3m1";
	private String username = "root";
	private String password = "";
	
	public DBConnecter() {
		try {
			
			Connect = DriverManager.getConnection(host, username, password);
			Statement stmt = Connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from animal limit 1");
			
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3));
			Connect.close();
			

			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
