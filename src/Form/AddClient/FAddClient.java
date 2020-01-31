package Form.AddClient;

import java.awt.event.ActionEvent;

import Model.UserModel;

public class FAddClient extends FAddClientPage{

	private UserModel CurrentUser;
	
	public FAddClient() {
		CurrentUser = new UserModel("");
		BTNSave.addActionListener(this);
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Submit
		CurrentUser.setUsername(TFNewUsername.getText());
		CurrentUser.setPassword(TFNewPassword.getText());
		CurrentUser.setAccess_lvl(1);
//		private int id;
		//database query
		CurrentUser.Create();
		

	}
}
