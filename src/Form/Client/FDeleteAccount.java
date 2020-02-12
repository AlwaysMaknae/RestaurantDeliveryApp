package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Form.Deliverers.FAddDeliverer;
import Model.ClientModel;
import utils.FAlerts;

public class FDeleteAccount extends FDeleteAccountPage{

	private ClientModel DeleteClient;
	public FDeleteAccount() {
		
		//TODO GET THE INFORMATION OF THE CURRENT ACCOUNT AND PUT IT IN THE APPROPRIATE TEXTFIELDS
		
		BTNDelete.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(FAlerts.Confirm("Account Deletion Confirmation", "Are you sure you want to delete this Account?")) {
					
					DeleteClient.Delete();
					FAlerts.Say("Account Deletion Complete", "Account has been deleted successfully!");
					//TODO RETURN TO THE LOGIN PAGE
					
				}else {
					FAlerts.Say("Account Deletion Cancelled", "Deletion of this account has been cancelled successfully!");
				}
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
}
