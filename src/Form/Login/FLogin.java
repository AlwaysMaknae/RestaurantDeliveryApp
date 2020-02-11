package Form.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import utils.FAlerts;

public class FLogin extends FLoginView {

	public FLogin() {

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

	}

}
