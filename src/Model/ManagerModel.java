package Model;

import database.DBManager;

public class ManagerModel extends UserModel {
	private int restaurant_id;
	
	public ManagerModel(int id, String username, String password, int restaurant_id, int access_lvl, int status) {
		super(id, username, password, access_lvl, status);
		this.restaurant_id = restaurant_id;
	}
	
	public ManagerModel(int id, String username, String password, int restaurant_id, int access_lvl) {
		super(id, username, password, access_lvl);
		this.restaurant_id = restaurant_id;
	}
	
	public ManagerModel(String username, String password) {
		super(username, password);
	}
	
	public ManagerModel(String username) {
		super(username);
	}
	
	private void ReadManagerModel(ManagerModel Me){
		this.id = Me.getId();
		this.username = Me.getUsername();
		this.password = Me.getPassword();
		this.restaurant_id = Me.getRestaurant_id();
		this.access_lvl = Me.getAccess_lvl();
		this.status = Me.getStatus();
	}
	
	public void Create() {
		DBManager.AddManager(this);
	}

	public void Update() {
		ReadManagerModel(DBManager.UpdateManager(this));
	}

	public void Read() {
		ReadManagerModel(DBManager.getManager(this.id));
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
