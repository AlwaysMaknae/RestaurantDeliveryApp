package Form.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.RestaurantModel;
import database.DBItem;
import database.DBRestaurant;
import utils.FAlerts;

public class FEditMenu extends FEditMenuPage {

	private ArrayList<ItemModel> UpdateMenuList;
	private ArrayList<Float> ArrayPrice;
	private ArrayList<RestaurantModel> RestaurantList;
	
	private RestaurantModel CurrentRestaurant;

	public FEditMenu() {
		// Empty Login Error Validation once actionlistener is implemented.
		
		RestaurantList = new ArrayList<RestaurantModel>();
		ArrayList<ItemModel> MenuList = new ArrayList<ItemModel>();

		RestaurantList = DBRestaurant.getAllRestaurants();
		

		ArrayList<Object> Restaurant = new ArrayList<Object>();

		  for (RestaurantModel r : RestaurantList) { 
			  Restaurant.add(r.getName()); 
		  }
		 

		ArrayList<Object> Menu = new ArrayList<Object>();

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
				
				if( ListPan.GetSelectedIndex() > -1 ) {
					CurrentRestaurant = RestaurantList.get(ListPan.GetSelectedIndex());
					
					UpdateMenuList = DBItem.getAllItems(CurrentRestaurant.getId());
					
					Menu.clear();
					
					for (ItemModel iT : UpdateMenuList) {
						Menu.add("" + iT.getItem_dish() + " : " + iT.getItem_price() );
					}
					
					MenuItemListPan.SetList(Menu);

				}
				
				
			}
		}); 
		
		BTNSelectMenuItem.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (MenuItemListPan.GetSelectedIndex() > -1) {
						
//				UpdateMenuItem.getItem_id();
//				UpdateMenuItem.setItem_dish(Menu.toString());
//				UpdateMenuItem.setItem_price(Float.parseFloat(ArrayPrice.toString()));
//				UpdateMenuItem.setRestaurant_id(ListPan.GetSelectedIndex());
//				UpdateMenuItem.setStatus(I DONT KNOW ASK FRANK);
						
//				UpdateMenuItem.Update();
					
				}
				
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
