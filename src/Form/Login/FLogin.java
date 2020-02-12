package Form.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Form.Dashboard.FDashboard;
import Model.AccesLevel;
import Model.Model;
import Model.UserModel;
import database.DBUser;
import database.Session;
import utils.FAlerts;

public class FLogin extends FLoginView {

	public FLogin() {

		BTNConnect.addActionListener(this);



		// Empty Login Error Validation once actionlistener is implemented.
		/*
		 * if(TFUsername.getText().equals("") ||
		 * TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this,
		 * "Username or Password is incorrect!", "Login Error",
		 * JOptionPane.ERROR_MESSAGE); }
		 */

		
		BTNClientNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
//				if (TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
//					FAlerts.Error("Login Error", "Invalid Username or Password");
//				}else{
//					FAlerts.Say("Good!", "TEST");
//				}
		});

		BTNClientNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Opens the AddClientClass

			}
		});

		BTNQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Session.Quit();


				// Closes Application
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if(TFUsername.getText().length() > 0){
			try {
				Model Trying = DBUser.GetUser(TFUsername.getText(), String.valueOf(TFPassword.getPassword()));
				if (Trying == null) {
					FAlerts.Error("Login", "Login Failed, chek credentials.");
				} else {
					
					Session.AccesType = AccesLevel.GetType(Trying.getAccess_lvl());
					Session.Login(Trying);
					
					this.dispose();
					new FDashboard();
	
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				FAlerts.Error("Login", "Login Failed, chek credentials.");
			}

		}
	}
}
