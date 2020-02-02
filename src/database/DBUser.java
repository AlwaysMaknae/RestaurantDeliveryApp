package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import Model.UserModel;
public class DBUser{
	//function to read user
	public static UserModel GetUser(String username){
		String MyQuery = "SELECT * from users WHERE username='" + username +"'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new UserModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	//function to add user
	public static UserModel AddUser(String username, String password, int access_lvl){
		String MyQuery = "INSERT INTO users VALUES (DEFAULT, ?, ?, ?, DEFAULT);" ;
		java.sql.PreparedStatement stmt;
		try{
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, access_lvl);
			stmt.executeUpdate();
			return new UserModel(stmt.toString());
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	// function to update user
	public static UserModel UpdateUser(int id, String username, String password){
		String MyQuery = "UPDATE users SET username=?, password=? WHERE user_id=?" ;
		java.sql.PreparedStatement stmt;
		try{
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, id);
			stmt.executeUpdate();
			return new UserModel(stmt.toString());
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	//function to soft delete user
	public static UserModel DeleteUser(int id){
		String MyQuery = "UPDATE users SET status='0' WHERE user_id=?" ;
		java.sql.PreparedStatement stmt;
		try{
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			return new UserModel(stmt.toString());
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

