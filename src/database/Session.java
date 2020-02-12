package database;

import Model.UserModel;

public abstract class Session {

	private static UserModel Client;
	
	public static void Create(UserModel Client){
		Session.Client = Client;
	}
	
	
	
	
	
}
