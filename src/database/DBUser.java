package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.UserModel;
public class DBUser{
	
	
	
	
	
	public static UserModel GetUser(int id){
		String MyQuery = "Select * from clients limit 1";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			return new UserModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}

