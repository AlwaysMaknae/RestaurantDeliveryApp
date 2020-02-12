package database;

import Model.AccesLevel;
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
	}
	
	public static void Login(Model Client){
		Session.Client = Client;
	}
	
	public static Model User(){
		return Client;
	}
	
	
	
	
	
}
