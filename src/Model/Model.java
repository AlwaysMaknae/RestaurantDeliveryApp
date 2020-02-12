package Model;

public abstract class Model implements ModelInterface{
	
	protected String username;
	protected String password;
	protected int access_lvl;
	protected int id;
	protected int status;
	
	
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
