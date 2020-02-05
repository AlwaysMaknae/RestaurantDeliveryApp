package database;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;

import Model.ClientModel;

public class DBClient {

	public static ClientModel GetClient(String username) {
		String MyQuery = "SELECT * from clients WHERE client_username='"
				+ username + "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new ClientModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// function to add client
	public static ClientModel addClient(String username, String password,
			String last_name, String first_name, String address, String email,
			String number, int status) {
		String MyQuery = "{CALL create_client(?, ?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, last_name);
			stmt.setString(4, first_name);
			stmt.setString(5, address);
			stmt.setString(6, email);
			stmt.setString(7, number);
			stmt.setInt(8, status);
			stmt.executeUpdate();
			return new ClientModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to update client
	public static ClientModel UpdateClient(int id, String username,
			String password, String last_name, String first_name,
			String address, String email, String number) {
		String MyQuery = "{CALL update_client(?, ?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setString(4, last_name);
			stmt.setString(5, first_name);
			stmt.setString(6, address);
			stmt.setString(7, email);
			stmt.setString(8, number);
			stmt.executeUpdate();
			return new ClientModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to soft delete client
	public static void DeleteClient(int id) {
		String MyQuery = "{CALL delete_client(?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static String AddClient(ClientModel clientModel) {
		String username = clientModel.getUsername();
		String password = clientModel.getPassword();
		String last_name = clientModel.getLast_name();
		String first_name = clientModel.getFirst_name();
		String address = clientModel.getAddress();
		String email = clientModel.getEmail();
		String number = clientModel.getNumber();
		int status = clientModel.getStatus();

		String MyQuery = "{CALL create_client(?, ?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, last_name);
			stmt.setString(4, first_name);
			stmt.setString(5, address);
			stmt.setString(6, email);
			stmt.setString(7, number);
			stmt.setInt(8, status);
			stmt.executeUpdate();
			return "" + username + " has been successfully addded";
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
