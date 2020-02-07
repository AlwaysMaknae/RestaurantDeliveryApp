package Form.Deliverers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FAddDeliverer extends FAddDelivererPage{

	public FAddDeliverer() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
		
		
		BTNAddDeliveryArea.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		}); 
		
		BTNDeleteDeliveryArea.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		BTNSaveDeliveryArea.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
