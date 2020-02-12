package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Form.Dashboard.FDashboard;
import Form.Login.FLogin;
import database.Session;

public abstract class Navigator {

	
	public static void Quit(){
		if(FAlerts.Confirm("Quit", "Close the application ?")){
			Session.Quit();
			System.exit(0);
		}
	}
	
	public static void Disconnect(FForm link){
		Session.Quit();
		new FLogin();
		link.dispose();
	}
	
	public static void Login(FForm link){
		new FLogin();
		if(link != null)
			link.dispose();
	}
	public static void Dashboard(FForm link){
		new FDashboard();
		link.dispose();
	}
	
}
