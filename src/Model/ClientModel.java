package Model;

import database.DBClient;

public class ClientModel extends Model {

	private int client_id;
	private String client_username;
	private String client_password;
	private String client_last_name;
	private String client_first_name;
	private String client_address;
	private String client_email;
	private String client_number;
	private int client_status;

	// Constructors & Overloads

	public ClientModel(int client_id, String client_username, String client_password, String client_last_name,
			String client_first_name, String client_address, String client_email, String client_number,
			int client_status) {
		this.client_id = client_id;
		this.client_username = client_username;
		this.client_password = client_password;
		this.client_last_name = client_last_name;
		this.client_first_name = client_first_name;
		this.client_address = client_address;
		this.client_email = client_email;
		this.client_number = client_number;
		this.client_status = client_status;
	}

	public ClientModel(String client_username, String client_password, String client_last_name,
			String client_first_name, String client_address, String client_email, String client_number,
			int client_status) {
		this.client_username = client_username;
		this.client_password = client_password;
		this.client_last_name = client_last_name;
		this.client_first_name = client_first_name;
		this.client_address = client_address;
		this.client_email = client_email;
		this.client_number = client_number;
		this.client_status = client_status;
	}

	public ClientModel(int client_id) {
		this.client_id = client_id;
	}

	public ClientModel(String client_username) {
		this.client_username = client_username;
	}

	public ClientModel(int client_id, String client_username) {
		this.client_id = client_id;
		this.client_username = client_username;
	}
	
	private void ReadClientModel(ClientModel Me){
		this.client_id = Me.getClient_id();
		this.client_username = Me.getClient_username();
		this.client_password = Me.getClient_password();
		this.client_last_name = Me.getClient_last_name();
		this.client_first_name = Me.getClient_first_name();
		this.client_address = Me.getClient_address();
		this.client_email = Me.getClient_email();
		this.client_number = Me.getClient_number();
		this.client_status = Me.getClient_status();
	}
	

	public void Create() {
		DBClient.AddClient(this);
	}

	public void Update() {
		ReadClientModel(DBClient.UpdateClient(this));
	}

	public void Read() {
		ReadClientModel(DBClient.GetAllClient(this.client_id));
				
	}

	public void Delete() {
		DBClient.DeleteClient(this.client_id);

	}

	//Getters & Setters
	
	public int getClient_id() {
		return client_id;
	}

	public String getClient_username() {
		return client_username;
	}

	public String getClient_password() {
		return client_password;
	}

	public String getClient_last_name() {
		return client_last_name;
	}

	public String getClient_first_name() {
		return client_first_name;
	}

	public String getClient_address() {
		return client_address;
	}

	public String getClient_email() {
		return client_email;
	}

	public String getClient_number() {
		return client_number;
	}

	public int getClient_status() {
		return client_status;
	}

	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

	public void setClient_username(String client_username) {
		this.client_username = client_username;
	}

	public void setClient_password(String client_password) {
		this.client_password = client_password;
	}

	public void setClient_last_name(String client_last_name) {
		this.client_last_name = client_last_name;
	}

	public void setClient_first_name(String client_first_name) {
		this.client_first_name = client_first_name;
	}

	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}

	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}

	public void setClient_number(String client_number) {
		this.client_number = client_number;
	}

	public void setClient_status(int client_status) {
		this.client_status = client_status;
	}

}
