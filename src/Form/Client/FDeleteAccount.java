package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Form.Deliverers.FAddDeliverer;
import Model.ClientModel;
import database.DBClient;
import database.Session;
import utils.FAlerts;
import utils.Navigator;

public class FDeleteAccount extends FDeleteAccountPage{

	private ClientModel DeleteClient = new ClientModel(Session.GetUser().getId());;
	public FDeleteAccount() {
		
		DeleteClient.Read();
		
		TFNewUsername.setText(DeleteClient.getClient_username());
		TFLastName.setText(DeleteClient.getClient_last_name());
		TFFirstName.setText(DeleteClient.getClient_first_name());
		TFAddress.setText(DeleteClient.getClient_address());
		TFEmail.setText(DeleteClient.getClient_email());

		String phone = DeleteClient.getClient_number();
		TFPhoneNum_1.setText(phone.substring(0, 3));
		TFPhoneNum_2.setText(phone.substring(4, 7));
		TFPhoneNum_3.setText(phone.substring(8, 12));
		
		BTNDelete.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(FAlerts.Confirm("Account Deletion Confirmation", "Are you sure you want to delete this Account?")==true) {
					
					DeleteClient.Delete();
					FAlerts.Say("Account Deletion Complete", "Account has been deleted successfully!");

					Navigator.Disconnect(Me);
					
				}
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
}
