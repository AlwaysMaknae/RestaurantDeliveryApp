package database;

import java.util.Calendar;
import java.util.Date;

import Model.Model;

public abstract class Session {

	private static Model User;
	public static String AccesType;
	public static Date Now = new Date();
	private static Calendar cal = Calendar.getInstance(); 
	
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
		cal.setTime(Session.Now);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	
	public static String GetDateFormated() {
		return cal.get(Calendar.YEAR) +"-"+ cal.get(Calendar.MONTH) +"-"+cal.get(Calendar.DATE) + "";
	}
	public static String GetDateFormated(boolean tomorrow) {
		if(tomorrow)
			cal.add(Calendar.DATE, 1);
		
		String res = cal.get(Calendar.YEAR) +"-"+ cal.get(Calendar.MONTH) +"-"+cal.get(Calendar.DATE) + "";
		
		if(tomorrow)
			cal.add(Calendar.DATE, -1);
		
		return  res;
	}
	
	
	
	
	
}
