package Form.DeliveryGuy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;
import Model.RestaurantModel;

public class FViewDeliveryGuy extends FViewDeliveryGuyPage{
	
	public FViewDeliveryGuy() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
		
//		ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();


//		ArrayList<Object> Order = new ArrayList<Object>();

//		Order.add("Enter date here");


//		ListPan.SetList(Order);
		
		BTNSelect.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		BTNComplete.addActionListener(new ActionListener() {			
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
