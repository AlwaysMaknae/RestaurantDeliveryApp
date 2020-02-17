package Form.Restauranteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.AccesLevel;
import Model.DelivererModel;
import Model.DeliveryStatus;
import Model.OrderModel;
import Model.RestaurateurModel;
import database.DBOrder;
import database.Session;
import utils.FAlerts;
import utils.Navigator;

public class FOrderReady extends FOrderReadyPage{
	
	RestaurateurModel TheGuy;
	OrderModel TheOrder;
	private ArrayList<OrderModel> OrderList;
	private ArrayList<Object> OrderDisplay;

	public FOrderReady() {
		OrderList = new ArrayList<OrderModel>();
		OrderDisplay = new ArrayList<Object>();
		
		
		if (Session.AccesType == AccesLevel.GetType(AccesLevel.RESTAURATEUR)) {
			TheGuy = new RestaurateurModel(Session.GetUser().getId());
			TheGuy.Read();
		} else {
			Navigator.Dashboard(Me);
		}
		
		OrderList = DBOrder.getOrderbyRestaurant(TheGuy.getRestaurant_id(), true );
		
		for (OrderModel ord : OrderList) {
			OrderDisplay.add("" + ord.getDate() + " - " + ord.getDelivery_time() + " -> " + ord.getPostal_code() );
		}

		ListPan.SetList(OrderDisplay);
		
		BTNSelect.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ListPan.GetSelectedIndex() > -1 ) {
					TheOrder = OrderList.get(ListPan.GetSelectedIndex());
					
					TFDeliveryDate.setText(TheOrder.getDate());
					TFTime.setText(TheOrder.getDelivery_time());
					TFPostalCode.setText(TheOrder.getPostal_code());
					
					JTAMealOrder.setText(TheOrder.getItems());
				}
			}
		});
		
		BTNOrderReady.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ListPan.GetSelectedIndex() > -1 && TheOrder != null) {

					if(FAlerts.Confirm("Order Ready Confirmation", "Is the order ready to be delivered?")) {

						TheOrder.setOrder_status( DeliveryStatus.READY );
						TheOrder.Update();
			
						FAlerts.Say("Order Ready", "Order is Ready for Pickup.");
					}

				}else {
					FAlerts.Error("Selection Error", "Please select an Order to Ready.");
				}
				
			}
		});
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
