package Form.Client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import Model.ClientModel;
import database.DBClient;
import database.Session;
import utils.FAlerts;
import utils.Navigator;

public class FEditAccount extends FEditAccountPage {

	private ClientModel UpdateClient = new ClientModel(Session.GetUser().getId());;
	private boolean Existing = true;

	public FEditAccount() {
		UpdateClient.Read();
		BTNVerify.setEnabled(false);
		TFNewUsername.setEnabled(false);
		TFPhoneNum_1.setEnabled(false);
		TFPhoneNum_2.setEnabled(false);
		TFPhoneNum_3.setEnabled(false);
		
		

		TFNewUsername.setText(UpdateClient.getClient_username());
		TFLastName.setText(UpdateClient.getClient_last_name());
		TFFirstName.setText(UpdateClient.getClient_first_name());
		TFAddress.setText(UpdateClient.getClient_address());
		TFEmail.setText(UpdateClient.getClient_email());

		String phone = UpdateClient.getClient_number();
		TFPhoneNum_1.setText(phone.substring(0, 3));
		TFPhoneNum_2.setText(phone.substring(4, 7));
		TFPhoneNum_3.setText(phone.substring(8, 12));

		BTNSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (TFEmail.getText().matches("(.*)@(.*).com")==false || TFEmail.getText().length() > 64)
					TFEmail.SetInvalid();
				
				if (TFAddress.getText().length() < 7 || TFAddress.getText().length() > 50 )
					TFAddress.SetInvalid();
				
				if (TFLastName.getText().length() < 2 || TFLastName.getText().length() > 50)
					TFLastName.SetInvalid();
				
				if (TFFirstName.getText().length() < 2 || TFFirstName.getText().length() > 50)
					TFFirstName.SetInvalid();
				

				if (!TFLastName.IsValid() || !TFFirstName.IsValid() || !TFAddress.IsValid() || !TFEmail.IsValid()) {

					FAlerts.Error("Invalid Input Field", "Invalid Info");

				} else {

					if (UpdateClient.getClient_password().equals(String.valueOf(TFOldPassword.getPassword()))) {

						TFOldPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));

						if (String.valueOf(TFNewPassword.getPassword()).contentEquals("")
								&& String.valueOf(TFConfirmPass.getPassword()).contentEquals("")) {
							TFNewPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
							TFConfirmPass.setBorder(BorderFactory.createLineBorder(Color.GREEN));
							UpdateClient.setClient_username(TFNewUsername.getText());
							UpdateClient.setClient_password(String.valueOf(TFOldPassword.getPassword()));
							UpdateClient.setClient_last_name(TFLastName.getText());
							UpdateClient.setClient_first_name(TFFirstName.getText());
							UpdateClient.setClient_address(TFAddress.getText());
							UpdateClient.setClient_email(TFEmail.getText());
							UpdateClient.setClient_number(TFPhoneNum_1.getText() + "-" + TFPhoneNum_2.getText() + "-"
									+ TFPhoneNum_3.getText());

							boolean answer = FAlerts.Confirm("Confirm Submission",
									"Username: " + UpdateClient.getClient_username() + "\nLast Name: "
											+ UpdateClient.getClient_last_name() + "\nFirst Name: "
											+ UpdateClient.getClient_first_name() + "\nAddress: "
											+ UpdateClient.getClient_address() + "\nEmail: "
											+ UpdateClient.getClient_email() + "\nPhone Number: "
											+ UpdateClient.getClient_number());

							if (answer == true) {
								FAlerts.Say("Confirm Submission", "Account has been updated!");
								UpdateClient.Update();
								Navigator.Dashboard(Me);
							}
						} else if (String.valueOf(TFNewPassword.getPassword())
								.contentEquals(String.valueOf(TFConfirmPass.getPassword()))
								&& !String.valueOf(TFNewPassword.getPassword()).contentEquals("")
								&& !String.valueOf(TFConfirmPass.getPassword()).contentEquals("")
								&& String.valueOf(TFNewPassword.getPassword()).length() < 50
								&& String.valueOf(TFNewPassword.getPassword()).length() > 2) {

							TFNewPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
							TFConfirmPass.setBorder(BorderFactory.createLineBorder(Color.GREEN));
							UpdateClient.setClient_username(TFNewUsername.getText());
							UpdateClient.setClient_password(String.valueOf(TFConfirmPass.getPassword()));
							UpdateClient.setClient_last_name(TFLastName.getText());
							UpdateClient.setClient_first_name(TFFirstName.getText());
							UpdateClient.setClient_address(TFAddress.getText());
							UpdateClient.setClient_email(TFEmail.getText());
							UpdateClient.setClient_number(TFPhoneNum_1.getText() + "-" + TFPhoneNum_2.getText() + "-"
									+ TFPhoneNum_3.getText());

							boolean answer = FAlerts.Confirm("Confirm Submission",
									"Username: " + UpdateClient.getClient_username() + "\nLast Name: "
											+ UpdateClient.getClient_last_name() + "\nFirst Name: "
											+ UpdateClient.getClient_first_name() + "\nAddress: "
											+ UpdateClient.getClient_address() + "\nEmail: "
											+ UpdateClient.getClient_email() + "\nPhone Number: "
											+ UpdateClient.getClient_number());

							if (answer == true) {
								FAlerts.Say("Confirm Submission", "Account has been updated!");
								UpdateClient.Update();
								Navigator.Dashboard(Me);
							}
						} else {
							TFNewPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
							TFConfirmPass.setBorder(BorderFactory.createLineBorder(Color.RED));
						}

					} else {
						TFOldPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
					}

				}
			}
		});

		BTNVerify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}
