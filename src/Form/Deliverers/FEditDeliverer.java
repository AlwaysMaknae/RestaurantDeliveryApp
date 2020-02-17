package Form.Deliverers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.BorderFactory;

import Model.DelivererModel;
import database.DBDeliverer;
import database.DBItem;
import database.DBRestaurant;
import utils.FAlerts;
import utils.Navigator;

public class FEditDeliverer extends FEditDelivererPage {

	private ArrayList<Object> DeliveryAreas = null;
	private DelivererModel UpdateDeliveryMan;
	private ArrayList<DelivererModel> DelivererList;
	private ArrayList<String> strings;

	public FEditDeliverer() {

		TFDeliveryArea.SetMask("L#L");

		TFPhoneNum_1.SetMask("###");
		TFPhoneNum_2.SetMask("###");
		TFPhoneNum_3.SetMask("####");

		UpdateDeliveryMan = null;

		DelivererList = new ArrayList<DelivererModel>();
		ArrayList<Object> Deliverer = new ArrayList<Object>();

		DelivererList = DBDeliverer.getAllDeliverers();

		for (int i = 0; i < DelivererList.size(); i++) {
			Deliverer.add(DelivererList.get(i).getName());
		}

		ListPan.SetList(Deliverer);

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ListPan.GetSelectedIndex() < 0) {
					FAlerts.Error("Ordering", "please select a restaurant");
					return;
				}
				UpdateDeliveryMan = DelivererList.get(ListPan.GetSelectedIndex());
				UpdateDeliveryMan.Read();

				TFName.setText(UpdateDeliveryMan.getName());

				String phone = UpdateDeliveryMan.getNumber();
				TFPhoneNum_1.setText(phone.substring(0, 3));
				TFPhoneNum_2.setText(phone.substring(4, 7));
				TFPhoneNum_3.setText(phone.substring(8, 12));

				DeliveryAreas = new ArrayList<Object>();
				for (String s : UpdateDeliveryMan.getArealist()) {
					DeliveryAreas.add(s);
				}

				JTADeliveryArea.SetList(DeliveryAreas);
			}
		});

		BTNAddDeliveryArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (TFDeliveryArea.IsValid()) {
					DeliveryAreas.add(TFDeliveryArea.GetContent());
					JTADeliveryArea.SetList(DeliveryAreas);
					TFDeliveryArea.setText("");

					UpdateDeliveryMan.setArea(DeliveryAreas.toString());

					strings = new ArrayList<>(DeliveryAreas.size());
					for (Object object : DeliveryAreas) {
						strings.add(Objects.toString(object, null));
					}

					UpdateDeliveryMan.setArealist(strings);
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

					UpdateDeliveryMan.setArea(DeliveryAreas.toString());

					strings = new ArrayList<>(DeliveryAreas.size());
					for (Object object : DeliveryAreas) {
						strings.add(Objects.toString(object, null));
					}

					UpdateDeliveryMan.setArealist(strings);
					System.out.println(UpdateDeliveryMan.getArea());
				}

			}
		});

		BTNSaveDeliveryArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (TFName.getText().length() < 2 || TFName.getText().length() > 50)
					TFName.SetInvalid();

				if (TFPhoneNum_1.getText().length() < 3 || TFPhoneNum_2.getText().length() < 3
						|| TFPhoneNum_3.getText().length() < 4) {
					TFPhoneNum_1.SetInvalid();
					TFPhoneNum_2.SetInvalid();
					TFPhoneNum_3.SetInvalid();
				}

				if (JTADeliveryArea.isEmpty()) {
					FAlerts.Error("Delivery Area Error", "Missing Delivery Area");

				} else if (!TFName.IsValid() || !TFPhoneNum_1.IsValid() || !TFPhoneNum_2.IsValid()
						|| !TFPhoneNum_3.IsValid()) {
					FAlerts.Error("Invalid Input Field", "Invalid Info");

				} else {

					UpdateDeliveryMan.SyncAreas();

					System.out.println(UpdateDeliveryMan.getArea());

					UpdateDeliveryMan.setName(TFName.getText());
					UpdateDeliveryMan.setNumber(
							TFPhoneNum_1.getText() + "-" + TFPhoneNum_2.getText() + "-" + TFPhoneNum_3.getText());

					boolean answer = FAlerts.Confirm("Confirm Submission",
							"Name: " + UpdateDeliveryMan.getName() + "\nPhone Number: " + UpdateDeliveryMan.getNumber()
									+ "\nDelivery Areas: " + UpdateDeliveryMan.getArea());

					if (answer == true) {
						FAlerts.Say("Confirm Submission", UpdateDeliveryMan.getName() + "'s info has been updated!");
						UpdateDeliveryMan.Update();
						Navigator.Dashboard(Me);
					}

				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
