package database;

import Model.UserModel;

public abstract class Session {

	private static UserModel Client;
	public static String AccesType;
	
	public static void Create(UserModel Client){
		Session.Client = Client;
		//AccesType = Client.getAccess_lvl();
	}
	
	
	
	
	
}
