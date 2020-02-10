package database;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
import Model.ManagerModel;

public class DBManager {
	// function to read manager
	public static ManagerModel GetManager(String username, String password) {
		String MyQuery = "SELECT * from managers WHERE username='" + username
				+ "' AND password='" + password + "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new ManagerModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// function to add manager

	public static void AddManager(ManagerModel managerModel) {
		String username = managerModel.getUsername();
		String password = managerModel.getPassword();
		int restaurant_id = managerModel.getRestaurant_id();
		int access_lvl = managerModel.getAccess_lvl();
		String MyQuery = "{CALL create_manager(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, restaurant_id);
			stmt.setInt(4, access_lvl);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// function to update user

	public static ManagerModel UpdateManager(ManagerModel managerModel) {
		int id = managerModel.getId();
		String username = managerModel.getUsername();
		String password = managerModel.getPassword();
		int restaurant_id = managerModel.getRestaurant_id();
		int access_lvl = managerModel.getAccess_lvl();
		String MyQuery = "{CALL update_manager(?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setInt(4, restaurant_id);
			stmt.setInt(5, access_lvl);
			stmt.executeUpdate();
			return new ManagerModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to soft delete user
	public static void DeleteManager(int id) {
		String MyQuery = "{CALL delete_manager(?)}";
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