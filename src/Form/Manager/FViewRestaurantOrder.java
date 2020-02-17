package Form.Manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;
import Model.RestaurantModel;
import Model.DelivererModel;
import Model.ManagerModel;
import database.DBOrder;
import database.DBRestaurant;
import database.Session;

public class FViewRestaurantOrder extends FViewRestaurantOrderPage {
	private ArrayList<OrderModel> OrderList;
	private OrderModel Orderz;

	public FViewRestaurantOrder() {

		ManagerModel user = new ManagerModel(Session.GetUser().getId());
		user.Read();

		OrderList = new ArrayList<OrderModel>();

		ArrayList<Object> Order = new ArrayList<Object>();

		OrderList = DBOrder.getOrderbyRestaurant(user.getRestaurant_id());

		for (int i = 0; i < OrderList.size(); i++) {
			Order.add("Order #" + OrderList.get(i).getId() + " - " + OrderList.get(i).getDate() + " - " + OrderList.get(i).getDelivery_time() + " - Area:" + OrderList.get(i).getPostal_code());
		}

		ListPan2.SetList(Order);

		BTNSelect2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ListPan2.GetSelectedIndex() > -1){
					Orderz = OrderList.get(ListPan2.GetSelectedIndex());
					Orderz.Read();
					
					TFDeliveryTimeYMD.setText(Orderz.getDate());
					TFHour.setText(Orderz.getDelivery_time());
					TFPostalCode.setText(Orderz.getPostal_code());
					
					JTAMealOrder.setText(Orderz.getItems());
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
