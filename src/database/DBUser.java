package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.UserModel;
public class DBUser{
	//function to read user
	public static UserModel GetUser(String username){
		String MyQuery = "SELECT * from users WHERE username='" + username +"'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			return new UserModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	//function to add user
	public static void AddUser(UserModel user){
		String MyQuery = "INSERT INTO users VALUES (DEFAULT, '" + user.getUsername() + "', '" + user.getPassword() + "', '" + user.getAccess_lvl() + "', 1);" ;
		try{
			DBConnecter.Connect.createStatement().executeUpdate(MyQuery);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// function to update user
	public static UserModel UpdateUser(int id, String username, String password){
		String MyQuery = "UPDATE users SET username='" + username + "', password='" + password + "' WHERE user_id='" + id + "'" ;
		ResultSet stmt;
		try{
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			return new UserModel(stmt.getString(1));
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	//function to soft delete user
	public static UserModel DeleteUser(int id){
		String MyQuery = "UPDATE users SET status='0' WHERE user_id='" + id + "'" ;
		ResultSet stmt;
		try{
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			return new UserModel(stmt.getString(1));
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}

