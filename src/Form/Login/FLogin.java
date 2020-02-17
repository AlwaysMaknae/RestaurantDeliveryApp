package Form.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Form.AddClient.FAddClient;
import Form.Dashboard.FDashboard;
import Model.AccesLevel;
import Model.Model;
import Model.UserModel;
import database.DBUser;
import database.Session;
import utils.FAlerts;
import utils.Navigator;

public class FLogin extends FLoginView {
	public static int logged_id;
	public FLogin() {

		BTNConnect.addActionListener(this);

		// Empty Login Error Validation once actionlistener is implemented.
		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */

		/*
		 * if(USERNAME MATCHES DATABASE NAME) { FAlerts.Say("Good!", "TEST"); }else{
		 * FAlerts.Error("Login Error", "Invalid Username or Password"); }
		 * FAlerts.Error("Login Error", "Invalid Username or Password"); } else {
		 * FAlerts.Say("Test",
		 * "This is just an RP message saying it works @ 60%! efficency!"); }
		 * 
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

				Navigator.Register(Me);

			}
		});

		BTNQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Navigator.Quit();
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (TFUsername.getText().length() > 0) {
			try {
<<<<<<< HEAD

				UserModel Trying = DBUser.GetUser(TFUsername.getText(), String.valueOf(TFPassword.getPassword()));
				if (Trying.getPassword() == null || Trying.getUsername() == null) {
					FAlerts.Error("Login Error", "Login Failed, check credentials.");

					Model Trying = DBUser.GetUser(TFUsername.getText(), String.valueOf(TFPassword.getPassword()));
					if (Trying == null) {
						FAlerts.Error("Login", "Login Failed, chek credentials.");

					} else {

						Session.AccesType = AccesLevel.GetType(Trying.getAccess_lvl());
						Session.Login(Trying);

						this.dispose();
						new FDashboard();
					}
=======
				Model Trying = DBUser.GetUser(TFUsername.getText(), String.valueOf(TFPassword.getPassword()));
				if (Trying == null) {
					FAlerts.Error("Login", "Login Failed, chek credentials.");
				} else {
					
					Session.AccesType = AccesLevel.GetType(Trying.getAccess_lvl());
					Session.Login(Trying);
					logged_id = Trying.getId();
							
					this.dispose();
					new FDashboard();
>>>>>>> bdf3b1b9e5216a03bd7173258ed4a58e2cfbd93c
				}

			} catch (Exception e2) {

				FAlerts.Error("Login Error", "Login Failed, check credentials.");

				e2.printStackTrace();
				FAlerts.Error("Login", "Login Failed, chek credentials.");

			}
		}
	}
}

//
//

//
