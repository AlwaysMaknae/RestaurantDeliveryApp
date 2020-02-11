package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.mysql.jdbc.PreparedStatement;

import Model.DelivererModel;
public class DBDeliverer {
	// function to read deliverer
	public static DelivererModel GetDeliverer(int deliverer_id) {
		String MyQuery = "SELECT * from deliverers WHERE deliverer_id='" + deliverer_id
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
	
	public static ArrayList<DelivererModel> getDelivererArea(String area){
		String MyQuery = "SELECT * FROM deliverers WHERE status=1 AND deliverer_area LIKE ?";
		ResultSet resultset;	
		PreparedStatement stmt;
		ArrayList<DelivererModel> deliverer = new ArrayList<DelivererModel>();
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setString(1, "%" + area + "%");

			resultset = stmt.executeQuery();
			while(resultset.next()){
				deliverer.add(new DelivererModel(resultset.getInt(1), resultset.getString(2)));
			}		
			return deliverer;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static ArrayList<DelivererModel> CompareArea(int restaurant_id, String area){
		String MyQuery = "SELECT * FROM deliverers, restaurants WHERE restaurants.restaurant_id=? AND restaurants.restaurant_areas LIKE ?  AND deliverers.deliverer_area LIKE ?";
		
		ResultSet resultset;	
		PreparedStatement stmt;
		ArrayList<DelivererModel> deliverer = new ArrayList<DelivererModel>();
		try {
			stmt = DBConnecter.Connect.prepareStatement(MyQuery);
			stmt.setInt(1, restaurant_id);
			stmt.setString(2, "%" + area + "%");
			stmt.setString(3, "%" + area + "%");

			resultset = stmt.executeQuery();
			while(resultset.next()){
				deliverer.add(new DelivererModel(resultset.getInt(1), resultset.getString(2)));
			}		
			return deliverer;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	// function to add deliverer
	
	public static DelivererModel AddDeliverer(DelivererModel delivererModel) {
		String name = delivererModel.getName();
		String number = delivererModel.getNumber();
		String area = delivererModel.getArea();
		int status = delivererModel.getStatus();
		String MyQuery = "{CALL create_deliverer(?, ?, ?, ?, ?, ?)}";
		java.sql.PreparedStatement stmt;
		try {
			stmt = DBConnecter.Connect.prepareCall(MyQuery);
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
	
	public static DelivererModel UpdateDeliverer(DelivererModel delivererModel) {
		int id = delivererModel.getId();
		String name = delivererModel.getName();
		String number = delivererModel.getNumber();
		String area = delivererModel.getArea();
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


	
}
