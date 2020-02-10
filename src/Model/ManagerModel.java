package Model;

public class ManagerModel extends UserModel implements ModelInterface {
	private int restaurant_id;
	
	public ManagerModel(String username, String password, int restaurant_id, int access_lvl) {
		super(username, password, access_lvl);
		this.restaurant_id = restaurant_id;
	}
	
	public ManagerModel(String username, String password) {
		super(username, password);
	}
	
	public ManagerModel(String username) {
		super(username);
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	
}
