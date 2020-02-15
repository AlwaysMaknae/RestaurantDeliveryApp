package Form.AddClient;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import Model.ClientModel;
import Model.UserModel;
import database.DBClient;
import utils.FAlerts;
import utils.Navigator;

public class FAddClient extends FAddClientPage {

	private ClientModel CurrentClient;
	private boolean Existing = true;

	public FAddClient() {
		CurrentClient = new ClientModel("");
		
		TFPhoneNum_1.SetMask("###");
		TFPhoneNum_2.SetMask("###");
		TFPhoneNum_3.SetMask("####");

		BTNVerify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Existing Account verification.

				if(DBClient.CheckUser(TFNewUsername.getText())!=null) {	
					Existing = true;
					FAlerts.Error("New Account Error", "Account Username already exists");
					TFNewUsername.SetInvalid();

					}else {
					Existing = false;
					FAlerts.Say("New Account", "Account is valid!");

					TFNewUsername.IsValid();
				}

			}
		});

		BTNSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Existing == true) {
					TFNewUsername.SetInvalid();
				}else
					TFNewUsername.IsValid();
				
				if (TFEmail.getText().matches("(.*)@(.*).com") == false || TFEmail.getText().length() > 64)
					TFEmail.SetInvalid();

				if (TFAddress.getText().length() < 7 || TFAddress.getText().length() > 50)
					TFAddress.SetInvalid();

				if (TFLastName.getText().length() < 2 || TFLastName.getText().length() > 50)
					TFLastName.SetInvalid();

				if (TFFirstName.getText().length() < 2 || TFFirstName.getText().length() > 50)
					TFFirstName.SetInvalid();
				
				if (TFPhoneNum_1.getText().length() < 3 || TFPhoneNum_2.getText().length() < 3 || TFPhoneNum_3.getText().length() < 4) {
					TFPhoneNum_1.SetInvalid();
					TFPhoneNum_2.SetInvalid();
					TFPhoneNum_3.SetInvalid();
				}

				if (!TFNewUsername.IsValid() || !TFLastName.IsValid() || !TFFirstName.IsValid() || !TFAddress.IsValid() || !TFEmail.IsValid() || !TFPhoneNum_1.IsValid() || !TFPhoneNum_2.IsValid() || !TFPhoneNum_3.IsValid()) {
					FAlerts.Error("Invalid Input Field", "Invalid Info");

				} else {

					if (String.valueOf(TFNewPassword.getPassword())
							.contentEquals(String.valueOf(TFConfirmPass.getPassword()))
							&& !String.valueOf(TFNewPassword.getPassword()).contentEquals("")
							&& !String.valueOf(TFConfirmPass.getPassword()).contentEquals("")
							&& String.valueOf(TFNewPassword.getPassword()).length() < 50
							&& String.valueOf(TFNewPassword.getPassword()).length() > 2) {

						TFNewPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
						TFConfirmPass.setBorder(BorderFactory.createLineBorder(Color.GREEN));
						CurrentClient.setClient_username(TFNewUsername.getText());
						CurrentClient.setClient_password(String.valueOf(TFConfirmPass.getPassword()));
						CurrentClient.setClient_last_name(TFLastName.getText());
						CurrentClient.setClient_first_name(TFFirstName.getText());
						CurrentClient.setClient_address(TFAddress.getText());
						CurrentClient.setClient_email(TFEmail.getText());
						CurrentClient.setClient_number(
								TFPhoneNum_1.getText() + "-" + TFPhoneNum_2.getText() + "-" + TFPhoneNum_3.getText());

						boolean answer = FAlerts.Confirm("Confirm Submission",
								"Username: " + CurrentClient.getClient_username() + "\nLast Name: "
										+ CurrentClient.getClient_last_name() + "\nFirst Name: "
										+ CurrentClient.getClient_first_name() + "\nAddress: "
										+ CurrentClient.getClient_address() + "\nEmail: "
										+ CurrentClient.getClient_email() + "\nPhone Number: "
										+ CurrentClient.getClient_number());

						if (answer == true) {
							FAlerts.Say("Confirm Submission", "Account has been created!");
							CurrentClient.Create();
							Navigator.Login(Me);
						}
					} else {
						TFNewPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
						TFConfirmPass.setBorder(BorderFactory.createLineBorder(Color.RED));
					}

				}
			}
		});

		BTNReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Navigator.Login(Me);

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
	}
}
