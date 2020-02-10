package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.RestaurantModel;

public class DBRestaurant {
	
	//function for get all restaurants for displaying
	public static ArrayList<RestaurantModel> getAllRestaurants(){
		String MyQuery = "SELECT * FROM restaurants WHERE status=1";
		ResultSet stmt;
		ArrayList<RestaurantModel> restaurants = new ArrayList<RestaurantModel>();
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			
			while(stmt.next()){
				restaurants.add(new RestaurantModel(stmt.getInt(1), stmt.getString(2)));
			}

			return restaurants;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// function to read restaurant
	public static RestaurantModel GetRestaurant(int restaurant_id) {
		String MyQuery = "SELECT * FROM restaurants WHERE restaurant_name='"
				+ restaurant_id + "'";
		ResultSet stmt;
		try {
			stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
			stmt.next();
			System.out.println(stmt.getString(2));
			return new RestaurantModel(stmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	// function to add restaurant
	public static RestaurantModel AddRestaurant(String name, String address,
			String number, String hours, String areas, int status) {
		String MyQuery = "{CALL create_restaurant(?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, name);
			stmt.setString(2, address);
			stmt.setString(3, number);
			stmt.setString(4, hours);
			stmt.setString(5, areas);
			stmt.setInt(6, status);
			stmt.executeUpdate();
			return new RestaurantModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static RestaurantModel AddRestaurant(RestaurantModel restaurantModel) {
		String name = restaurantModel.getName();
		String address = restaurantModel.getAddress();
		String number = restaurantModel.getNumber();
		String hours = restaurantModel.getHours();
		String areas = restaurantModel.getAreas();
		int status = restaurantModel.getStatus();

		String MyQuery = "{CALL create_restuarant(?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setString(1, name);
			stmt.setString(2, address);
			stmt.setString(3, number);
			stmt.setString(4, hours);
			stmt.setString(5, areas);
			stmt.setInt(6, status);
			stmt.executeUpdate();
			return new RestaurantModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to update restaurant
	public static RestaurantModel UpdateRestaurant(int id, String name,
			String address, String number, String hours, String areas) {
		String MyQuery = "{CALL update_restaurant(?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, address);
			stmt.setString(4, number);
			stmt.setString(5, hours);
			stmt.setString(6, areas);
			stmt.executeUpdate();
			return new RestaurantModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static RestaurantModel UpdateRestaurant(RestaurantModel restaurantModel) {
		int id = restaurantModel.getId();
		String name = restaurantModel.getName();
		String address = restaurantModel.getAddress();
		String number = restaurantModel.getNumber();
		String hours = restaurantModel.getHours();
		String areas = restaurantModel.getAreas();

		String MyQuery = "{CALL update_restuarant(?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, address);
			stmt.setString(4, number);
			stmt.setString(5, hours);
			stmt.setString(6, areas);
			stmt.executeUpdate();
			return new RestaurantModel(stmt.toString());
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// function to soft delete restaurant
	public static void DeleteRestaurant(int id) {
		String MyQuery = "{CALL delete_restaurant(?)}";
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
