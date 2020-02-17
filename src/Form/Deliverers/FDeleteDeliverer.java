package Form.Deliverers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.DelivererModel;
import Model.RestaurantModel;
import database.DBDeliverer;
import utils.FAlerts;
import utils.Navigator;

public class FDeleteDeliverer extends FDeleteDelivererPage{
	private ArrayList<Object> DeliveryAreas = null;
	private DelivererModel DeleteDeliveryMan;
	private ArrayList<DelivererModel> DelivererList;
	
	public FDeleteDeliverer() {
		
		DeleteDeliveryMan = null;

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
				DeleteDeliveryMan = DelivererList.get(ListPan.GetSelectedIndex());
				DeleteDeliveryMan.Read();

				TFName.setText(DeleteDeliveryMan.getName());

				String phone = DeleteDeliveryMan.getNumber();
				TFPhoneNum_1.setText(phone.substring(0, 3));
				TFPhoneNum_2.setText(phone.substring(4, 7));
				TFPhoneNum_3.setText(phone.substring(8, 12));

				DeliveryAreas = new ArrayList<Object>();
				for (String s : DeleteDeliveryMan.getArealist()) {
					DeliveryAreas.add(s);
				}

				JTADeliveryArea.SetList(DeliveryAreas);
			}
		});

		
		BTNDeleteAll.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(FAlerts.Confirm("Account Deletion Confirmation", "Are you sure you want to delete this Account?")==true) {
					
					DeleteDeliveryMan.Delete();
					FAlerts.Say("Account Deletion Complete", "Account has been deleted successfully!");

					Navigator.Disconnect(Me);
					
				}
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
