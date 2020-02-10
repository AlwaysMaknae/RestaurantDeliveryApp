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
		// Empty Login Error Validation once actionlistener is implemented.

		BTNConnect.addActionListener(this);
		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
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
		
		if (TFUsername.isValid()) {
			try {
				UserModel Trying = DBUser.getAllUsers(TFUsername.getText());
				if(Trying.getPassword().equals(TFPassword.getPassword())){
					System.out.println(Trying.getUsername());
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				FAlerts.Error("Login Failed", "Login Failed. Try again.");
			}
		}

	}

}
