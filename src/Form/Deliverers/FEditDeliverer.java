package Form.Deliverers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.DelivererModel;
import utils.FAlerts;

public class FEditDeliverer extends FEditDelivererPage {

	private ArrayList<String> DeliveryArea;
	private DelivererModel UpdateDeliveryMan;

	public FEditDeliverer() {
		
		ArrayList<DelivererModel> DelivererList = new ArrayList<DelivererModel>();

		ArrayList<Object> Deliverer = new ArrayList<Object>();

		Deliverer.add("Jeff");
		Deliverer.add("Geoff");
		Deliverer.add("Jeph");
		Deliverer.add("Geoph");


		ListPan.SetList(Deliverer);
		
		BTNSelect.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				Select a delivery guy and press SELECT. This transfers the info into the correct textfields.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected delivery guy and display the info in the textfields
				
			}
		});
		
		BTNAddDeliveryArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// No more than 3 characters verification.
//				if(TFDeliveryArea HAS MORE THAN 3 CHARACTERS) {
//					FAlerts.Error("Delivery Area Error", "Unknown Delivery Area");

//				}else{
//					DeliveryArea.add(TFDeliveryArea.getText());
//					JTADeliveryArea.setText(DeliveryArea);

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
		
		BTNSaveDeliveryArea.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Selected Delivery Man validation
				
//				if(DELIVERY MAN IS SELECTED) {
					// Empty Fields verification
					
//					if (!TFName.IsValid() || !TFPhoneNum_1.IsValid() || !TFPhoneNum_2.IsValid()
//							|| !TFPhoneNum_3.IsValid()) {
//						FAlerts.Error("Info Error", "Missing Fields");
						// Empty JTA Delivery Area verification
						
//					} else if (JTADeliveryArea.getText().trim().length() == 0) {
//						FAlerts.Error("Delivery Area Error", "Missing Delivery Area");

//					} else {
//					if(FAlerts.Confirm("Edit Confirmation","Would you like to save the changes?")) {

//							UpdateDeliveryMan.setName(username.getText());
//							UpdateDeliveryMan.setArea(SET IT TO THE ARRAYLIST);
//							UpdateDeliveryMan.setNumber(TFPhoneNum_1.getText() + TFPhoneNum_2.getText() + TFPhoneNum_3.getText());
//							UpdateDeliveryMan.setStatus(IDK ASK FRANK);
		
//							UpdateDeliveryMan.Update();
							
//							}else {
//								FAlerts.Say("Edit Cancelled", "");
//							}
//					}					
//				}else {
//					FAlerts.Error("Selection Error", "Please select a Delivery Man to edit.");
//				}
				
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
