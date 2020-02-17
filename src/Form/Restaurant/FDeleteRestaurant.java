package Form.Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.RestaurantModel;
import database.DBRestaurant;
import utils.FAlerts;
import utils.FHoursComboBox;

public class FDeleteRestaurant extends FDeleteRestaurantPage{

	private ArrayList<Object> DeliveryAreas;
	private RestaurantModel DeleteRestaurant;
	
	public FDeleteRestaurant() {
		
		DeleteRestaurant = null;
		
		ArrayList<RestaurantModel> RestaurantList = DBRestaurant.getAllRestaurants();
		ArrayList<Object> Restaurant = new ArrayList<Object>();
		for (RestaurantModel rr : RestaurantList) {
			Restaurant.add("" + rr.getId() + " : " + rr.getName() );
		}
		
		TFPhoneNum.SetMask("###-###-####");
		TFDeliveryArea.SetMask("L#L");
		ListPan.SetList(Restaurant);
		

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ListPan.GetSelectedIndex() + " : " + ListPan.GetSelectedItem());
				
				DeleteRestaurant = RestaurantList.get(ListPan.GetSelectedIndex());
				DeleteRestaurant.Read();
				
				TFRestaurantName.setText( DeleteRestaurant.getName() );
				TFRestaurantAddress.setText(DeleteRestaurant.getAddress());
				TFPhoneNum.setText(DeleteRestaurant.getNumber()); 
				DeliveryAreas = new ArrayList<Object>();
				
				if(DeleteRestaurant.getOpenings()[0] != null) {
					for (int i = 0; i < Fcb_open.length; i++) {
						//Setup Openings
						Fcb_open[i].setSelectedFromText(DeleteRestaurant.getOpenings()[i].toString());
					}
					
					for (int i = 0; i < Fcb_close.length; i++) {
						Fcb_close[i].setSelectedFromText(DeleteRestaurant.getClosings()[i].toString());
					}
				} else {
					for (FHoursComboBox cx : Fcb_open) {cx.setSelectedIndex(0);}
					for (FHoursComboBox cx : Fcb_close) {cx.setSelectedIndex(0);}
				}

				
				for (String s : DeleteRestaurant.getArealist()) {
					DeliveryAreas.add(s);
				}
				
				JTADeliveryArea.SetList(DeliveryAreas);
			}
		});

		BTNDeliveryRestaurantDelete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Deleting a Restaurant
				if(DeleteRestaurant != null && FAlerts.Confirm("Confirm Deletion", "Are you sure you want to delete the restaurant: " + DeleteRestaurant.getName() + "?")) {
					
					DeleteRestaurant.Delete();
					DeleteRestaurant = null;
					
					ArrayList<RestaurantModel> RestaurantList = DBRestaurant.getAllRestaurants();
					ArrayList<Object> Restaurant = new ArrayList<Object>();
					for (RestaurantModel rr : RestaurantList) {
						Restaurant.add("" + rr.getId() + " : " + rr.getName() );
					}
					
					
					TFRestaurantName.setText( "" );
					TFRestaurantAddress.setText("");
					TFPhoneNum.setText(""); 
					DeliveryAreas = new ArrayList<Object>();
					
					for (FHoursComboBox cx : Fcb_open) {cx.setSelectedIndex(0);}
					for (FHoursComboBox cx : Fcb_close) {cx.setSelectedIndex(0);}
					
					DeliveryAreas = new ArrayList<Object>();
					
					JTADeliveryArea.SetList(DeliveryAreas);
				}
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
