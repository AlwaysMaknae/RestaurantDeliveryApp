package Model;

import database.DBItem;

public class ItemModel extends Model{
	
	private int item_id;
	private String item_dish;
	private float item_price;
	private int restaurant_id;
	private int status;
	
	//constructors and overloads
	public ItemModel(int item_id, String item_dish, float item_price, int restaurant_id, int status) {
		this.item_id = item_id;
		this.item_dish = item_dish;
		this.item_price = item_price;
		this.restaurant_id = restaurant_id;
		this.status = status;
	}
	
	public ItemModel(String item_dish, float item_price, int restaurant_id, int status) {
		this.item_dish = item_dish;
		this.item_price = item_price;
		this.restaurant_id = restaurant_id;
		this.status = status;
	}

	public ItemModel(int item_id) {
		this.item_id = item_id;
	}
	
	public ItemModel(String item_dish) {
		this.item_dish = item_dish;
	}
	
	public ItemModel(int item_id, String item_dish) {
		this.item_id = item_id;
		this.item_dish = item_dish;
	}
	
	
	public void Create() {
		DBItem.AddItem(this);	
	}

	public void Update() {
		DBItem.UpdateItem(this);
	}

	public Model Read() {
		return DBItem.GetItem(this.item_dish);
	}

	public void Delete() {
		DBItem.DeleteItem(this.item_id);
		
	}

	//Getters & Setters
	
	public int getItem_id() {
		return item_id;
	}

	public String getItem_dish() {
		return item_dish;
	}

	public float getItem_price() {
		return item_price;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public int getStatus() {
		return status;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public void setItem_dish(String item_dish) {
		this.item_dish = item_dish;
	}

	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
