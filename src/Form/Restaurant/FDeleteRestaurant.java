package Form.Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.RestaurantModel;
import utils.FAlerts;

public class FDeleteRestaurant extends FDeleteRestaurantPage{

	private RestaurantModel DeleteRestaurant;
	
	public FDeleteRestaurant() {
	
		//TODO Make DeleteRestaurant linked with the selected Restaurant 
		//DeleteRestaurant = (RestaurantModel) ListPan.GetSelectedItem();
		
		ArrayList<RestaurantModel> RestaurantList = new ArrayList<RestaurantModel>();
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

		ListPan.SetList(Restaurant);

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ListPan.GetSelectedIndex() + " : " + ListPan.GetSelectedItem());
				
//				Select a restaurant and press SELECT. This transfers the info into the correct textfields which can be edited.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and display the info in the textfields
			}
		});

		BTNDeliveryRestaurantDelete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Deleting a Restaurant
//				if(FAlerts.Confirm("Confirm Deletion", "Are you sure you want to delete the restaurant: " + TFRestaurantName.getText() + "?")) {
//					
					//TODO Get Selected Restaurant and delete it.
//					int ID = ListPan.GetSelectedIndex();				
//					DeleteRestaurant.Delete(ID);		
//					ListPan.remove(ID);
				
//					repaint();
//					revalidate();
//				}
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
