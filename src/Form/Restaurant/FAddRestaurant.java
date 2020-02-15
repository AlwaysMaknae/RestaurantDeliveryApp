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
		//JTADeliveryAre//
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
				
				NewRestaurant.setHours("");
				boolean cbTimesError = true;
				
				for (int i = 0; i < Fcb_open.length; i++) {
					NewRestaurant.setHours(NewRestaurant.getHours()  + Fcb_open[i].getSelectedItem()  + " ");
				}
				for (int i = 0; i < Fcb_close.length; i++) {
					NewRestaurant.setHours(NewRestaurant.getHours() + Fcb_close[i].getSelectedItem() + " ");
					if(Fcb_open[i].getSelectedIndex() >= Fcb_close[i].getSelectedIndex()) {
						cbTimesError = false;
					}
				}


				if(!TFRestaurantName.IsValid() || !TFRestaurantAddress.IsValid() || !TFPhoneNum_1.IsValid() && !TFPhoneNum_2.IsValid() && !TFPhoneNum_3.IsValid() ) {
					FAlerts.Error("Add Restaurant Error", "Missing Fields");
				

				//CB times are bad ( closing before opening)
				}else if(cbTimesError) {
				FAlerts.Error("Restaurant Time Error", "Please select an appropriate Opening/Closing time");

				
				//Empty JTA Delivery Area verification	
				//}else if(JTADeliveryArea.){ Empty Val
//					FAlerts.Error("Delivery Area Error", "Missing Delivery Area");

				}else {
				if(FAlerts.Confirm("Confirm", " Restaurant Name: " + TFRestaurantName.getText() + "\n Restaurant Address: "
						+ TFRestaurantAddress.getText() + "\n Phone Number: (" + TFPhoneNum_1.getText() + ") "
						+ TFPhoneNum_2.getText() + " - " + TFPhoneNum_3.getText() + "\n" + "\n          Opening Hours"
						+ "\n Sunday:   " + Fcb_open[0].getSelectedItem() + " to " + Fcb_close[0].getSelectedItem() 
						+ "\n Monday:   " + Fcb_open[1].getSelectedItem() + " to " + Fcb_close[1].getSelectedItem() 
						+ "\n Tuesday:  " + Fcb_open[2].getSelectedItem() + " to " + Fcb_close[2].getSelectedItem() 
						+ "\n Wednesday: "+ Fcb_open[3].getSelectedItem() + " to " + Fcb_close[3].getSelectedItem() 
						+ "\n Thursday: " + Fcb_open[4].getSelectedItem() + " to " + Fcb_close[4].getSelectedItem()
						+ "\n Friday:   " + Fcb_open[5].getSelectedItem() + " to " + Fcb_close[5].getSelectedItem()
						+ "\n Saturday: " + Fcb_open[6].getSelectedItem() + " to " + Fcb_close[6].getSelectedItem() + "\n" 
						// + "\n Postal Code covered by this Restaurant: \n" + JTADeliveryArea.getText() + "\n" 
						+ "\n Would you like to save this restaurant?")){

				NewRestaurant.setName(TFRestaurantName.getText());
				NewRestaurant.setAddress(TFRestaurantAddress.getText());
				NewRestaurant.setNumber(TFPhoneNum_1.getText() + TFPhoneNum_2.getText() + TFPhoneNum_3.getText()); 
				//NewRestaurant.setAreas(JTADeliveryArea.getText());

				System.out.println("Testing Create Restaurant ");
				//NewRestaurant.Create();
				}
				}
			}
		});
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
