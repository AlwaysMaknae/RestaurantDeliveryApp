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

public class FViewDeliveryGuy extends FViewDeliveryGuyPage{
	
	DelivererModel TheGuy;
	OrderModel TheOrder;
	private ArrayList<OrderModel> OrderList;
	private ArrayList<Object> OrderDisplay;
	
	public FViewDeliveryGuy() {
		OrderList = new ArrayList<OrderModel>();
		OrderDisplay = new ArrayList<Object>();
		
		if (Session.AccesType == AccesLevel.GetType(AccesLevel.DELIVERY_GUY)) {
			TheGuy = new DelivererModel(Session.GetUser().getId());
			TheGuy.Read();
		} else {
			Navigator.Dashboard(Me);
		}
		
		OrderList = DBOrder.getOrderbyAreas(TheGuy.getArea());
		
		
		OrderList.addAll(DBOrder.getOrderbyDeliveryGuy(TheGuy.getId(), true));
		
		for (OrderModel ord : OrderList) {
			OrderDisplay.add("" + ord.getDate() + " - " + ord.getDelivery_time() + " : " + ord.getPostal_code()  + " ¬ " + ord.getOrder_status() );
		}

		ListPan.SetList(OrderDisplay);
		
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
		
		BTNComplete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(ListPan.GetSelectedIndex() > -1 && TheOrder!=null ) {
					FAlerts.Say("Order Contents", "Order Contents : \n" + TheOrder.getItems());
				}else {
					FAlerts.Error("Selection Error", "Please select an Order to accept");
				}
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}

}
