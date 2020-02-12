package Form.DeliveryGuy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;

public class FDoneDeliveryGuy extends FDoneDeliveryGuyPage{
	
	public FDoneDeliveryGuy() {
		
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
		
		BTNDone.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Order selection verification
						
//				if(ORDER IS SELECTED) {
				
//				if(FAlerts.Confirm("Done Order Confirmation", "Would you like to confirm the delivery of this order?")) {
					
					//TODO SEND THE ORDER TO THE MARK AS READY ORDERLIST IN FORDERREADY.JAVA
					
//					FAlerts.Say("Done Order Accepted", "Order has been delivered!");
//				}else {
//					FAlerts.Say("Done Order Cancelled", "Confirm delivery as been successfully cancelled!");
//				}
				
//			}else {
//				FAlerts.Error("Selection Error", "Please select an Order.");
//			}
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}

}
