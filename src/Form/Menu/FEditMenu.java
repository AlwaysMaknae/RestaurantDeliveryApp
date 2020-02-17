package Form.Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.AccesLevel;
import Model.ItemModel;
import Model.ManagerModel;
import Model.RestaurantModel;
import database.DBItem;
import database.DBRestaurant;
import database.Session;
import utils.FAlerts;

public class FEditMenu extends FEditMenuPage {

	private ArrayList<ItemModel> UpdateMenuList;
	private ArrayList<Float> ArrayPrice;
	private ArrayList<RestaurantModel> RestaurantList;
	private ArrayList<Object> Menu;
	
	private RestaurantModel CurrentRestaurant;
	private ItemModel UpdateMenuItem;

	public FEditMenu() {
		// Empty Login Error Validation once actionlistener is implemented.
		
		RestaurantList = new ArrayList<RestaurantModel>();
		
		ArrayList<ItemModel> MenuList = new ArrayList<ItemModel>();
		ArrayList<Object> Restaurant = new ArrayList<Object>();
		
		Menu = new ArrayList<Object>();
		TFPrice.SetDecimal();
		
		if (Session.AccesType == AccesLevel.GetType(AccesLevel.ADMIN) ) {
			RestaurantList = DBRestaurant.getAllRestaurants();
			
		} else if(Session.AccesType == AccesLevel.GetType(AccesLevel.MANAGER)) {
			ManagerModel user = new ManagerModel(Session.GetUser().getId());
			user.Read();
			CurrentRestaurant = DBRestaurant.GetRestaurant(user.getRestaurant_id());
			RestaurantList.add(CurrentRestaurant);
			TitleLbl.setText("Edit Menu : " + CurrentRestaurant.getName());
			UpdateMenuItemList();
		}
		


		 for (RestaurantModel r : RestaurantList) { 
			 Restaurant.add(r.getName()); 
		 }
		 



		ListPan.SetList(Restaurant);
		MenuItemListPan.SetList(Menu);
		
		BTNAddItem.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Add item to the Menu of the Restaurant.
				if(ListPan.GetSelectedIndex() < 0) {
					return;
				}

				if(TFItem.IsValid() && TFPrice.IsValid()) {					
					float price = Float.parseFloat(TFPrice.GetContent());
					
					ItemModel newIT = new ItemModel(
							CurrentRestaurant.getId(),
							TFItem.GetContent(),
							price);

					if(FAlerts.Confirm("Create Item Menu", 
					"Add this item To " + CurrentRestaurant.getName() + " ?" + 
					"\n" + newIT.getItem_dish() + " for " + newIT.getItem_price())
							) {		
						newIT.setStatus(1);
						newIT.Create();
						UpdateMenuItemList();
					}
					
				}else {
					FAlerts.Error("Missing Info Error", "Missing Item information.");
				}
				
			}
		});
		
		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if( ListPan.GetSelectedIndex() > -1 ) {
					CurrentRestaurant = RestaurantList.get(ListPan.GetSelectedIndex());
					TitleLbl.setText("Edit Menu : " + CurrentRestaurant.getName());
					
					UpdateMenuItemList();

				}
				
				
			}
		}); 
		
		BTNSelectMenuItem.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (MenuItemListPan.GetSelectedIndex() > -1) {
				
				UpdateMenuItem = UpdateMenuList.get(MenuItemListPan.GetSelectedIndex());
				
				TFItem.setText( UpdateMenuItem.getItem_dish() );
				TFPrice.setText(UpdateMenuItem.getItem_price() + "");
				
					
				} else {
					FAlerts.Say("Edit Menu", "Choose an item to Select.");
				}
				
			}
		}); 
		
		BTNEditItem.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Selected Restaurant Validation
				if (MenuItemListPan.GetSelectedIndex() > -1 && UpdateMenuItem != null) {
					// Wait No this is edit
					if(TFItem.IsValid() && TFPrice.IsValid()) {
						
						String msg = "Update " + UpdateMenuItem.getItem_dish() + " : " + UpdateMenuItem.getItem_price();
						msg+= "\n to \n";
						msg+= TFItem.GetContent() + " : " + TFPrice.GetContent();
						
						if(FAlerts.Confirm("Confirm Update", msg)) {
							float price = Float.parseFloat(TFPrice.GetContent());
							UpdateMenuItem.setItem_dish(TFItem.GetContent());
							UpdateMenuItem.setItem_price(price);
							UpdateMenuItem.Update();
							UpdateMenuItemList();
						}
					}else {
						FAlerts.Error("Item Info Error", "Chek Item information.");
					}
				}
				
				
				
			}
		});
		
		BTNDeleteItem.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Selected Restaurant Validation
				if (MenuItemListPan.GetSelectedIndex() > -1 && UpdateMenuItem != null) {
					// Wait No this is edit
					if(TFItem.IsValid() && TFPrice.IsValid()) {
						
						String msg = "Delete  " + UpdateMenuItem.getItem_dish() + " : " + UpdateMenuItem.getItem_price();
						msg+= " ? \n";
						
						if(FAlerts.Confirm("Confirm Delete", msg)) {
							UpdateMenuItem.Delete();
							UpdateMenuItem = null;
							UpdateMenuItemList();
						}
					}else {
						FAlerts.Error("Item Info Error", "Chek Item information.");
					}

				}
			}
		});	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
	
	
	private void UpdateMenuItemList() {
		UpdateMenuList = DBItem.getAllItems(CurrentRestaurant.getId());
		
		Menu.clear();
		
		for (ItemModel iT : UpdateMenuList) {
			Menu.add(iT.getItem_dish() + " : " + iT.getItem_price() );
		}
		
		MenuItemListPan.SetList(Menu);
		TFItem.setText("");
		TFPrice.setText("");
		
	}

}
