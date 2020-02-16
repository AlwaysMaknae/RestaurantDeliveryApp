package Form.Deliverers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import Model.DelivererModel;
import database.DBClient;
import utils.FAlerts;
import utils.FTextField;
import utils.Navigator;

public class FAddDeliverer extends FAddDelivererPage {

	private FTextField username = new FTextField(20);
	private FTextField password = new FTextField(20);
	private FTextField confirmpass = new FTextField(20);

	private boolean exit = false;
	private boolean Existing = true;
	private int flag;

	private ArrayList<Object> DeliveryAreas;
	private Object[] message = { "Username", username, "Password", password, "Confirm Password", confirmpass };
	private DelivererModel NewDeliveryMan;

	public FAddDeliverer() {

		NewDeliveryMan = new DelivererModel("");

		DeliveryAreas = new ArrayList<Object>();
		TFDeliveryArea.SetMask("L#L");
		
		TFPhoneNum_1.SetMask("###");
		TFPhoneNum_2.SetMask("###");
		TFPhoneNum_3.SetMask("####");

		BTNVerify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Existing Account verification.

				if (DBClient.CheckUser(TFNewUsername.getText()) != null) {
					Existing = true;
					FAlerts.Error("New Account Error", "Account Username already exists");
					TFNewUsername.SetInvalid();

				} else {
					Existing = false;
					FAlerts.Say("New Account", "Username is valid!");

					TFNewUsername.IsValid();
				}

			}
		});

		BTNAddDeliveryArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (TFDeliveryArea.IsValid()) {
					DeliveryAreas.add(TFDeliveryArea.GetContent());
					JTADeliveryArea.SetList(DeliveryAreas);
					TFDeliveryArea.setText("");
				} else {
					FAlerts.Error("Delivery Area Error", "Invalid Delivery Area");
				}

			}
		});

		BTNDeleteDeliveryArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (JTADeliveryArea.isEmpty()) {
					FAlerts.Error("Delete Area Error", "List is Empty");
				}

				if (JTADeliveryArea.GetSelectedIndex() > -1) {
					DeliveryAreas.remove(JTADeliveryArea.GetSelectedIndex());
					JTADeliveryArea.SetList(DeliveryAreas);
				}

			}
		});

		BTNSaveDeliveryArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (Existing == true) {
					TFNewUsername.SetInvalid();
				}else
					TFNewUsername.IsValid();			

				if (TFName.getText().length() < 2 || TFName.getText().length() > 50)
					TFName.SetInvalid();

				if (TFPhoneNum_1.getText().length() < 3 || TFPhoneNum_2.getText().length() < 3 || TFPhoneNum_3.getText().length() < 4) {
					TFPhoneNum_1.SetInvalid();
					TFPhoneNum_2.SetInvalid();
					TFPhoneNum_3.SetInvalid();
				}
				
				if (JTADeliveryArea.isEmpty()) {
					FAlerts.Error("Delivery Area Error", "Missing Delivery Area");

				}else if (!TFNewUsername.IsValid() || !TFName.IsValid() || !TFPhoneNum_1.IsValid() || !TFPhoneNum_2.IsValid() || !TFPhoneNum_3.IsValid()) {
					FAlerts.Error("Invalid Input Field", "Invalid Info");

				} else {
					if (String.valueOf(TFPassword.getPassword())
							.contentEquals(String.valueOf(TFConfirmPass.getPassword()))
							&& !String.valueOf(TFPassword.getPassword()).contentEquals("")
							&& !String.valueOf(TFConfirmPass.getPassword()).contentEquals("")
							&& String.valueOf(TFPassword.getPassword()).length() < 50
							&& String.valueOf(TFPassword.getPassword()).length() > 2) {
						
						for (Object j : DeliveryAreas) {
							NewDeliveryMan.getArealist().add((String) j);
						}
						NewDeliveryMan.SyncAreas();

						TFPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
						TFConfirmPass.setBorder(BorderFactory.createLineBorder(Color.GREEN));
						NewDeliveryMan.setUsername(TFNewUsername.getText());
						NewDeliveryMan.setPassword(String.valueOf(TFConfirmPass.getPassword()));
						NewDeliveryMan.setName(TFName.getText());
						NewDeliveryMan.setNumber(
								TFPhoneNum_1.getText() + "-" + TFPhoneNum_2.getText() + "-" + TFPhoneNum_3.getText());

						boolean answer = FAlerts.Confirm("Confirm Submission",
								"Username: " + NewDeliveryMan.getUsername() + "\nName: "
										+ NewDeliveryMan.getName() + "\nPhone Number: "
										+ NewDeliveryMan.getNumber() + "\nDelivery Areas: "
										+ NewDeliveryMan.getArea()) ;

						if (answer == true) {
							FAlerts.Say("Confirm Submission", "Account has been created!");
							NewDeliveryMan.Create();
							Navigator.Dashboard(Me);
						}
					} else {
						TFPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
						TFConfirmPass.setBorder(BorderFactory.createLineBorder(Color.RED));
					}

				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
