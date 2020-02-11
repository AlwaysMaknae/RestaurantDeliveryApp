package Form.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.RestaurantModel;
import utils.FAlerts;

public class FEditMenu extends FEditMenuPage {

	private ItemModel UpdateMenuItem;
	private ItemModel DeleteMenuItem;
	private ArrayList<Float> ArrayPrice;

	public FEditMenu() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
		
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

//					ArrayPrice.set(GET SPECIFIED PRICE DEPEDNING ON WHICH ITEM WAS SELECTED, Float.parseFloat(TFPrice.getText()));
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
		
		BTNEditMenu.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Empty Menu validation
				
//				if (MenuItemListPan.GetSelectedIndex() < 0) {
//					FAlerts.Error("Empty Menu Error", "Please add items to Menu before creating a Menu.");
//				} else {

//					if(//TODO DISPLAY A FALERT THAT DISPLAYS THE ITEM NAME AND PRICE AS WELL AS A CONFIRMATION
					//IF THE USER WANTS TO EDIT THE MENU. IF HE DOES ACCEPT EDIT THE MENU ITEMS TO THE DATA BASE
					//VIA THE ITEMMODEL AND ITEMDB, IF HE DOESNT ACCEPT SHOW A POPUP OF THE CANCELATION.
//							) {
						
//				UpdateMenuItem.getItem_id();
//				UpdateMenuItem.setItem_dish(Menu.toString());
//				UpdateMenuItem.setItem_price(Float.parseFloat(ArrayPrice.toString()));
//				UpdateMenuItem.setRestaurant_id(ListPan.GetSelectedIndex());
//				UpdateMenuItem.setStatus(I DONT KNOW ASK FRANK);
						
//				UpdateMenuItem.Update();
						
//					}else {
//						FAlerts.Say("Cancel Success", "Menu has been successfully cancelled!");
//					}
					
//				}
				
			}
		}); 
		
		BTNEditItem.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Selected Restaurant Validation
				
//				if(RESTAURANT IN SCROLLPANE IS SELECTED){

//					ListPan.GetSelectedIndex();
//					ListPan.GetSelectedItem();
				
//					TFItem.setText(ListPan.GetSelectedItem().toString());
//					TFPrice.setText(GET SPECIFIED PRICE DEPEDNING ON THE ID OF THE ITEM SELECTED);

//				}else {

//					FAlerts.Error("Selection Error", "Please select a Restaurant.");
//				}
				
				
				
			}
		});
		
		BTNDeleteItem.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Restaurant is selected validation
				
//				if(RESTAURANT IS SELECTED) {
					//Menu Has Items validation

//					if(MenuItemListPan.GetSelectedIndex() < 0) {
						//Item is selected validation
						
//						if(ITEM IS SELECTED) {
							
//							if(FAlerts.Confirm("Deletion Confirmation", "Would you like to delete" + "PUT ITEM NAME AND PRICE HERE")) {
//								int ID = MenuItemListPan.GetSelectedIndex();				
//								DeleteMenuItem.Delete(ID);
//								Menu.remove(ID);
								
//								repaint();
//								revalidate();
//							}else {
//								FAlerts.Say("Deletion Cancelled", "Deletion was successfully cancelled!");
//							}
							
//						}else {
//							FAlerts.Error("Selection Error", "Please select an item to delete.");

//						}
//					}else {
//						FAlerts.Error("Empty Menu Error", "Please add item to Menu to delete.");

//					}
//				}else {
//					FAlerts.Error("Selection Error", "Please select a Restaurant.");
//				}
			}
		});	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
