package Model;

import database.DBUser;

public class UserModel extends Model {

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
	

	//functions to call DBUser functions
	public void Create() {
		DBUser.AddUser(this);
	}

	public void Update() {
		DBUser.UpdateUser(this);
	}

	public void Read() {
		
	}

	public void Delete() {
		DBUser.DeleteUser(this.id);
	}	

}
