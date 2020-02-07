package Form.AddClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.UserModel;

public class FAddClient extends FAddClientPage{

	private UserModel CurrentUser;
	
	public FAddClient() {
		CurrentUser = new UserModel("");
		
		
		
		BTNVerify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		BTNSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		BTNReturn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		BTNQuit.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
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
