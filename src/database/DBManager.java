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
	
	public static ManagerModel getManager(int id) {
		String MyQuery = "SELECT * from managers WHERE manager_id='" + id + "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			return new ManagerModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getInt(4), stmt.getInt(5), stmt.getInt(6));
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
		String MyQuery = "{CALL create_manager(?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setInt(3, restaurant_id);
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
		String MyQuery = "{CALL update_manager(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setInt(4, restaurant_id);
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
