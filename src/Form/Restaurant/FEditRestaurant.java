package Form.Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import Model.RestaurantModel;
import database.DBRestaurant;

public class FEditRestaurant extends FEditRestaurantPage {

	private ArrayList<String> DeliveryArea;
	private RestaurantModel UpdateRestaurant;
	
	public FEditRestaurant() {
	

		ArrayList<RestaurantModel> RestaurantList = DBRestaurant.getAllRestaurants();

		ArrayList<Object> Restaurant = new ArrayList<Object>();
		for (RestaurantModel rr : RestaurantList) {
			Restaurant.add("" + rr.getId() + " : " + rr.getName() );
		}

		ListPan.SetList(Restaurant);
		BTNDeliverySave.addActionListener(this);
		

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ListPan.GetSelectedIndex() + " : " + ListPan.GetSelectedItem());
				
//				Select a restaurant and press SELECT. This transfers the info into the correct textfields which can be edited.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected restaurant and display the info in the textfields
				
				System.out.println();
				System.out.println("Opening Times");
				
				for (int i = 0; i < Fcb_open.length; i++) {
					//Setup Openings
				}
				
				for (int j = 0; j < Fcb_close.length; j++) {
					//Setup Closings
				}
				
				
			}
		});
		
		BTNModifyAll.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				// Modify all Comboboxes depending on what the first Combobox is set to.
				
			}
		});
		
		BTNAddDeliveryArea.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// No more than 3 characters verification.
//				if(TFDeliveryArea HAS MORE THAN 3 CHARACTERS) {
//					FAlerts.Error("Delivery Area Error", "Unknown Delivery Area");
//					
//				}else{
//					DeliveryArea.add(TFDeliveryArea.getText());
//					JTADeliveryArea.setText(DeliveryArea);
//					
//				}
				
			}
		});
		
		BTNDeleteDeliveryArea.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Empty JTA Delivery Area verification
//				if(JTADeliveryArea.getText().equals("")) {
//					FAlerts.Error("Delivery Area Error", "No Delivery Areas present");

//				}else {
				// Deletes the most recently added Delivery Area
//					DeliveryArea.remove(DeliveryArea.size() - 1);
//				

//				}
//              repaint();
//				revalidate();
				
			}
		});
		
		BTNDeliverySave.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Empty Fields verification
//				if(!TFRestaurantName.isValid() || !TFRestaurantAddress.isValid() || !TFPhoneNum_1.isValid() && !TFPhoneNum_2.isValid() && !TFPhoneNum_3.isValid() ) {
//					FAlerts.Error("Add Restaurant Error", "Missing Fields");

				//Non selected Comboboxes verification	
//				}else if(COMBOBOXES ARE NOT SELECTED) {
//					FAlerts.Error("Restaurant Time Error", "Please select an appropriate Opening/Closing time");

				//Empty JTA Delivery Area verification	
//				}else if(!JTADeliveryArea.isValid()){
//					FAlerts.Error("Delivery Area Error", "Missing Delivery Area");

//				}else {
//				if(FAlerts.Confirm("Confirm", " Restaurant Name: " + TFRestaurantName.getText() + "\n Restaurant Address: "
//						+ TFRestaurantAddress.getText() + "\n Phone Number: (" + TFPhoneNum_1.getText() + ") "
//						+ TFPhoneNum_2.getText() + " - " + TFPhoneNum_3.getText() + "\n" + "\n          Opening Hours"
//						+ "\n Sunday:   " + Fcb + "\n Monday:   " + Fcb + "\n Tuesday:  " + Fcb + "\n Wednesday: " + Fcb
//						+ "\n Thursday: " + Fcb + "\n Friday:   " + Fcb + "\n Saturday: " + Fcb + "\n" 
//						+ "\n Postal Code covered by this Restaurant: \n" + JTADeliveryArea.getText() + "\n" 
//						+ "\n Would you like to save he changes to this restaurant?")) {

//					UpdateRestaurant.setName(TFRestaurantName.getText());
//					UpdateRestaurant.setAddress(TFRestaurantAddress.getText());
//					UpdateRestaurant.setNumber(TFPhoneNum_1.getText() + TFPhoneNum_2.getText() + TFPhoneNum_3.getText()); 
//					UpdateRestaurant.setHours(Fcb.toString()); //WORK IN PROGRESS
//					UpdateRestaurant.setAreas(JTADeliveryArea.getText());
//
//					UpdateRestaurant.Update();
					
//					}
//				}
				
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {}

}
