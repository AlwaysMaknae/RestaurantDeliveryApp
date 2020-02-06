package database;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;

import Model.DelivererModel;

public class DBDeliverer {
	// function to read deliverer
	public static DelivererModel GetDeliverer(String deliverer_name) {
		String MyQuery = "SELECT * from deliverers WHERE deliverer_name='" + deliverer_name
				+ "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new DelivererModel(stmt.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// function to add deliverer
	public static DelivererModel AddDeliverer(String name, String number,
			String area, int status) {
		String MyQuery = "{CALL create_deliverer(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, name);
			stmt.setString(2, number);
			stmt.setString(3, area);
			stmt.setInt(4, status);
			stmt.executeUpdate();
			return new DelivererModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to update deliverer
	public static DelivererModel UpdateDeliverer(int id, String name, String number,
			String area) {
		String MyQuery = "{CALL update_deliverer(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, number);
			stmt.setString(4, area);
			stmt.executeUpdate();
			return new DelivererModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to soft delete deliverer
	public static void DeleteDeliverer(int id) {
		String MyQuery = "{CALL delete_deliverer(?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public static String AddDeliverer(DelivererModel delivererModel) {
		String name = delivererModel.getName();
		String number = delivererModel.getNumber();
		String area = delivererModel.getArea();
		int status = delivererModel.getStatus();
		String MyQuery = "{CALL create_deliverer(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, name);
			stmt.setString(2, number);
			stmt.setString(3, area);
			stmt.setInt(4, status);
			stmt.executeUpdate();
			return "" + name + " has been successfully addded";
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
