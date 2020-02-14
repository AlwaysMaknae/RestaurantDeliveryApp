package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Client;

import Form.Login.FLogin;
import Model.ClientModel;
import Model.ItemModel;
import Model.RestaurantModel;
import database.DBClient;
import database.DBItem;
import database.DBOrder;
import database.DBRestaurant;
import database.Session;
import Model.OrderModel;
import Model.RestaurantModel;
import utils.FAlerts;
import utils.Navigator;

public class FOrderFood extends FOrderFoodPage {
	private ArrayList<ItemModel> MenuList;
	private ArrayList<RestaurantModel> RestaurantList;
	private String order_items;
	private float sum;
	private ClientModel current_client = new ClientModel(Session.GetUser().getId());

	public FOrderFood() {
		BTNDelete.setEnabled(false);
		
		current_client.Read();
		ArrayList<Object> Order = new ArrayList<Object>();
		ArrayList<Object> Menu = new ArrayList<Object>();

		TFPostalCode.SetMask("L#L");

		BTNArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu.clear();
				ListPan2.SetList(Menu);

				RestaurantList = DBRestaurant.getRestaurantByArea(TFPostalCode.getText());
				ArrayList<Object> Restaurant = new ArrayList<Object>();

				for (int i = 0; i < RestaurantList.size(); i++) {
					Restaurant.add(RestaurantList.get(i).getName());
				}
				ListPan.SetList(Restaurant);

			}
		});

		BTNRestaurant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

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

		BTNAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (TFQuantity == null || isNumeric(TFQuantity.getText()) == false) {
					System.out.println("yeet");
				} else {
					order_items = "(" + TFQuantity.getText() + "x)" + TFMeal.getText() + ": " + String.valueOf(
							Float.parseFloat(TFPrice.getText()) * Float.parseFloat(TFQuantity.getText())) + "$";

					Order.add(order_items);
					ListPan3.SetList(Order);
					sum += (Float.parseFloat(TFPrice.getText()) * Float.parseFloat(TFQuantity.getText()));
					TFTotal.setText(String.valueOf(sum));

					System.out.println(Order);
				}

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
				if (MenuList.isEmpty() == false) {
					BTNRestaurant.setEnabled(false);
					BTNArea.setEnabled(false);
					BTNDelete.setEnabled(true);
				}
			}
		});

		BTNOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				DBOrder.AddOrder(new OrderModel(current_client.getClient_address(), TFPostalCode.getText(),
						TFDeliveryTimeYMD.getText(), Order.toString(),
						TFHour.getText() + ":" + TFMinute.getText() + ":00", Float.parseFloat(TFPrice.getText()),
						"NOT READY", RestaurantList.get(ListPan.GetSelectedIndex()).getId(), current_client.getId()));

				// FAlerts.Say("Order Deletion Cancelled", "Order was ordered in
				// the correct order without any order from anyone
				// successfully!");
				// Navigator.Dashboard(Me);
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

				if (Order.isEmpty() == false) {
					String selected = Order.get(ListPan3.GetSelectedIndex()).toString();
					String x = Order.get(ListPan3.GetSelectedIndex()).toString().substring(selected.indexOf(": ") + 2,
							selected.indexOf("$"));
					float selected_price = Float.parseFloat(x);

					Order.remove(ListPan3.GetSelectedIndex());

					ListPan3.SetList(Order);
					sum -= (selected_price);
					TFTotal.setText(String.valueOf(new DecimalFormat("##.##").format(sum)));
				}
				if (ListPan3.isEmpty()) {
					BTNRestaurant.setEnabled(true);
					BTNArea.setEnabled(true);
					BTNDelete.setEnabled(false);
				}

			}
		});

		BTNCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Navigator.Dashboard(Me);

			}

		});

	}

	public static boolean isNumeric(final String str) {

		// null or empty
		if (str == null || str.length() == 0) {
			return false;
		}

		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;

	}
}
