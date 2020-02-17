package Form.Restaurant;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.JComboBox;

import Model.AccesLevel;
import Model.ManagerModel;
import Model.RestaurantModel;
import database.DBRestaurant;
import database.Session;
import utils.FAlerts;
import utils.FHoursComboBox;

public class FEditRestaurant extends FEditRestaurantPage {

	private ArrayList<Object> DeliveryAreas;
	ArrayList<RestaurantModel> RestaurantList;
	private RestaurantModel UpdateRestaurant;
	private ArrayList<String> strings;

	public FEditRestaurant() {

		UpdateRestaurant = null;

		ArrayList<Object> Restaurant = new ArrayList<Object>();
		RestaurantList = new ArrayList<RestaurantModel>();

		TFPhoneNum.SetMask("###-###-####");
		TFDeliveryArea.SetMask("L#L");

		if (Session.AccesType == AccesLevel.GetType(AccesLevel.ADMIN)) {
			RestaurantList = DBRestaurant.getAllRestaurants();

		} else if (Session.AccesType == AccesLevel.GetType(AccesLevel.MANAGER)) {
			ManagerModel user = new ManagerModel(Session.GetUser().getId());
			user.Read();
			UpdateRestaurant = DBRestaurant.GetRestaurant(user.getRestaurant_id());
			RestaurantList.add(UpdateRestaurant);
			TitleLbl.setText("Edit Menu : " + UpdateRestaurant.getName());

			PopulateFromSetModel();
		}

		for (RestaurantModel rr : RestaurantList) {
			Restaurant.add("" + rr.getId() + " : " + rr.getName());
		}

		ListPan.SetList(Restaurant);

		BTNDeliverySave.addActionListener(this);

		BTNSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (ListPan.GetSelectedIndex() > 0) {
					UpdateRestaurant = RestaurantList.get(ListPan.GetSelectedIndex());
					UpdateRestaurant.Read();
					PopulateFromSetModel();

				} else {
					FAlerts.Say("Restaurant Edit", "Select a Restaurant to Edit");
				}

			}
		});

		BTNModifyAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < Fcb_open.length; i++) {
					Fcb_open[i].setSelectedIndex(Fcb_open[0].getSelectedIndex());
				}
				for (int i = 1; i < Fcb_close.length; i++) {
					Fcb_close[i].setSelectedIndex(Fcb_close[0].getSelectedIndex());
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

					UpdateRestaurant.setAreas(DeliveryAreas.toString());

					strings = new ArrayList<>(DeliveryAreas.size());
					for (Object object : DeliveryAreas) {
						strings.add(Objects.toString(object, null));
					}

					UpdateRestaurant.setArealist(strings);
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

					UpdateRestaurant.setAreas(DeliveryAreas.toString());

					strings = new ArrayList<>(DeliveryAreas.size());
					for (Object object : DeliveryAreas) {
						strings.add(Objects.toString(object, null));
					}

					UpdateRestaurant.setArealist(strings);
				}

			}
		});

		BTNDeliverySave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (UpdateRestaurant == null) {
					FAlerts.Say("Edit Restaurant", "Please Select a Restaurant to Edit");
					return;
				}

				UpdateRestaurant.setHours("");
				boolean cbTimesError = true;

				for (int i = 0; i < Fcb_open.length; i++) {
					UpdateRestaurant.setHours(UpdateRestaurant.getHours() + Fcb_open[i].getSelectedItem() + " ");
				}
				for (int i = 0; i < Fcb_close.length; i++) {
					UpdateRestaurant.setHours(UpdateRestaurant.getHours() + Fcb_close[i].getSelectedItem() + " ");
					if (Fcb_open[i].getSelectedIndex() <= Fcb_close[i].getSelectedIndex()) {
						cbTimesError = false;
					}
				}

				if (!TFRestaurantName.IsValid() || !TFRestaurantAddress.IsValid() || !TFPhoneNum.IsValid()) {
					FAlerts.Error("Add Restaurant Error", "Missing Fields");
				} else if (cbTimesError) {
					FAlerts.Error("Restaurant Time Error", "Please select an appropriate Opening/Closing time");
				} else if (JTADeliveryArea.isEmpty()) {
					FAlerts.Error("Delivery Area Error", "Missing Delivery Area");
				} else {
					UpdateRestaurant.SyncAreas();

					if (FAlerts.Confirm("Confirm", " Restaurant Name: " + TFRestaurantName.getText()
							+ "\n Restaurant Address: " + TFRestaurantAddress.getText() + "\n Phone Number: "
							+ TFPhoneNum.GetContent() + "\n" + "\n Opening Hours" + "\n Sunday:   "
							+ Fcb_open[0].getSelectedItem() + " to " + Fcb_close[0].getSelectedItem() + "\n Monday:   "
							+ Fcb_open[1].getSelectedItem() + " to " + Fcb_close[1].getSelectedItem() + "\n Tuesday:  "
							+ Fcb_open[2].getSelectedItem() + " to " + Fcb_close[2].getSelectedItem() + "\n Wednesday: "
							+ Fcb_open[3].getSelectedItem() + " to " + Fcb_close[3].getSelectedItem() + "\n Thursday: "
							+ Fcb_open[4].getSelectedItem() + " to " + Fcb_close[4].getSelectedItem() + "\n Friday:   "
							+ Fcb_open[5].getSelectedItem() + " to " + Fcb_close[5].getSelectedItem() + "\n Saturday: "
							+ Fcb_open[6].getSelectedItem() + " to " + Fcb_close[6].getSelectedItem() + "\n"
							+ "\n Postal Code covered by this Restaurant: \n" + UpdateRestaurant.getAreas() + "\n"
							+ "\n Would you like to save this restaurant?")) {

						UpdateRestaurant.setName(TFRestaurantName.GetContent());
						UpdateRestaurant.setAddress(TFRestaurantAddress.GetContent());
						UpdateRestaurant.setNumber(TFPhoneNum.GetContent());
						UpdateRestaurant.setStatus(1);

						UpdateRestaurant.Update();

					}
				}
			}
		});

	}

	private void PopulateFromSetModel() {

		TFRestaurantName.setText(UpdateRestaurant.getName());
		TFRestaurantAddress.setText(UpdateRestaurant.getAddress());
		TFPhoneNum.setText(UpdateRestaurant.getNumber());
		DeliveryAreas = new ArrayList<Object>();

		if (UpdateRestaurant.getOpenings()[0] != null) {
			for (int i = 0; i < Fcb_open.length; i++) {
				// Setup Openings
				Fcb_open[i].setSelectedFromText(UpdateRestaurant.getOpenings()[i].toString());
			}

			for (int i = 0; i < Fcb_close.length; i++) {
				Fcb_close[i].setSelectedFromText(UpdateRestaurant.getClosings()[i].toString());
			}
		} else {
			for (FHoursComboBox cx : Fcb_open) {
				cx.setSelectedIndex(0);
			}
			for (FHoursComboBox cx : Fcb_close) {
				cx.setSelectedIndex(0);
			}
		}

		for (String s : UpdateRestaurant.getArealist()) {
			DeliveryAreas.add(s);
		}

		JTADeliveryArea.SetList(DeliveryAreas);

	}

}
