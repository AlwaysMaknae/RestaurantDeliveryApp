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

<<<<<<< HEAD
		BTNConnect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
=======
		BTNConnect.addActionListener(this);

>>>>>>> 568a267047de508b1ba71ece30b4669afffeeaf9


		// Empty Login Error Validation once actionlistener is implemented.
		/*
		 * if(TFUsername.getText().equals("") ||
		 * TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this,
		 * "Username or Password is incorrect!", "Login Error",
		 * JOptionPane.ERROR_MESSAGE); }
		 */

<<<<<<< HEAD
//					if(USERNAME MATCHES DATABASE NAME) {
//						FAlerts.Say("Good!", "TEST");	
//					}else{
//						FAlerts.Error("Login Error", "Invalid Username or Password");
//				    }
					FAlerts.Error("Login Error", "Invalid Username or Password");
				} else {
					FAlerts.Say("Test", "This is just an RP message saying it works @ 60%! efficency!");
				}
=======
		
		BTNClientNew.addActionListener(new ActionListener() {
>>>>>>> 568a267047de508b1ba71ece30b4669afffeeaf9

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
				UserModel Trying = DBUser.GetUser(TFUsername.getText(), String.valueOf(TFPassword.getPassword()));
				if (Trying.getPassword() == null || Trying.getUsername() == null) {
					FAlerts.Error("Login", "Login Failed, chek credentials.");
				} else {
					Session.AccesType = AccesLevel.GetType(Trying.getAccess_lvl());
					Session.Login(AccesLevel.GetInstance(Trying.getAccess_lvl(), Trying.getId()) );
					
					System.out.println();
					
					this.dispose();
					new FDashboard();
	
				}
			} catch (Exception e2) {
				FAlerts.Error("Login", "Login Failed, chek credentials.");
			}

		}
	}
}
