package Form.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.RestaurantModel;

public class FDeleteMenu extends FDeleteMenuPage {

	public FDeleteMenu() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */

		ArrayList<RestaurantModel> RestaurantList = new ArrayList<RestaurantModel>();
		// ArrayList<ItemModel> MenuList = new ArrayList<ItemModel>();

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

		// ArrayList<Object> Menu = new ArrayList<Object>();

		// Menu.add("Hot Dog");
		// Menu.add("Pufferfish");

		ListPan.SetList(Restaurant);
		// MenuItemListPan.SetList(Menu);

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		BTNDeleteMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
