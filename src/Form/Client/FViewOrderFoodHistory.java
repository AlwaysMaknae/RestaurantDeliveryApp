package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.OrderModel;

public class FViewOrderFoodHistory extends FViewOrderFoodHistoryPage{

	public FViewOrderFoodHistory() {
		// Empty Login Error Validation once actionlistener is implemented.

		/*
		 * if(TFUsername.getText().equals("") || TFPassword.getText().equals("")) {
		 * JOptionPane.showMessageDialog(this, "Username or Password is incorrect!",
		 * "Login Error", JOptionPane.ERROR_MESSAGE); }
		 */
		
		ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();
		
		ArrayList<Object> Order = new ArrayList<Object>();

		// Order.add(ENTER DETAILS HERE);

		ListPan.SetList(Order);
		
		
		BTNSelect.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				Select aN oRDER and press SELECT. This transfers the info into the correct textfields.
//				TODO: Make the Listpan, get selected item (& index if needed). 
//				When BTNSelect is clicked, get data of the selected order and place them into the correct Textfields.
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		

	}
}
