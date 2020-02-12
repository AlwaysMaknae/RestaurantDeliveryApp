package Form.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.RestaurantModel;
import utils.FAlerts;

public class FDeleteMenu extends FDeleteMenuPage {

	private ItemModel DeleteMenu;
	
	public FDeleteMenu() {

		ArrayList<RestaurantModel> RestaurantList = new ArrayList<RestaurantModel>();
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

		ArrayList<Object> Menu = new ArrayList<Object>();

		Menu.add("Hot Dog");
		Menu.add("Pufferfish");

		ListPan.SetList(Restaurant);
		MenuItemListPan.SetList(Menu);

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				Select a restaurant and press SELECT. This transfers the info into the correct textfields which can be edited.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and the appropriate Menu items

			}
		});

		BTNDeleteMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Restaurant is selected validation
//				if(RESTAURANT IS SELECTED) {
					//Menu is selected validation
//					if(MENU IS SELECTED) {
//						if(FAlerts.Confirm("Deletion Confirmation", "Would you like to delete the Menu of: " + ListPan.GetSelectedItem().toString() + "?")){
							
//							int ID = MenuItemListPan.GetSelectedIndex();				
//							DeleteMenu.Delete(ID);		
//							MenuItemListPan.remove(ID);
						
//							repaint();
//							revalidate();
							
//						}else {
//							FAlerts.Say("Deletion Cancelled", "Deletion has been successfully cancelled!");
//						}
//					}else{
//						FAlerts.Error("Selection Error", "Please select Menu to delete.");
//					}
//				}else {
//					FAlerts.Error("Selection Error", "Please select Restaurant.");

//				}

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
