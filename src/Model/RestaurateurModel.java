package Model;

import database.DBManager;
import database.DBRestaurateur;

public class RestaurateurModel extends UserModel {
	private int restaurant_id;
	
	public RestaurateurModel(int id, String username, String password, int restaurant_id, int access_lvl, int status) {
		super(id, username, password, access_lvl, status);
		this.restaurant_id = restaurant_id;
	}
	
	public RestaurateurModel(String username, String password) {
		super(username, password);
	}
	
	public RestaurateurModel(String username) {
		super(username);
	}
	
	private void ReadRestaurateurModel(RestaurateurModel Me){
		this.id = Me.getId();
		this.username = Me.getUsername();
		this.password = Me.getPassword();
		this.restaurant_id = Me.getRestaurant_id();
		this.access_lvl = Me.getAccess_lvl();
		this.status = Me.getStatus();
	}
	
	public void Create() {
		DBRestaurateur.AddRestaurateur(this);
	}

	public void Update() {
		ReadRestaurateurModel(DBRestaurateur.UpdateRestaurateur(this));
	}

	public void Read() {
		ReadRestaurateurModel(DBRestaurateur.getRestaurant(this.id));
	}

	public void Delete() {
		DBManager.DeleteManager(this.id);
	}	

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	
}
