package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.RestaurantModel;

public class DBRestaurant {
		//function to read restaurant info
		public static RestaurantModel GetRestaurant(String name){
			String MyQuery = "SELECT * from restaurants WHERE restaurant_name='" + name +"'";
			ResultSet stmt;
			try {
				stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
				return new RestaurantModel(0, stmt.getString(1), stmt.getString(2), stmt.getString(3), stmt.getString(4), stmt.getString(5));
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			
		}
		//function to add restaurant
		public static RestaurantModel AddRestaurant(String name, String address, String number, String hours, String areas){
			String MyQuery = "INSERT INTO restaurants VALUES ('" + name + "', '" + address + "', " + number + "', '" + hours + "', " + areas + "', " + "';" ;
			ResultSet stmt;
			try{
				stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
				return new RestaurantModel(stmt.getString(1));
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		// function to update restaurant
		public static RestaurantModel UpdateUser(int id, String name, String address, String number, String hours, String areas){
			String MyQuery = "UPDATE restaurants SET restaurant_name='" + name + "', restaurant_address='" + address + "', " + number + "', " + hours + "', " + areas + "' WHERE restaurant_id='" + id + "'" ;
			ResultSet stmt;
			try{
				stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
				return new RestaurantModel(stmt.getString(1));
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
		//function to soft delete restaurant
		public static RestaurantModel DeleteUser(int id){
			String MyQuery = "UPDATE restaurants SET status='0' WHERE restaurant_id='" + id + "'" ;
			ResultSet stmt;
			try{
				stmt = DBConnecter.Connect.createStatement().executeQuery(MyQuery);
				return new RestaurantModel(stmt.getString(1));
			}catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
	}

