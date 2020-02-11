package Form.Deliverers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.DelivererModel;
import jdk.nashorn.internal.scripts.JO;
import utils.FAlerts;
import utils.FTextField;

public class FAddDeliverer extends FAddDelivererPage {

	private FTextField username = new FTextField(20);
	private FTextField password = new FTextField(20);
	private FTextField confirmpass = new FTextField(20);
	
	private boolean exit = false;
	private int flag;
	
	private ArrayList<String> DeliveryArea;
	private Object[] message = { "Username", username, "Password", password, "Confirm Password", confirmpass };
	
	private DelivererModel NewDeliveryMan;

	public FAddDeliverer() {

		NewDeliveryMan = new DelivererModel("");
		
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


				
				// Empty Fields verification
//				if (!TFName.IsValid() || !TFPhoneNum_1.IsValid() || !TFPhoneNum_2.IsValid()
//						|| !TFPhoneNum_3.IsValid()) {
//					FAlerts.Error("Info Error", "Missing Fields");

					// Empty JTA Delivery Area verification
//				} else if (JTADeliveryArea.getText().trim().length() == 0) {
//					FAlerts.Error("Delivery Area Error", "Missing Delivery Area");

//				} else {
//					if (FAlerts.Confirm("Save Confirm",
//							" Name: " + TFName.getText() + "/n Telephone Number: (" + TFPhoneNum_1.getText() + ") "
//									+ TFPhoneNum_2.getText() + " - " + TFPhoneNum_3.getText()
//									+ "\n Postal Code covered by this delivery man: \n" + DeliveryArea + "\n" + "\n Would you like to save this delivery man?")) {

//						if(FAlerts.AskDeliverer("Create new Delivery Guy", message)) {
					
//								do{
//										if(username.getText().equals("") || password.getText().equals("") || confirmpass.getText().equals("")) {
//												FAlerts.Error("Missing info Error", "Missing fields");
//												flag = JOptionPane.showConfirmDialog(null, message, "Create new Delivery Guy", JOptionPane.YES_NO_OPTION);	
//										}else {
//												NewDeliveryMan.setId(IDK ASK FRANK);
//												NewDeliveryMan.setName(username.getText());
//												NewDeliveryMan.setArea(SET IT TO THE ARRAYLIST);
//												NewDeliveryMan.setNumber(TFPhoneNum_1.getText() + TFPhoneNum_2.getText() + TFPhoneNum_3.getText());
//												NewDeliveryMan.setStatus(IDK ASK FRANK);
							
//												NewDeliveryMan.Create();
							
//												FAlerts.Say("Added Deliverer", "Added Delivery Guy Successfully!");
//												exit = true;
//										}
										
//										if(flag == JOptionPane.NO_OPTION || flag == JOptionPane.CLOSED_OPTION) {
//											exit = true;
//										}
						
//								}while(!exit); 

//									FAlerts.Say("New Deliverer Cancelled", "New Delivery Man has been successfully cancelled!");
						
//						}else {
//							FAlerts.Say("New Deliverer Cancelled", "New Delivery Man has been successfully cancelled!");
//						}

//					}else {
//						FAlerts.Say("Save Cancelled", "Save has been successfully cancelled!");
//					}
//				}

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
