package Form.Deliverers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.DelivererModel;
import Model.RestaurantModel;

public class FDeleteDeliverer extends FDeleteDelivererPage{

	public FDeleteDeliverer() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
		
//		ArrayList<DelivererModel> RestaurantList = new ArrayList<DelivererModel>();

//		ArrayList<Object> Deliverer = new ArrayList<Object>();

//		Deliverer.add("Jeff");
//		Deliverer.add("Geoff");
//		Deliverer.add("Jeph");
//		Deliverer.add("Geoph");


//		ListPan.SetList(Deliverer);
		
		BTNSelect.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		BTNDeleteAll.addActionListener(new ActionListener() {			
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
