package database;

import Model.ManagerModel;
import Model.Model;

public abstract class Session {

	private static Model User;
	public static String AccesType;
	
	public static void Create(Model Client){
		Session.User = Client;
	}
	public static void Quit(){
		Session.User = null;
		AccesType = "";
	}
	
	public static void Login(Model Client){
		Session.User = Client;
		
		/*
		 * TransTyping 
		 * 
		 * ManagerModel m = new ManagerModel(User.getId());
		 * m.Read();
		 * System.out.println(m.getRestaurant_id());
		 * 
		*/
		
	}
	
	public static Model GetUser(){
		return User;
	}
	
	
	
	
	
}
