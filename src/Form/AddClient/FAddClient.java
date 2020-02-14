package Form.AddClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ClientModel;
import Model.UserModel;
import utils.FAlerts;
import utils.Navigator;

public class FAddClient extends FAddClientPage {

	private ClientModel CurrentClient;
	private boolean Existing = true;

	public FAddClient() {
		CurrentClient = new ClientModel("");

		BTNVerify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Empty Account Info

				if (!TFNewUsername.IsValid() || !TFNewPassword.IsValid() || !TFConfirmPass.IsValid()
						|| !TFLastName.IsValid() || !TFFirstName.IsValid() || !TFAddress.IsValid() || !TFEmail.IsValid()
						|| !TFPhoneNum_1.IsValid() || !TFPhoneNum_2.IsValid() || !TFPhoneNum_3.IsValid()) {

					FAlerts.Error("New Account Error", "New Account missing information");
				} else {

					// Existing Account verification.

//					if(USERNAME EXISTS) {	
//						Existing = True;
//						FAlerts.Error("New Account Error", "Account Username already exists");

//					}else if(FIRST NAME EXISTS){
//						Existing = True;
//						FAlerts.Error("New Account Error", "Account First Name already exists");

//					}else if(LAST NAME EXISTS){
//						Existing = True;
//						FAlerts.Error("New Account Error", "Account Last Name already exists");

//					}else if(ADDRESS EXISTS){
//						Existing = True;
//						FAlerts.Error("New Account Error", "Account Address already exists");

//					}else if(EMAIL EXISTS){
//						Existing = True;
//						FAlerts.Error("New Account Error", "Account Email already exists");

//					}else if(PHONE NUMBER EXISTS){
//						Existing = True;
//						FAlerts.Error("New Account Error", "Account Phone Number already exists");

//					}else {
//						Existing = False;
//						FAlerts.Say("New Account", "Account is valid!");
//					}
					FAlerts.Say("Test", "This is just an RP message saying it works @ 60%! efficency!");
				}
			}
		});

		BTNSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Empty Account Info

				if (!TFNewUsername.IsValid() || !TFNewPassword.IsValid() || !TFConfirmPass.IsValid()
						|| !TFLastName.IsValid() || !TFFirstName.IsValid() || !TFAddress.IsValid() || !TFEmail.IsValid()
						|| !TFPhoneNum_1.IsValid() || !TFPhoneNum_2.IsValid() || !TFPhoneNum_3.IsValid()) {
					
					FAlerts.Error("New Account Error", "New Account missing information");

				}else{

//					CurrentClient.setClient_username(TFNewUsername.getText());
//					CurrentClient.setClient_password(TFNewPassword.getText());
//					CurrentClient.setClient_password(TFConfirmPass.getText());
//					CurrentClient.setClient_last_name(TFLastName.getText());
//					CurrentClient.setClient_first_name(TFFirstName.getText());
//					CurrentClient.setClient_address(TFAddress.getText());
//					CurrentClient.setClient_email(TFEmail.getText());
//					CurrentClient.setClient_number(TFPhoneNum_1.getText() + TFPhoneNum_2.getText() + TFPhoneNum_3.getText());
//					CurrentClient.setAccess_lvl(1);
//				 	private int id;
//					database query
//					CurrentClient.Create();
//					FAlerts.Say("New Account", "Account has been made!");
				// MAKE THE FRAME AND GO BACK TO LOGIN SCREEN

					FAlerts.Say("Test", "This is just an RP message saying it works @ 10%! efficency!");
				}

				// Bypassing Existing Account verification...verification.

//				if(Existing = true) {
//					FAlerts.Error("New Account Error", "New Account information already exists");

//				}else {
				// MAKE THE FRAME AND GO BACK TO LOGIN SCREEN

//				}

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
