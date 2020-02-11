package Form.Login;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import Model.UserModel;
import database.DBUser;

public class FLogin extends FLoginView {

	public FLogin() {
		BTNConnect.addActionListener(this);
		System.out.println("Form Controller");


		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Submit

		if (TFUsername.isValid()) {
			try {
				UserModel Trying = DBUser.GetUser(TFUsername.getText(), TFPassword.getText());
				if (Trying.getUsername()==null) {
					System.out.println("Username does not exist!");
				}else if (Trying.getPassword()==null) {
					System.out.println("Account did not match with password");
				}else
					System.out.println("Login Successful!");
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(("Login Failed" + "Login Failed. Try again."));
			}
		}

	}

}
