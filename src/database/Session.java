package database;

import java.util.Calendar;
import java.util.Date;

import Model.Model;

public abstract class Session {

	private static Model User;
	public static String AccesType;
	public static Date Now = new Date();
	
	public static void Create(Model Client){
		Session.User = Client;
	}
	public static void Quit(){
		Session.User = null;
		AccesType = "";
	}
	
	public static void Login(Model Client){
		Session.User = Client;
	}
	
	public static Model GetUser(){
		return User;
	}
	
	public static int GetDayOfWeek(){
		Calendar d = Calendar.getInstance();
		d.setTime(Session.Now);
		return d.get(Calendar.DAY_OF_WEEK);
	}
	
	
	
	
	
}
