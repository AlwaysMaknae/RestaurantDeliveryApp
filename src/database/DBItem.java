package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.mysql.jdbc.PreparedStatement;
import Model.ItemModel;

public class DBItem {
	// function to read item
	public static ItemModel GetItem(String item_dish) {
		String MyQuery = "SELECT * from items WHERE item_dish='" + item_dish
				+ "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new ItemModel(stmt.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public static ItemModel getItem(int item_id) {
		String MyQuery = "SELECT * from items WHERE item_id='" + item_id
				+ "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			return new ItemModel(stmt.getInt(1), stmt.getString(2), stmt.getFloat(3), stmt.getInt(4), stmt.getInt(5));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	
	
	public static ArrayList<ItemModel> getAllItems(int restaurant_id){
		String MyQuery = "SELECT * FROM items WHERE status=1 AND restaurant_id='" + restaurant_id + "'";
		ResultSet stmt;
		ArrayList<ItemModel> items = new ArrayList<ItemModel>();
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			
			while(stmt.next()){
				items.add(new ItemModel(stmt.getInt(1), stmt.getString(2), stmt.getFloat(3), stmt.getInt(4), stmt.getInt(5)));
			}		
			return items;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to add item
	public static ItemModel AddItem(String dish, float price,
			int restaurant_id, int status) {
		String MyQuery = "{CALL create_item(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, dish);
			stmt.setFloat(2, price);
			stmt.setInt(3, restaurant_id);
			stmt.setInt(4, status);
			stmt.executeUpdate();
			return new ItemModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static ItemModel AddItem(ItemModel itemModel) {
		String dish = itemModel.getItem_dish();
		float price = itemModel.getItem_price();
		int restaurant_id = itemModel.getRestaurant_id();
		int status = itemModel.getStatus();
		String MyQuery = "{CALL create_item(?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, dish);
			stmt.setFloat(2, price);
			stmt.setInt(3, restaurant_id);
			stmt.setInt(4, status);
			stmt.executeUpdate();
			return new ItemModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to update item
	public static ItemModel UpdateItem(int id, String dish, float price) {
		String MyQuery = "{CALL update_item(?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, dish);
			stmt.setFloat(3, price);
			stmt.executeUpdate();
			return new ItemModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static ItemModel UpdateItem(ItemModel itemModel){
		int id = itemModel.getItem_id();
		String dish = itemModel.getItem_dish();
		float price = itemModel.getItem_price();
		String MyQuery = "{CALL update_item(?,?,?)}";
		java.sql.PreparedStatement stmt;
		
		try{
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, dish);
			stmt.setFloat(3, price);
			stmt.executeUpdate();
			return new ItemModel(stmt.toString());
		} catch (SQLException e){
			e.printStackTrace();
			return null;
		}
	}

	// function to soft delete item
	public static void DeleteItem(int id) {
		String MyQuery = "{CALL delete_item(?)}";
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
