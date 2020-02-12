package Model;

import database.DBUser;

public class UserModel extends Model {
	protected String username;
	protected String password;
	protected int access_lvl;
	protected int id;
	protected int status;
	
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
	public UserModel(int id, String username, int access_lvl){
		this.id = id;
		this.username = username;
		this.access_lvl = access_lvl;
	}
	public UserModel(int id, String username, String password, int access_lvl, int status){
		this.id = id;
		this.username = username;
		this.password = password;
		this.access_lvl = access_lvl;
		this.status = status;
	}
	
	public UserModel(int id, String username, String password, int access_lvl){
		this.id = id;
		this.username = username;
		this.password = password;
		this.access_lvl = access_lvl;
	}
	public UserModel(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	private void ReadUserModel(UserModel Me){
		this.id = Me.getId();
		this.username = Me.getUsername();
		this.password = Me.getPassword();
		this.access_lvl = Me.getAccess_lvl();
		this.status = Me.getStatus();
	}
	

	//functions to call DBUser functions
	public void Create() {
		DBUser.AddUser(this);
	}

	public void Update() {
		DBUser.UpdateUser(this);
	}

	public void Read() {
		ReadUserModel(DBUser.getUser(this.id));
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	


}
