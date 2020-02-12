package Form.Deliverers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.DelivererModel;
import Model.RestaurantModel;
import utils.FAlerts;

public class FDeleteDeliverer extends FDeleteDelivererPage{

	private DelivererModel DeleteDeliveryMan;
	
	public FDeleteDeliverer() {
		
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
		
		BTNDeleteAll.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Delivery man is selected validation
				
//				if(DELIVERY MAN IS SELECTED) {
//					if(FAlerts.Confirm("Deletion Confirmation", "Would you like to fire: " + ListPan.GetSelectedItem().toString() + "?")) {
						
//						int ID = ListPan.GetSelectedIndex();				
//						DeleteDeliveryMan.Delete(ID);		
//						ListPan.remove(ID);
					
//						repaint();
//						revalidate();
//						FAlerts.Say("Deletion Complete", "Delivery Man successfully fired!");
						
//					}else {
//						FAlerts.Say("Deletion Cancelled", "Deletion has been successfully cancelled!");
//					}
					
//				}else {
//					FAlerts.Error("Selection Error", "Please select a Delivery Man to delete.");
//				}
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
	
}
