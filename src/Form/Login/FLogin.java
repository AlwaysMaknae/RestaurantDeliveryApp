package Form.Login;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

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
			System.out.println("good");
		} else {
			System.out.println("not good");
		}

	}

}
