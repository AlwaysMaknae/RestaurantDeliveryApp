package Model;

import database.DBDeliverer;

public class DelivererModel extends Model{
	private int id;
	private String name;
	private String number;
	private String area;
	private int status;
	
	public DelivererModel(int id){
		this.id = id;
	}
	
	public DelivererModel(String name){
		this.name = name;
	}
	
	public DelivererModel(String name, String number, String area){
		this.name = name;
		this.number = number;
		this.area = area;
	}
	
	public DelivererModel(int id, String name, String number, String area){
		this.id = id;
		this.name = name;
		this.number = number;
		this.area = area;
	}

	public void Create() {
		DBDeliverer.AddDeliverer(this);
	}

	public void Update() {
		DBDeliverer.UpdateDeliverer(this);
	}

	public Model Read() {
		return DBDeliverer.GetDeliverer(id);
	}

	public void Delete() {
		DBDeliverer.DeleteDeliverer(id);
	}

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
