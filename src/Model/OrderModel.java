package Model;

import database.DBOrder;

public class OrderModel extends Model {
	private int id;
	private String address;
	private String postal_code;
	private String date;
	private String items;
	private float price;
	private int status;
	private int restaurant_id;
	private int deliverer_id;
	private int client_id;
	private int order_delivered;
	
	public OrderModel(int id){
		this.id = id;
	}
	
	public OrderModel(String address){
		this.address = address;
	}
	
	public OrderModel(String address, String postal_code, String items){
		this.address = address;
		this.postal_code = postal_code;
		this.items = items;
	}
	
	public OrderModel(int id, int order_delivered){
		this.id = id;
		this.order_delivered = order_delivered;
	}
	
	public OrderModel(int id, String address, String posta_code, String date, String items, float price, int status, int restaurant_id,
						 int deliverer_id, int client_id, int order_delivered){
		this.id = id;
		this.address = address;
		this.postal_code = posta_code;
		this.date = date;
		this.items = items;
		this.price = price;
		this.status = status;
		this.restaurant_id = restaurant_id;
		this.client_id = client_id;
		this.order_delivered = order_delivered;
						}
	public void Create() {
		// TODO Auto-generated method stub
		
	}

	public void Update() {
		// TODO Auto-generated method stub
		
	}

	public Model Read() {
		// TODO Auto-generated method stub
		return null;
	}

	public void Delete() {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public int getDeliverer_id() {
		return deliverer_id;
	}

	public void setDeliverer_id(int deliverer_id) {
		this.deliverer_id = deliverer_id;
	}

	public int getClient_id() {
		return client_id;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public int getOrder_delivered() {
		return order_delivered;
	}

	public void setOrder_delivered(int order_delivered) {
		this.order_delivered = order_delivered;
	}
	
	

}
