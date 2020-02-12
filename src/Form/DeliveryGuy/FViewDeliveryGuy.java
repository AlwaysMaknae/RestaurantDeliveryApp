package Form.DeliveryGuy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;
import Model.RestaurantModel;

public class FViewDeliveryGuy extends FViewDeliveryGuyPage{
	
	public FViewDeliveryGuy() {
		
		ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();


		ArrayList<Object> Order = new ArrayList<Object>();


		ListPan.SetList(Order);
		
		BTNSelect.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				Select aN Order and press SELECT. This transfers the info into the correct Labels.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and display the info in the Labels.
				
			}
		});
		
		BTNComplete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {

				//Selected Order Verification
				
//				if(ORDER IS SELECTED) {
					
//					if(FAlerts.Confirm("Complete Order Confirmation", "Would you like to complete consultation on this order?")) {
						
						//TODO SEND THE ORDER TO ACCEPT ORDERLIST IN THE FAcceptDeliveryGuy.java
						
//						FAlerts.Say("Completed Order", "Order has been Completed!");
//					}else {
//						FAlerts.Say("Complete Order Cancelled", "Complete consultation for Order has been successfully cancelled!");
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
