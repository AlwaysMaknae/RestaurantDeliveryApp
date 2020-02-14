package Model;

import java.time.LocalTime;
import java.util.ArrayList;

import database.DBRestaurant;
import utils.FHoursComboBox;

public class RestaurantModel extends Model{
	private int id;
	private String name;
	private String address;
	private String number;
	private String hours;
	private String areas;
	private ArrayList<String> arealist;
	
	
	private LocalTime[] openings = new LocalTime[7];
	private LocalTime[] closings = new LocalTime[7];
	
	private int status;
	
	//constructors and overloads
	public RestaurantModel(int id, String name, String address, String number, String hours, String areas, int status){
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
		this.hours = hours;
		this.areas = areas;
		this.status = status;
		this.arealist = new ArrayList<String>();
		String[] tareas = this.areas.split(" ");
		for (String x : tareas) {
			this.arealist.add(x);
		}
		SetTimes();
	}
	public RestaurantModel(String name, String address, String number, String hours, String areas){
		this.name = name;
		this.address = address;
		this.number = number;
		this.hours = hours;
		this.areas = areas;
		this.arealist = new ArrayList<String>();
		SetTimes();
		String[] tareas = this.areas.split(" ");
		for (String x : tareas) {
			this.arealist.add(x);
		}
	}
	public RestaurantModel(int id){
		this.id = id;
	}
	public RestaurantModel(String name){
		this.name = name;
	}
	/*public RestaurantModel(int id, String name, int yes){
		this.id = id;
		this.name = name;
		this.arealist = new ArrayList<String>();
		String[] tareas = this.areas.split(" ");
		for (String x : tareas) {
			this.arealist.add(x);
		}
	}*/
	
	
	public RestaurantModel(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	private void ReadRestaurantModel(RestaurantModel Me){
		this.id = Me.getId();
		this.name = Me.getName();
		this.address = Me.getAddress();
		this.number = Me.getNumber();
		this.hours = Me.getHours();
		this.areas = Me.getAreas();
		this.status = Me.getStatus();
		SetTimes();
		
	}
	
	private void SetTimes(){
		String[] tea = this.hours.split(" ");
		for (int i = 0; i < openings.length; i++) {
			openings[i] = FHoursComboBox.FindTime(tea[i]);
		}
		for (int i = 0; i < closings.length; i++) {
			closings[i] = FHoursComboBox.FindTime(tea[i+openings.length]);
		}
	}
	
	public void Create() {
		DBRestaurant.AddRestaurant(this);
	}

	public void Update() {
		ReadRestaurantModel(DBRestaurant.UpdateRestaurant(this));
	}

	public void Read() {
		ReadRestaurantModel(DBRestaurant.GetRestaurant(this.id));
	}

	public void Delete() {
		DBRestaurant.DeleteRestaurant(this.id);
	}
	
	//Getters and Setters

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public ArrayList<String> getArealist() {
		return arealist;
	}
	public void setArealist(ArrayList<String> arealist) {
		this.arealist = arealist;
	}

}
