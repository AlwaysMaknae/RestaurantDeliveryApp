package Model;

import database.DBRestaurant;

public class RestaurantModel extends Model{
	private int id;
	private String name;
	private String address;
	private String number;
	private String hours;
	private String areas;
	private int status;
	
	//constructors and overloads
	public RestaurantModel(int id, String name, String address, String number, String hours, String areas){
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
		this.hours = hours;
		this.areas = areas;
	}
	public RestaurantModel(String name, String address, String number, String hours, String areas){
		this.name = name;
		this.address = address;
		this.number = number;
		this.hours = hours;
		this.areas = areas;
	}
	public RestaurantModel(int id){
		this.id = id;
	}
	public RestaurantModel(String name){
		this.name = name;
	}
	public RestaurantModel(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	public Model Create() {
		return DBRestaurant.AddRestaurant(this.name, this.address, this.number, this.hours, this.areas);
	}

	public Model Update() {
		return DBRestaurant.UpdateUser(this.id, this.name, this.address, this.number, this.hours, this.areas);
	}

	public Model Read() {
		return DBRestaurant.GetRestaurant(this.name);
	}

	public Model Delete() {
		return DBRestaurant.DeleteUser(this.id);
	}
	
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
