package database;

import Model.Model;
import Model.UserModel;

public abstract class Session {

	private static Model Client;
	public static String AccesType;
	
	public static void Create(Model Client){
		Session.Client = Client;
	}
	public static void Quit(){
		Session.Client = null;
		AccesType = "";
		//AccesType = Client.getAccess_lvl();
	}
	
	
	
	
	
}
