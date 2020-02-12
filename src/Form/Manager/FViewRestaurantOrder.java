package Form.Manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;
import Model.RestaurantModel;

public class FViewRestaurantOrder extends FViewRestaurantOrderPage{

	public FViewRestaurantOrder() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
		
		ArrayList<RestaurantModel> RestaurantList = new ArrayList<RestaurantModel>();
		ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();

		// RM = DBRestaurant.GetAllRestaurants();

		ArrayList<Object> Restaurant = new ArrayList<Object>();

		Restaurant.add("Orange");
		Restaurant.add("Apple");
		Restaurant.add("Cherry");
		Restaurant.add("Melon");
		Restaurant.add("Cheese");

		/*
		 * for (RestaurantModel r : RestaurantList) { Fruits.add(r.getName()); }
		 */
		
		ArrayList<Object> Order = new ArrayList<Object>();

		//Order.add(ENTER ORDER DATE HERE);
		
		
		ListPan.SetList(Restaurant);
		ListPan2.SetList(Order);

		
		BTNSelect.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//FOR RESTAURANT
				
//				Select a Restaurant and press SELECT. This correlates with the Orderlist.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and display the Orders tied with the specific Restaurant.
				
			}
		});
		
		BTNSelect2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//FOR ORDER
				
//				Select an Order and press SELECT. This transfers the info into the correct textfields.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected order and display the info in the textfields.
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
