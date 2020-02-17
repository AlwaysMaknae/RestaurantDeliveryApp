package Model;

import java.util.ArrayList;

import database.DBDeliverer;

public class DelivererModel extends Model{
	private int id;
	private String username;
	private String password;
	private String name;
	private String number;
	private String area;
	private ArrayList<String> arealist;
	private int access_lvl;
	private int status;
	
	public DelivererModel(int id){
		this.id = id;
		this.arealist = new ArrayList<String>();
	}
	
	public DelivererModel(String name){
		this.name = name;
		this.arealist = new ArrayList<String>();
	}
	
	public DelivererModel(int id, String name){
		this.id = id;
		this.name = name;
		this.arealist = new ArrayList<String>();
	}
	
	public DelivererModel(String username, String password, String name, String number, String area){
		this.username = username;
		this.password = password;
		this.name = name;
		this.number = number;
		this.area = area;
		this.arealist = new ArrayList<String>();
		String[] tareas = this.area.split(" ");
		for (String x : tareas) {
			this.arealist.add(x);
		}
	}
	
	public DelivererModel(int id, String username, String password, int access_lvl, String name, String number, String area, int status){
		this.username = username;
		this.password = password;
		this.id = id;
		this.name = name;
		this.number = number;
		this.area = area;
		this.access_lvl = access_lvl;
		this.status = status;
		this.arealist = new ArrayList<String>();
		String[] tareas = this.area.split(" ");
		for (String x : tareas) {
			this.arealist.add(x);
		}
	}
	
	private void ReadDelivererModel(DelivererModel Me){
		this.id = Me.getId();
		this.username = Me.getUsername();
		this.password = Me.getPassword();
		this.access_lvl = Me.getAccess_lvl();
		this.name = Me.getName();
		this.number = Me.getNumber();
		this.area = Me.getArea();
		this.status = Me.getStatus();
		this.arealist = new ArrayList<String>();
		String[] tareas = this.area.split(" ");
		for (String x : tareas) {
			this.arealist.add(x);
		}
	}
	

	public void Create() {
		DBDeliverer.AddDeliverer(this);
	}

	public void Update() {
		DBDeliverer.UpdateDeliverer(this);
	}

	public void Read() {
		ReadDelivererModel(DBDeliverer.GetDeliverer(this.id));
	}

	public void Delete() {
		DBDeliverer.DeleteDeliverer(id);
	}
	
	public void SyncAreas() {
		this.area = "";
		for (String a : arealist) {
			this.area += a + " ";
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getAccess_lvl() {
		return access_lvl;
	}

	public void setAccess_lvl(int access_lvl) {
		this.access_lvl = access_lvl;
	}
	
	public ArrayList<String> getArealist() {
		return arealist;
	}
	public void setArealist(ArrayList<String> arealist) {
		this.arealist = arealist;
	}

}
