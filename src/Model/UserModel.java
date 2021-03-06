package Model;

import database.DBUser;

public class UserModel extends Model {
	private String username;
	private String password;
	private int access_lvl;
	private int id;
	
	//constructors and overloads
	public UserModel(String username){
		this.username = username;
	}
	public UserModel(int id){
		this.id = id;
	}
	public UserModel(int id, String username){
		this.id = id;
		this.username = username;
	}
	public UserModel(String username, String password, int access_lvl){
		this.username = username;
		this.password = password;
		this.access_lvl = access_lvl;
	}
	public UserModel(String username, String password){
		this.username = username;
		this.password = password;
	}

	//functions to call DBUser functions
	public void Create() {
		DBUser.AddUser(this);
	}

	public void Update() {
		DBUser.UpdateUser(this);
	}

	public Model Read() {
		return DBUser.GetUser(this.username, this.password);
	}

	public void Delete() {
		DBUser.DeleteUser(this.id);
	}	
	
	//Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getAccess_lvl() {
		return access_lvl;
	}
	public void setAccess_lvl(int access_lvl) {
		this.access_lvl = access_lvl;
	}
	
	


}
