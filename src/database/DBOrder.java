package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;

import java.util.ArrayList;

import Model.DeliveryStatus;
import Model.OrderModel;

public class DBOrder {
	// function to read orders
	public static OrderModel GetOrder(int id) {
		String MyQuery = "SELECT * from orders WHERE order_id=?";
		ResultSet resultset;
		PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setInt(1, id);

			resultset = stmt.executeQuery();
			while (resultset.next()) {
				return new OrderModel(resultset.getInt(1), resultset.getString(2), resultset.getString(3),
						resultset.getString(4), resultset.getString(5), resultset.getString(6), resultset.getFloat(7),
						resultset.getString(8), resultset.getInt(9), resultset.getInt(10), resultset.getInt(11),
						resultset.getInt(12));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public static ArrayList<OrderModel> getOrderbyAreas(String areas) {

		ArrayList<OrderModel> orders = new ArrayList<OrderModel>();
		String RegAreas = areas.replace(" ", "|");

		String MyQuery = "SELECT * FROM orders WHERE orders.order_postal_code REGEXP '" + RegAreas + "' "
				+ "AND orders.deliverer_id IS NULL " + "AND orders.order_status = '" + DeliveryStatus.READY + "'";
		ResultSet stmt;
		
		
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			while (stmt.next()) {
				orders.add(new OrderModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getString(4),
						stmt.getString(5), stmt.getString(6), stmt.getFloat(7), stmt.getString(8), stmt.getInt(9),
						stmt.getInt(10), stmt.getInt(11), stmt.getInt(12)));
			}
			return orders;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static ArrayList<OrderModel> getOrderbyClient(int id) {
		String MyQuery = "SELECT * FROM orders WHERE orders.client_id='" + id + "'";
		ResultSet stmt;
		ArrayList<OrderModel> orders = new ArrayList<OrderModel>();
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			while (stmt.next()) {
				orders.add(new OrderModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getString(4),
						stmt.getString(5), stmt.getString(6), stmt.getFloat(7), stmt.getString(8), stmt.getInt(9),
						stmt.getInt(10), stmt.getInt(11), stmt.getInt(12)));
			}
			return orders;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ArrayList<OrderModel> getOrderbyRestaurant(int id) {
		return getOrderbyRestaurant(id, false);
	}
	public static ArrayList<OrderModel> getOrderbyRestaurant(int id, boolean ready_care) {
		String MyQuery = "SELECT * FROM orders WHERE orders.restaurant_id='" + id + "'";
		
		if(ready_care) {
			MyQuery += " AND order_status='"+DeliveryStatus.NOT_READY+"'";
		}
		
		MyQuery += " AND orders.order_delivered = '0'";
		
		
		ResultSet stmt;
		ArrayList<OrderModel> orders = new ArrayList<OrderModel>();
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			while (stmt.next()) {
				orders.add(new OrderModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getString(4),
						stmt.getString(5), stmt.getString(6), stmt.getFloat(7), stmt.getString(8), stmt.getInt(9),
						stmt.getInt(10), stmt.getInt(11), stmt.getInt(12)));
			}
			return orders;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ArrayList<OrderModel> getOrderbyDeliveryGuy(int id) {
		return getOrderbyDeliveryGuy(id, false);
	}
	public static ArrayList<OrderModel> getOrderbyDeliveryGuy(int id, boolean transit_care) {
		String MyQuery = "SELECT * FROM orders WHERE orders.deliverer_id='" + id + "'";
		
		if(transit_care) {
			MyQuery+= " AND order_status='"+ DeliveryStatus.IN_TRANSIT+"'";
		}
		
		ResultSet stmt;
		ArrayList<OrderModel> orders = new ArrayList<OrderModel>();
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			while (stmt.next()) {
				orders.add(new OrderModel(stmt.getInt(1), stmt.getString(2), stmt.getString(3), stmt.getString(4),
						stmt.getString(5), stmt.getString(6), stmt.getFloat(7), stmt.getString(8), stmt.getInt(9),
						stmt.getInt(10), stmt.getInt(11), stmt.getInt(12)));
			}
			return orders;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to add order

	public static OrderModel AddOrder(OrderModel orderModel) {
		String address = orderModel.getAddress();
		String postal_code = orderModel.getPostal_code();
		String date = orderModel.getDate();
		String items = orderModel.getItems();
		String delivery_time = orderModel.getDelivery_time();
		float price = orderModel.getPrice();
		String status = orderModel.getOrder_status();
		int restaurant_id = orderModel.getRestaurant_id();
		int client_id = orderModel.getClient_id();
		String MyQuery = "{CALL create_order(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, address);
			stmt.setString(2, postal_code);
			stmt.setString(3, date);
			stmt.setString(4, items);
			stmt.setString(5, delivery_time);
			stmt.setFloat(6, price);
			stmt.setString(7, status);
			stmt.setInt(8, restaurant_id);
			stmt.setInt(9, client_id);
			stmt.executeUpdate();
			return new OrderModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to update order
	public static OrderModel UpdateOrder(int id, String address, String postal_code, String date, String item,
			String delivery_time, float price, String status, int restaurant_id, int deliverer_id, int client_id,
			int delivered) {
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

	public static OrderModel UpdateOrder(OrderModel orderModel) {
		int id = orderModel.getId();
		String address = orderModel.getAddress();
		String postal_code = orderModel.getPostal_code();
		String date = orderModel.getDate();
		String items = orderModel.getItems();
		String delivery_time = orderModel.getDelivery_time();
		float price = orderModel.getPrice();
		String status = orderModel.getOrder_status();
		int restaurant_id = orderModel.getRestaurant_id();
		int deliverer_id = orderModel.getDeliverer_id();
		int client_id = orderModel.getClient_id();
		int order_delivered = orderModel.getOrder_delivered();
		String MyQuery = "{CALL update_order(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, address);
			stmt.setString(3, postal_code);
			stmt.setString(4, date);
			stmt.setString(5, items);
			stmt.setString(6, delivery_time);
			stmt.setFloat(7, price);
			stmt.setString(8, status);
			stmt.setInt(9, restaurant_id);
			
			if(deliverer_id <= 0) {
				stmt.setNull(10, deliverer_id);
			} else {
				stmt.setInt(10, deliverer_id);
			}
			
			stmt.setInt(11, client_id);
			stmt.setInt(12, order_delivered);
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
