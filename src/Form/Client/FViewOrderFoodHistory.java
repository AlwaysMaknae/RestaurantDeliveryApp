package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;
import database.DBOrder;
import database.Session;

public class FViewOrderFoodHistory extends FViewOrderFoodHistoryPage{

	public FViewOrderFoodHistory() {

		ArrayList<OrderModel> OrderList = DBOrder.getOrderbyClient(Session.GetUser().getId());
		ArrayList<Object> Order = new ArrayList<Object>();

		// Order.add(ENTER DETAILS HERE);
		
		for (OrderModel o : OrderList) {
			Order.add("-" + o.getDate() + " : " + o.getDelivery_time() + ": " + o.getPrice() + "$");
		}
		

		ListPan.SetList(Order);
		
		
		BTNSelect.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ListPan.GetSelectedIndex() > -1) {
					OrderModel CurrentOrder = OrderList.get(ListPan.GetSelectedIndex());
					TFDeliveryTime.setText( CurrentOrder.getDate() + " : " + CurrentOrder.getDelivery_time() );
					TFAddress.setText(CurrentOrder.getAddress());
					TFStatus.setText(CurrentOrder.getOrder_status());
					
					
					String[] at = CurrentOrder.getItems().split("\n");
					ArrayList<Object> arl = new ArrayList<Object>();
					
					for (String s : at) {
						arl.add(s);
					}
					
					JTAMealOrder.SetList(arl);
					
				}
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
}
