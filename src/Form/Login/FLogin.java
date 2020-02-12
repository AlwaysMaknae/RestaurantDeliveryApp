package Form.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.UserModel;
import database.DBUser;
import utils.FAlerts;

public class FLogin extends FLoginView {

	public FLogin() {

		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") ||
		 * TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this,
		 * "Username or Password is incorrect!", "Login Error",
		 * JOptionPane.ERROR_MESSAGE); }
		 */
//				if (TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
//					FAlerts.Error("Login Error", "Invalid Username or Password");
//				}else{
//					FAlerts.Say("Good!", "TEST");
//				}

		BTNConnect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Empty Login Error Validation.

				if (!TFUsername.IsValid() || !TFPassword.IsValid()) {
					// Incorrect Login Info Validation.

//					if() {
//					FAlerts.Say("Good!", "TEST");	
//					}else{
//					FAlerts.Error("Login Error", "Invalid Username or Password");
//				    }
					FAlerts.Error("Login Error", "Invalid Username or Password");
				} else {
					FAlerts.Say("Test", "This is just an RP message saying it works @ 60%! efficency!");
				}

			}
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

				// Closes Application

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Submit
		try {
			UserModel Trying = DBUser.GetUser(TFUsername.getText(), TFPassword.getText());
			if (Trying.getUsername() == null) {
				System.out.println("Username does not exist!");
			} else if (Trying.getPassword() == null) {
				System.out.println("Account did not match with password");
			} else{
				System.out.println("Login Successful!");
				System.out.println(Trying.getAccess_lvl());
			}
		} catch (Exception e2) {
			System.out.println(("Login Failed" + "Login Failed. Try again."));
		}
	}

}
