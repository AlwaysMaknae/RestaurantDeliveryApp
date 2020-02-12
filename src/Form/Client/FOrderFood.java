package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.RestaurantModel;
import database.DBItem;
import database.DBRestaurant;

import Model.OrderModel;
import Model.RestaurantModel;
import utils.FAlerts;

public class FOrderFood extends FOrderFoodPage {
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

		ListPan.SetList(Restaurant);
		// ListPan3.SetList(Order);

		BTNRestaurant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BTNRestaurant.setEnabled(false);

				MenuList = DBItem.getAllItems(RestaurantList.get(ListPan.GetSelectedIndex()).getId());
				
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
