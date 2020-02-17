package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;

import Model.ClientModel;

public class DBClient {

	public static ClientModel GetClient(String username, String password) {
		String MyQuery = "SELECT * from clients WHERE client_username='" + username + "' AND client_password='"
				+ password + "'";
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

	public static ClientModel GetAllClient(int id) {
		String MyQuery = "SELECT * from clients WHERE client_id='" + id + "' AND clients.status=1";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			while (stmt.next()) {
				return new ClientModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getString(4),
						stmt.getString(5), stmt.getString(6), stmt.getString(7), stmt.getString(8), stmt.getInt(9));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	// check if username exists

	public static ClientModel CheckUser(String username) {
		String MyQuery = "SELECT username FROM users WHERE users.username=? " + " UNION "
				+ "SELECT username FROM deliverers WHERE deliverers.username=? " + " UNION "
				+ "SELECT username FROM managers WHERE managers.username=? " + " UNION "
				+ "SELECT username FROM restaurateurs WHERE restaurateurs.username=? " + " UNION "
				+ "SELECT client_username FROM clients WHERE clients.client_username=? ";
		ResultSet resultset;
		PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, username);
			stmt.setString(3, username);
			stmt.setString(4, username);
			stmt.setString(5, username);

			resultset = stmt.executeQuery();
			while (resultset.next()) {

				return new ClientModel(resultset.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	// function to add client

	public static ClientModel AddClient(ClientModel clientModel) {
		String username = clientModel.getClient_username();
		String password = clientModel.getClient_password();
		String last_name = clientModel.getClient_last_name();
		String first_name = clientModel.getClient_first_name();
		String address = clientModel.getClient_address();
		String email = clientModel.getClient_email();
		String number = clientModel.getClient_number();

		String MyQuery = "{CALL create_client(?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, last_name);
			stmt.setString(4, first_name);
			stmt.setString(5, address);
			stmt.setString(6, email);
			stmt.setString(7, number);
			stmt.executeUpdate();
			return new ClientModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to update client

	public static ClientModel UpdateClient(ClientModel clientModel) {
		int id = clientModel.getClient_id();
		String username = clientModel.getClient_username();
		String password = clientModel.getClient_password();
		String last_name = clientModel.getClient_last_name();
		String first_name = clientModel.getClient_first_name();
		String address = clientModel.getClient_address();
		String email = clientModel.getClient_email();
		String number = clientModel.getClient_number();

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

}
