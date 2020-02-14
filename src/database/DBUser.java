package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.ClientModel;

//import com.mysql.jdbc.PreparedStatement;

import Model.UserModel;

public class DBUser {

	// function to read user


	public static UserModel GetUser(String username, String password) {
		String MyQuery = "SELECT user_id, username, password, access_lvl FROM users WHERE users.username=? AND users.password=? AND users.status=1"
				+ " UNION " 
				+ "SELECT deliverer_id, username, password, access_lvl FROM deliverers WHERE deliverers.username=? AND deliverers.password=? AND deliverers.status=1"
				+ " UNION "
				+ "SELECT manager_id, username, password, access_lvl FROM managers WHERE managers.username=? AND managers.password=? AND managers.status=1"
				+ " UNION "
				+ "SELECT restaurateur_id, username, password, access_lvl FROM restaurateurs WHERE restaurateurs.username=? AND restaurateurs.password=? AND restaurateurs.status=1"
				+ " UNION "
				+ "SELECT client_id, client_username, client_password, access_lvl FROM clients WHERE clients.client_username=? AND clients.client_password=? AND clients.status=1";
		ResultSet resultset;
		PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, username);
			stmt.setString(4, password);
			stmt.setString(5, username);
			stmt.setString(6, password);
			stmt.setString(7, username);
			stmt.setString(8, password);
			stmt.setString(9, username);
			stmt.setString(10, password);

			resultset = stmt.executeQuery();
			while (resultset.next()) {

				return new UserModel(resultset.getInt(1), resultset.getString(2), resultset.getString(3), resultset.getInt("access_lvl"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	public static UserModel getUser(int id) {
		String MyQuery = "SELECT * from users WHERE user_id='" + id +"' AND users.status=1";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			while (stmt.next()){
				return new UserModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getInt(4), stmt.getInt(5));
			}
			} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	// check if username exists
	/*
	 * public static UserModel CheckUser(String username) { String MyQuery =
	 * "SELECT * FROM users, clients, deliverers_login, managers, restaurateurs WHERE users.username=? AND users.status=1 OR clients.client_username=? AND clients.status=1 OR deliverers_login.username=? AND deliverers_login.status=1 OR managers.username=? AND managers.status=1 OR restaurateurs.username=? AND restaurateurs.status=1"
	 * ; ResultSet resultset; PreparedStatement stmt; try { stmt =
	 * DBConnecter.Connect.prepareStatement(MyQuery); stmt.setString(1,
	 * username); stmt.setString(2, username); stmt.setString(3, username);
	 * stmt.setString(4, username); stmt.setString(5, username);
	 * 
	 * resultset = stmt.executeQuery(); if(resultset.next()) return new
	 * UserModel(resultset.getInt(1), resultset.getString(2),
	 * resultset.getString(columnIndex)); else return null; } catch
	 * (SQLException e) { e.printStackTrace(); return null; } }
	 */

	// function to add user

	public static void AddUser(UserModel userModel) {
		String username = userModel.getUsername();
		String password = userModel.getPassword();
		String MyQuery = "{CALL create_user(?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// function to update user

	public static UserModel UpdateUser(UserModel userModel) {
		int id = userModel.getId();
		String username = userModel.getUsername();
		String password = userModel.getPassword();
		String MyQuery = "{CALL update_user(?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
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
