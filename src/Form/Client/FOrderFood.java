package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.ItemModel;
import Model.RestaurantModel;
import database.DBItem;
import database.DBRestaurant;

import Model.OrderModel;
import Model.RestaurantModel;
import utils.FAlerts;
import utils.FTextField;

public class FOrderFood extends FOrderFoodPage {

	private FTextField address = new FTextField(20);

	private Object[] message = { "Please enter the full address of delivery", address };
	private boolean exit = false;
	private int InitFlag, Flag;

//	public FOrderFood() {
//
//		ArrayList<RestaurantModel> RestaurantList = new ArrayList<RestaurantModel>();
//		ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();
//		ArrayList<ItemModel> MenuList = new ArrayList<ItemModel>();
//
//		// RM = DBRestaurant.GetAllRestaurants();
//
//		ArrayList<Object> Restaurant = new ArrayList<Object>();
//
//		Restaurant.add("Orange");
//		Restaurant.add("Apple");
//		Restaurant.add("Cherry");
//		Restaurant.add("Melon");
//		Restaurant.add("Cheese");
//
//		/*
//		 * for (RestaurantModel r : RestaurantList) { Fruits.add(r.getName()); }
//		 */
//
//		ArrayList<Object> Order = new ArrayList<Object>();
//
//		// Order.add("Enter date here");

	private ArrayList<ItemModel> MenuList;
	private String order_items;
	private float sum;

	public FOrderFood() {

		ArrayList<RestaurantModel> RestaurantList = DBRestaurant.getAllRestaurants();

		// ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();

		ArrayList<Object> Restaurant = new ArrayList<Object>();

		for (int i = 0; i < RestaurantList.size(); i++) {
			Restaurant.add(RestaurantList.get(i).getName());
		}


		ArrayList<Object> Menu = new ArrayList<Object>();
		ArrayList<Object> Order = new ArrayList<Object>();

		Menu.add("Hot Dog");
		Menu.add("Pufferfish");

		ListPan.SetList(Restaurant);
		ListPan2.SetList(Menu);
		ListPan3.SetList(Order);

		BTNRestaurant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BTNRestaurant.setEnabled(false);

				MenuList = DBItem.getAllItems(RestaurantList.get(ListPan.GetSelectedIndex()).getId());

				for (int i = 0; i < MenuList.size(); i++) {
					Menu.add(MenuList.get(i).getItem_dish());
				}

				ListPan2.SetList(Menu);

			}
		});

		BTNMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				TFMeal.setText(MenuList.get(ListPan2.GetSelectedIndex()).getItem_dish() + "");
				TFPrice.setText(MenuList.get(ListPan2.GetSelectedIndex()).getItem_price() + "");


			}

		});


		BTNOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Empty Info Validation

//				if(!TFDeliveryTimeYMD.IsValid() || !TFHour.isValid() || !TFMinute.IsValid() || !TFPostalCode.IsValid()) {
//					FAlerts.Error("Missing Info Error", "Missing Fields.");
//				}else {
//					if(ListPan3 != null && ListPan3.isEmpty()) {
//						FAlerts.Error("Missing Order Error", "Missing Orders.");
//					}else {
//						InitFlag = FAlerts.ConfirmOrder("Order Confirmation", "Would you like to Order?", JOptionPane.YES_NO_OPTION);
//							if (InitFlag == JOptionPane.YES_OPTION) {
//								if (FAlerts.AskOrder("Address Confirmation", message)) {

//									if (FAlerts.Confirm("Order Confirmation", "Would you like to Order to this address?")) {

										// SEND THE ORDER TO THE RESTAURANTER ORDER AND TO ORDER HISTORY LIKE UBEREATS
										// HAHAHAHHAHA
//										FAlerts.Say("Order Successful", "Your Order was successful!");
//										exit = true;
//									} else {
//										address.setText("");
//										FAlerts.Say("Order Cancelled", "Your Order was cancelled successfully!");
//										do {
											// Flag = JOptionPane.showConfirmDialog(null, "Would you like to Order?", "Order
											// Confirmation", JOptionPane.YES_NO_OPTION);
//											Flag = FAlerts.ConfirmOrder("Order Confirmation", "Would you like to Order?", JOptionPane.YES_NO_OPTION);

//											if (Flag == JOptionPane.NO_OPTION) {
//												exit = true;
//											}

//										} while (!exit);

//									}
//								} else {
//									FAlerts.Say("Order Cancelled", "Your Order was cancelled successfully!");
//								}
//							} else {
//								FAlerts.Say("Order Cancelled", "Your Order was cancelled successfully!");
//						}
//					}
//				}

			}
		});

		BTNDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO BTNDELETE DELETES THE MOST RECENT ORDER (WILL CHANGE. MAYBE).

				// Empty List Validation
//				if(ListPan3 != null && ListPan3.isEmpty()) {
//					FAlerts.Error("Missing Order Error", "Missing Orders.");
//				}else {
//					if(FAlerts.Confirm("Order Deletion Confirmation", "Would you like to delete your recent Order?")) {

				// TODO REMOVE ORDER FROM ORDERLIST AND ORDERLIST ARRAY.
				// TODO REMOVE PRICE FROM TOTAL TEXTFIELD
//						FAlerts.Say("Order Deleted", "Your Order was deleted!");
//					}else {
//						FAlerts.Say("Order Deletion Cancelled", "Deletion was cancelled successfully!");
//					}
//				}

			}
		});

	

		BTNAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				order_items = "(" + TFQuantity.getText() + "x)" + TFMeal.getText() + " : "
						+ String.valueOf(Float.parseFloat(TFPrice.getText()) * Float.parseFloat(TFQuantity.getText()))
						+ "$";
				Order.add(order_items);
				ListPan3.SetList(Order);
				sum += (Float.parseFloat(TFPrice.getText()) * Float.parseFloat(TFQuantity.getText()));
				TFTotal.setText(String.valueOf(sum));

				// Restaurant Selection validation
				// if(RESTAURANT IS SELECTED) {
				// Menu Selection validation
				// if(MENU IS SELECTED) {
				// Quantity validation
				// if(TFQuantity.getText().equals("") ||
				// TFQuantity.getText().matches("[a-zA-Z]+") ||
				// !TFQuantity.getText().matches("[0-9]+")) {
				// FAlerts.Error("Quantity Error", "Please enter an appropriate
				// number of meals.");
				// }else {
				// TODO ADD ORDER TO ORDERLIST
				// TODO ADD PRICE TO TOTAL TEXTFIELDS
				// FAlerts.Say("Add Meal Success", "Meal has been added to
				// Order!");
				// }

				// }else {
				// FAlerts.Error("Selection Error", "Please select a Menu to
				// order from.");
				// }

				// }else {
				// FAlerts.Error("Selection Error", "Please select a Restaurant
				// to order from.");
				// }
			}
		});

		BTNOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});


		BTNDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO BTNDELETE DELETES THE MOST RECENT ORDER (WILL CHANGE.
				// MAYBE).

				// Empty List Validation
				// if(ListPan3 != null && ListPan3.isEmpty()) {
				// FAlerts.Error("Missing Order Error", "Missing Orders.");
				// }else {
				// if(FAlerts.Confirm("Order Deletion Confirmation", "Would you
				// like to delete your recent Order?")) {

				// TODO REMOVE ORDER FROM ORDERLIST AND ORDERLIST ARRAY.
				// TODO REMOVE PRICE FROM TOTAL TEXTFIELD
				// FAlerts.Say("Order Deleted", "Your Order was deleted!");
				// }else {
				// FAlerts.Say("Order Deletion Cancelled", "Deletion was
				// cancelled successfully!");
				// }
				// }

			}
		});

	}
}
