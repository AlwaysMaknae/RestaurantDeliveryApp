package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.OrderModel;
import Model.RestaurantModel;
import utils.FAlerts;

public class FOrderFood extends FOrderFoodPage {

	public FOrderFood() {
		
		ArrayList<RestaurantModel> RestaurantList = new ArrayList<RestaurantModel>();
		ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();
		ArrayList<ItemModel> MenuList = new ArrayList<ItemModel>();


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

				// Order.add("Enter date here");
		
		
		ArrayList<Object> Menu = new ArrayList<Object>();

				Menu.add("Hot Dog");
				Menu.add("Pufferfish");
		
		
		ListPan.SetList(Restaurant);
		ListPan2.SetList(Menu);
		ListPan3.SetList(Order);
		
		
		
		
		
		BTNAdd.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				//Restaurant Selection validation
//				if(RESTAURANT IS SELECTED) {
					//Menu Selection validation
//					if(MENU IS SELECTED) {
						//Quantity validation
//						if(TFQuantity.getText().equals("") || TFQuantity.getText().matches("[a-zA-Z]+") || !TFQuantity.getText().matches("[0-9]+")) {
//							FAlerts.Error("Quantity Error", "Please enter an appropriate number of meals.");
//						}else {
							//TODO ADD ORDER TO ORDERLIST
							//TODO ADD PRICE TO TOTAL TEXTFIELDS
//							FAlerts.Say("Add Meal Success", "Meal has been added to Order!");
//						}
						
//					}else {
//						FAlerts.Error("Selection Error", "Please select a Menu to order from.");
//					}
					
//				}else {
//					FAlerts.Error("Selection Error", "Please select a Restaurant to order from.");
//				}
				
			}
		});
		
		BTNOrder.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Empty Info Validation
				
//				if(!TFDeliveryTimeYMD.IsValid() || !TFHour.isValid() || !TFMinute.IsValid() || !TFPostalCode.isValid()) {
//					FAlerts.Error("Missing Info Error", "Missing Fields.");
//				}else {
//					if(ListPan3 != null && ListPan3.isEmpty()) {
//						FAlerts.Error("Missing Order Error", "Missing Orders.");
//					}else {
//						if(FAlerts.Confirm("Order Confirmation", "Would you like to Order?")) {
							
							//SEND THE ORDER TO THE RESTAURANTER ORDER AND TO ORDER HISTORY LIKE UBEREATS HAHAHAHHAHA
//							FAlerts.Say("Order Successful", "Your Order was successful!");
//						}else {
//							FAlerts.Say("Order Cancelled", "Your Order was cancelled successfully!");
//						}
						
//					}
//				}
				
			}
		});
		
		BTNDelete.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//TODO BTNDELETE DELETES THE MOST RECENT ORDER (WILL CHANGE. MAYBE).
				
				//Empty List Validation
//				if(ListPan3 != null && ListPan3.isEmpty()) {
//					FAlerts.Error("Missing Order Error", "Missing Orders.");
//				}else {
//					if(FAlerts.Confirm("Order Deletion Confirmation", "Would you like to delete your recent Order?")) {
						
						//TODO REMOVE ORDER FROM ORDERLIST AND ORDERLIST ARRAY.
						//TODO REMOVE PRICE FROM TOTAL TEXTFIELD
//						FAlerts.Say("Order Deleted", "Your Order was deleted!");
//					}else {
//						FAlerts.Say("Order Deletion Cancelled", "Deletion was cancelled successfully!");
//					}
//				}
				
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}
