package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.mysql.jdbc.PreparedStatement;

import Model.UserModel;

public class DBUser {

	// function to read user
	public static UserModel GetUser(String username, String password) {
		String MyQuery = "SELECT * FROM users, clients, deliverers_login, managers, restaurateurs WHERE users.username='"
				+ username + "' AND users.password='" + password + "' AND users.status=1 OR clients.client_username='"
				+ username + "' AND clients.client_password='" + password
				+ "' AND clients.status=1 OR deliverers_login.username='" + username
				+ "' AND deliverers_login.password='" + password
				+ "' AND deliverers_login.status=1 OR managers.username='" + username + "' AND managers.password='"
				+ password + "' AND managers.status=1 OR restaurateurs.username='" + username
				+ "' AND restaurateurs.password='" + password + "' AND restaurateurs.status=1";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			if (stmt.next())
				return new UserModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getInt(4));
			else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// check if username exists
	/*public static UserModel CheckUser(String username) {
		String MyQuery = "SELECT * FROM users, clients, deliverers_login, managers, restaurateurs WHERE users.username=? AND users.status=1 OR clients.client_username=? AND clients.status=1 OR deliverers_login.username=? AND deliverers_login.status=1 OR managers.username=? AND managers.status=1 OR restaurateurs.username=? AND restaurateurs.status=1";
		ResultSet resultset;	
		PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, username);
			stmt.setString(1, username);
			stmt.setString(1, username);
			stmt.setString(1, username);
			stmt.setString(1, username);

			resultset = stmt.executeQuery();
			if(resultset.next())
				return new UserModel(resultset.getInt(1), resultset.getString(2));
			else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}*/

	// function to add user

	public static void AddUser(UserModel userModel) {
		String username = userModel.getUsername();
		String password = userModel.getPassword();
		int access_lvl = userModel.getAccess_lvl();
		String MyQuery = "{CALL create_user(?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, access_lvl);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// function to update user
	public static UserModel UpdateUser(int id, String username, String password, int access_lvl) {
		String MyQuery = "{CALL update_user(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setInt(4, access_lvl);
			stmt.executeUpdate();
			return new UserModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static UserModel UpdateUser(UserModel userModel) {
		int id = userModel.getId();
		String username = userModel.getUsername();
		String password = userModel.getPassword();
		int access_lvl = userModel.getAccess_lvl();
		String MyQuery = "{CALL update_user(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setInt(4, access_lvl);
			stmt.executeUpdate();
			return new UserModel(stmt.toString());
		} catch (SQLException e) {
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
