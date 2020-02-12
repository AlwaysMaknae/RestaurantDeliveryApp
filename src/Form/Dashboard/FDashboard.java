package Form.Dashboard;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import database.DBConnecter;

public class FDashboard extends FDashboardPage{

	public FDashboard() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {}
	
	@Override
	public void windowClosing(WindowEvent e) {
		DBConnecter.CloseConnection();
		System.out.println("DB Connection Closed");
		System.exit(0);
	}
	
}
