package database;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;

import Model.UserModel;
public class DBUser{
	
	
	//function to read user
	public static UserModel GetUser(String username, String password){
		String MyQuery = "SELECT * from users WHERE username='" + username +"' AND password='" + password + "'";
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
	
	public static void getAllUsers(String username){
		String MyQuery = "{CALL get_all_users(?)}" ;
		java.sql.PreparedStatement stmt;
		try{
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, username);
			stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//function to add user
	
	public static void AddUser(UserModel userModel) {
		String username = userModel.getUsername();
		String password = userModel.getPassword();
		int access_lvl = userModel.getAccess_lvl();
		String MyQuery = "{CALL create_user(?, ?, ?)}" ;
		java.sql.PreparedStatement stmt;
		try{
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, access_lvl);
			stmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// function to update user
	public static UserModel UpdateUser(int id, String username, String password, int access_lvl){
		String MyQuery = "{CALL update_user(?, ?, ?, ?)}" ;
		java.sql.PreparedStatement stmt;
		try{
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setInt(4, access_lvl);
			stmt.executeUpdate();
			return new UserModel(stmt.toString());
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static UserModel UpdateUser(UserModel userModel){
		int id = userModel.getId();
		String username = userModel.getUsername();
		String password = userModel.getPassword();
		int access_lvl = userModel.getAccess_lvl();
		String MyQuery = "{CALL update_user(?, ?, ?, ?)}" ;
		java.sql.PreparedStatement stmt;
		try{
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setInt(4, access_lvl);
			stmt.executeUpdate();
			return new UserModel(stmt.toString());
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// function to soft delete user
	public static void DeleteUser(int id) {
		String MyQuery = "{CALL delete_user(?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

