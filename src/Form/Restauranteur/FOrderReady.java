package Form.Restauranteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOrderReady extends FOrderReadyPage{

	public FOrderReady() {
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
				
//				Select aN Order and press SELECT. This transfers the info into the correct Labels.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and display the info in the Labels.
				
			}
		});
		
		BTNOrderReady.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Selected Order Verification
				
//				if(ORDER IS SELECTED) {

//					if(FAlerts.Confirm("Order Ready Confirmation", "Is the order ready to be delivered?")) {

			// TODO SEND THE ORDER TO DELIVERYGUY VIEW ORDER LIST AND ADD IT TO RESTAURANTS ORDERLIST
			
//						FAlerts.Say("Order Ready", "Order has been delivered to Delivery Man!");
//					}else {
//						FAlerts.Say("Order Ready Cancelled", "Order Ready confirmation has been cancelled successfully!");
//					}

//				}else {
//					FAlerts.Error("Selection Error", "Please select an Order.");
//				}
				
			}
		});
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
