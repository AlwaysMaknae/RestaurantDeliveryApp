package database;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;
import Model.RestaurateurModel;

public class DBRestaurateur {
	// function to read restaurateur
	public static RestaurateurModel GetRestaurateur(String username, String password) {
		String MyQuery = "SELECT * from restaurateurs WHERE username='" + username
				+ "' AND password='" + password + "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new RestaurateurModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// function to add restaurateur

	public static void AddRestaurateur(RestaurateurModel restaurateurModel) {
		String username = restaurateurModel.getUsername();
		String password = restaurateurModel.getPassword();
		int restaurant_id = restaurateurModel.getRestaurant_id();
		int access_lvl = restaurateurModel.getAccess_lvl();
		String MyQuery = "{CALL create_restaurateur(?, ?, ?, ?)}";
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

	// function to update restaurateur

	public static RestaurateurModel UpdateRestaurateur(RestaurateurModel restaurateurModel) {
		int id = restaurateurModel.getId();
		String username = restaurateurModel.getUsername();
		String password = restaurateurModel.getPassword();
		int restaurant_id = restaurateurModel.getRestaurant_id();
		int access_lvl = restaurateurModel.getAccess_lvl();
		String MyQuery = "{CALL update_restaurateur(?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setInt(4, restaurant_id);
			stmt.setInt(5, access_lvl);
			stmt.executeUpdate();
			return new RestaurateurModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to soft delete restaurateur
	public static void DeleteRestaurateur(int id) {
		String MyQuery = "{CALL delete_restaurateur(?)}";
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
