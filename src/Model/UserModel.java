package Model;

import database.DBUser;

public class UserModel extends Model {
	private String name;

	public UserModel(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Model Create() {
		
		return null;
	}

	public Model Update() {

		//update itself with the info it has (everything)
		return null;
	}

	public Model Read() {
		//Use this.getID
		
		return DBUser.GetUser(0);
	}

	public boolean Delete() {
		// TODO Auto-generated method stub
		return false;
	}

}
