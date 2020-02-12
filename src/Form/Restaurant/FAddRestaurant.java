package Form.Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.ClientModel;
import Model.RestaurantModel;
import utils.FAlerts;

public class FAddRestaurant extends FAddRestaurantPage {

	private ArrayList<String> DeliveryArea;
	private RestaurantModel NewRestaurant;

	public FAddRestaurant() {
		NewRestaurant = new RestaurantModel("");

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
//					if(TFDeliveryArea HAS MORE THAN 3 CHARACTERS) {
//						FAlerts.Error("Delivery Area Error", "Unknown Delivery Area");
//						
//					}else{
//						DeliveryArea.add(TFDeliveryArea.getText());
//						JTADeliveryArea.setText(DeliveryArea);
//						
//					}

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
//				if(!TFRestaurantName.IsValid() || !TFRestaurantAddress.IsValid() || !TFPhoneNum_1.IsValid() && !TFPhoneNum_2.IsValid() && !TFPhoneNum_3.IsValid() ) {
//					FAlerts.Error("Add Restaurant Error", "Missing Fields");

				//Non selected Comboboxes verification	
//				}else if(COMBOBOXES ARE NOT SELECTED) {
//					FAlerts.Error("Restaurant Time Error", "Please select an appropriate Opening/Closing time");

				//Empty JTA Delivery Area verification	
//				}else if(JTADeliveryArea.getText().trim().length() == 0){
//					FAlerts.Error("Delivery Area Error", "Missing Delivery Area");

//				}else {
//				if(FAlerts.Confirm("Confirm", " Restaurant Name: " + TFRestaurantName.getText() + "\n Restaurant Address: "
//						+ TFRestaurantAddress.getText() + "\n Phone Number: (" + TFPhoneNum_1.getText() + ") "
//						+ TFPhoneNum_2.getText() + " - " + TFPhoneNum_3.getText() + "\n" + "\n          Opening Hours"
//						+ "\n Sunday:   " + Fcb + "\n Monday:   " + Fcb + "\n Tuesday:  " + Fcb + "\n Wednesday: " + Fcb
//						+ "\n Thursday: " + Fcb + "\n Friday:   " + Fcb + "\n Saturday: " + Fcb + "\n" 
//						+ "\n Postal Code covered by this Restaurant: \n" + JTADeliveryArea.getText() + "\n" 
//						+ "\n Would you like to save this restaurant?")) {

//					NewRestaurant.setName(TFRestaurantName.getText());
//					NewRestaurant.setAddress(TFRestaurantAddress.getText());
//					NewRestaurant.setNumber(TFPhoneNum_1.getText() + TFPhoneNum_2.getText() + TFPhoneNum_3.getText()); 
//					NewRestaurant.setHours(Fcb.toString()); //WORK IN PROGRESS
//					NewRestaurant.setAreas(JTADeliveryArea.getText());

//					NewRestaurant.Create();
					
//					}
//				}

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
