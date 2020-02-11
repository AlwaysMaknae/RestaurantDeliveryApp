package Form.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.UserModel;
import database.DBUser;
import database.Session;
import utils.FAlerts;

public class FLogin extends FLoginView {

	public FLogin() {
		BTNConnect.addActionListener(this);
		// Empty Login Error Validation once actionlistener is implemented.

		BTNConnect.addActionListener(this);
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
		});
		
		BTNQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Session.Quit();
				
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Submit

		System.out.println(TFPassword.getPassword().toString());
		
		try {
			UserModel Trying = DBUser.GetUser(TFUsername.getText(), TFPassword.getPassword().toString());
			if (Trying.getUsername() == null) {
				System.out.println("Username does not exist!");
			} else if (Trying.getPassword() == null) {
				System.out.println("Account did not match with password");
			} else
				System.out.println("Login Successful!");
		} catch (Exception e2) {
			System.out.println(("Login Failed" + "Login Failed. Try again."));
		}

	}

}
