package Form.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.RestaurantModel;
import utils.FAlerts;

public class FAddMenu extends FAddMenuPage {

	private ItemModel NewMenuItem;
	private ArrayList<Float> ArrayPrice;

	public FAddMenu() {

		NewMenuItem = new ItemModel("");

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

		BTNAddItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Add item to the Menu of the Restaurant.

				// Empty Textfields validation

//				if(!TFItem.IsValid() || !TFPrice.IsValid()) {

//					FAlerts.Error("Missing Info Error", "Missing information");

				// Selected Restaurant Validation
//				}else if(RESTAURANT IN SCROLLPANE IS SELECTED){

//					ArrayPrice.add(Float.parseFloat(TFPrice.getText()));
//					FAlerts.Say("Item Success", "Item successfully added to Menu!");

//				}else {

//					FAlerts.Error("Selection Error", "Please select a Restaurant.");
//				}
			}
		});

		BTNSelect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

//				Select a restaurant and press SELECT. This transfers the info into the correct textfields which can be edited.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and the appropriate Menu items

			}
		});

		BTNCreateMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Empty Menu validation
				
//				if (MenuItemListPan.GetSelectedIndex() < 0) {
//					FAlerts.Error("Empty Menu Error", "Please add items to Menu before creating a Menu.");
//				} else {

//					if(//TODO DISPLAY A FALERT THAT DISPLAYS THE ITEM NAME AND PRICE AS WELL AS A CONFIRMATION
					//IF THE USER WANTS TO ADD THE MENU. IF HE DOES ACCEPT ADD THE MENU ITEMS TO THE DATA BASE
					//VIA THE ITEMMODEL AND ITEMDB, IF HE DOESNT ACCEPT SHOW A POPUP OF THE CANCELATION.
//							) {
						
//				        NewMenuItem.setItem_id(I DONT KNOW ASK FRANK);
//						NewMenuItem.setItem_dish(Menu.toString());
//						NewMenuItem.setItem_price(Float.parseFloat(ArrayPrice.toString()));
//						NewMenuItem.setRestaurant_id(ListPan.GetSelectedIndex());
//						NewMenuItem.setStatus(I DONT KNOW ASK FRANK);
						
//						NewMenuItem.Create();
						
//					}else {
//						FAlerts.Say("Cancel Success", "Menu has been successfully cancelled!");
//					}
					
//				}

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
