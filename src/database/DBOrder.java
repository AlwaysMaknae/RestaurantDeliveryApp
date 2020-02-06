package database;

import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;

import Model.ItemModel;
import Model.OrderModel;

public class DBOrder {
	// function to read item
	public static OrderModel GetItem(int id) {
		String MyQuery = "SELECT * from orders WHERE order_id='" + id + "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new OrderModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// function to add order
	public static OrderModel AddOrder(String address, String postal_code,
			String date, String item, String delivery_time, float price,
			String status, int restaurant_id, int deliverer_id, int client_id,
			int delivered) {
		String MyQuery = "{CALL create_order(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, address);
			stmt.setString(2, postal_code);
			stmt.setString(3, date);
			stmt.setString(4, item);
			stmt.setString(5, delivery_time);
			stmt.setFloat(6, price);
			stmt.setString(7, status);
			stmt.setInt(8, restaurant_id);
			stmt.setInt(9, deliverer_id);
			stmt.setInt(10, client_id);
			stmt.setInt(11, delivered);
			stmt.executeUpdate();
			return new OrderModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// function to update order
	public static OrderModel UpdateOrder(int id, String address,
			String postal_code, String date, String item, String delivery_time,
			float price, String status, int restaurant_id, int deliverer_id,
			int client_id, int delivered) {
		String MyQuery = "{CALL update_order(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, address);
			stmt.setString(3, postal_code);
			stmt.setString(4, date);
			stmt.setString(5, item);
			stmt.setString(6, delivery_time);
			stmt.setFloat(7, price);
			stmt.setString(8, status);
			stmt.setInt(9, restaurant_id);
			stmt.setInt(10, deliverer_id);
			stmt.setInt(11, client_id);
			stmt.setInt(12, delivered);
			stmt.executeUpdate();
			return new OrderModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to soft delete order
	public static void DeleteOrder(int id) {
		String MyQuery = "{CALL delete_order(?)}";
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
