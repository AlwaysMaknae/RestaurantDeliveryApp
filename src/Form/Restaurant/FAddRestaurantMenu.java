package Form.Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.RestaurantModel;

public class FAddRestaurantMenu extends FAddRestaurantMenuPage{
	
	public FAddRestaurantMenu() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
	
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
		
		BTNRestaurantCreateMenu.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//TODO Opens a create Menu for the selected Restaurant
				
			}
		});

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}

}
