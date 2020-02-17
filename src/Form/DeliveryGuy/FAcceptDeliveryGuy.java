package Form.DeliveryGuy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.AccesLevel;
import Model.DelivererModel;
import Model.DeliveryStatus;
import Model.OrderModel;
import Model.RestaurantModel;
import database.DBOrder;
import database.DBRestaurant;
import database.Session;
import utils.FAlerts;
import utils.Navigator;

public class FAcceptDeliveryGuy extends FAcceptDeliveryGuyPage {
	
	DelivererModel TheGuy;
	OrderModel TheOrder;
	private ArrayList<OrderModel> OrderList;
	private ArrayList<Object> OrderDisplay;

	public FAcceptDeliveryGuy() {

		OrderList = new ArrayList<OrderModel>();
		OrderDisplay = new ArrayList<Object>();
		
		
		//GetDeliveryGuy
		//For all Areas get DeliverysByArea
		
		
		if (Session.AccesType == AccesLevel.GetType(AccesLevel.DELIVERY_GUY)) {
			TheGuy = new DelivererModel(Session.GetUser().getId());
			TheGuy.Read();
		} else {
			Navigator.Dashboard(Me);
		}
		
		UpdateOList();

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(ListPan.GetSelectedIndex() > -1) {
					
					TheOrder = OrderList.get( ListPan.GetSelectedIndex() );
					OrderLbl.setText("Order # :" + TheOrder.getId()+"");
					
					
					RestaurantModel cR = DBRestaurant.GetRestaurant( TheOrder.getRestaurant_id() );
					RestaurantLbl.setText( "Restaurant : " + cR.getName() );
					DeliveryAddressLbl.setText("Delivery Address : "+TheOrder.getAddress()+"");
					DeliveryPostalCodeLbl.setText("Delivery Postal Code : " + TheOrder.getPostal_code());
					
				}

			}
		});

		BTNAccept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Order selection verification
				if(ListPan.GetSelectedIndex() > -1 && TheOrder!=null ) {
					if(FAlerts.Confirm("Accept Order Confirmation", "Would you like to accept this order?")) {
							TheOrder.setDeliverer_id( TheGuy.getId() );
							TheOrder.setOrder_status(DeliveryStatus.IN_TRANSIT);
							TheOrder.Update();
							FAlerts.Say("Accepted Order", "Order has been Accepted!");
							UpdateOList();
					}
				}else {
					FAlerts.Error("Selection Error", "Please select an Order to accept");
				}

			}
		});

	}
	
	private void UpdateOList() {
		OrderList = DBOrder.getOrderbyAreas(TheGuy.getArea());
		
		OrderDisplay.clear();
		
		for (OrderModel ord : OrderList) {
			OrderDisplay.add("" + ord.getDate() + " - " + ord.getDelivery_time() + " : " + ord.getPostal_code() + " ¬" +ord.getOrder_status() );
		}

		ListPan.SetList(OrderDisplay);
	}

}
