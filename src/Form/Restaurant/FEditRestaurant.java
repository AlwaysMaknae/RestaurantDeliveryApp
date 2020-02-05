package Form.Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.RestaurantModel;

public class FEditRestaurant extends FEditRestaurantPage{
	
	public FEditRestaurant() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
		
		ArrayList<RestaurantModel> RestaurantList = new ArrayList<RestaurantModel>();
		//RM = DBRestaurant.GetAllRestaurants();
		
		
		ArrayList<Object> Fruits = new ArrayList<Object>();
		
		Fruits.add("Orange");
		Fruits.add("Apple");
		Fruits.add("Cherry");
		Fruits.add("Melon");
		Fruits.add("Cheese");
		
		/*
		for (RestaurantModel r : RestaurantList) {
			Fruits.add(r.getName());
		}
		*/
		
		ListPan.SetList(Fruits);
	
		BTNSelect.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ListPan.GetSelectedIndex() + " : " + ListPan.GetSelectedItem());
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}
