package Form.DeliveryGuy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;
import utils.FAlerts;

public class FAcceptDeliveryGuy extends FAcceptDeliveryGuyPage {

	public FAcceptDeliveryGuy() {

		ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();

		ArrayList<Object> Order = new ArrayList<Object>();

//		Order.add(ORDER SHOULD SHOW THE DATE);

		ListPan.SetList(Order);

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

//				Select aN Order and press SELECT. This transfers the info into the correct Labels.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and display the info in the Labels.

			}
		});

		BTNAccept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Order selection verification

//					if(ORDER IS SELECTED) {

//					if(FAlerts.Confirm("Accept Order Confirmation", "Would you like to accept this order?")) {

					// TODO SEND THE ORDER TO DONE ORDERLIST IN THE FDoneDeliveryGuy.java

//						FAlerts.Say("Accepted Order", "Order has been Accepted!");
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
