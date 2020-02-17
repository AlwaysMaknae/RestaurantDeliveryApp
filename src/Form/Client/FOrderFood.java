package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.cj.xdevapi.Client;
import Form.Login.FLogin;
import Model.ClientModel;
import Model.ItemModel;
import Model.RestaurantModel;
import database.DBClient;
import database.DBItem;
import database.DBOrder;
import database.DBRestaurant;
import database.Session;
import Model.OrderModel;
import Model.RestaurantModel;
import utils.FAlerts;
import utils.FTextField;
import utils.Navigator;


public class FOrderFood extends FOrderFoodPage {

	private FTextField address = new FTextField(20);
	private ArrayList<ItemModel> MenuList;
	private ArrayList<RestaurantModel> RestaurantList;
	private String order_items;
	private float sum;
	private ClientModel current_client;

	public FOrderFood() {
		BTNDelete.setEnabled(false);
		
		current_client = new ClientModel(Session.GetUser().getId());
		current_client.Read();
		
		ArrayList<Object> Order = new ArrayList<Object>();
		ArrayList<Object> Menu = new ArrayList<Object>();

		TFPostalCode.SetMask("L#L");
		TFQuantity.SetInteger();
		
		BTNArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu.clear();
				ListPan2.SetList(Menu);

				RestaurantList = DBRestaurant.getRestaurantByArea(TFPostalCode.getText());
				ArrayList<Object> Restaurant = new ArrayList<Object>();

		ArrayList<Object> Menu = new ArrayList<Object>();
		ArrayList<Object> Order = new ArrayList<Object>();

		ListPan.SetList(Restaurant);
		ListPan2.SetList(Menu);
		ListPan3.SetList(Order);

				for (int i = 0; i < RestaurantList.size(); i++) {
					Restaurant.add(RestaurantList.get(i).getName());
				}
				ListPan.SetList(Restaurant);

			}
		});

		BTNRestaurant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(ListPan.GetSelectedIndex() < 0) {
					FAlerts.Error("Ordering", "please select a restaurant");
					return;
				}
				
				MenuList = DBItem.getAllItems(RestaurantList.get(ListPan.GetSelectedIndex()).getId());

				for (int i = 0; i < MenuList.size(); i++) {
					Menu.add(MenuList.get(i).getItem_dish());
				}

				ListPan2.SetList(Menu);

			}
		});

		BTNMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				TFMeal.setText(MenuList.get(ListPan2.GetSelectedIndex()).getItem_dish() + "");
				TFPrice.setText(MenuList.get(ListPan2.GetSelectedIndex()).getItem_price() + "");


			}

		});


		BTNAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (TFQuantity.IsValid() && TFQuantity.GetContent().length() <=2) {
					order_items = "(" + Math.abs(Integer.parseInt(TFQuantity.GetContent())) + "x)" + TFMeal.getText() + ": " + String.valueOf(
							Float.parseFloat(TFPrice.getText()) * Math.abs(Integer.parseInt(TFQuantity.GetContent()))) + "$";
					
					TFQuantity.setText(""+Math.abs(Integer.parseInt(TFQuantity.GetContent())));
					
					Order.add(order_items);
					ListPan3.SetList(Order);
					sum += (Float.parseFloat(TFPrice.getText()) * Float.parseFloat(TFQuantity.GetContent()));
					TFTotal.setText(String.valueOf(sum));
					
				} else {
					TFQuantity.SetInvalid();
				}

				if (MenuList.isEmpty() == false) {
					BTNRestaurant.setEnabled(false);
					BTNArea.setEnabled(false);
					BTNDelete.setEnabled(true);
				}
			}
		});

		BTNOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LocalTime d_time = LocalTime.now().plusHours(CBDeliveryTime.getSelectedIndex());
				d_time = d_time.truncatedTo(ChronoUnit.HOURS);
				
				String o_adress = current_client.getClient_address();
				String o_date;
				if(d_time.isBefore(LocalTime.now())) {
					o_date = Session.GetDateFormated(true);
				} else {
					o_date = Session.GetDateFormated();
					
				}
				

				if(ListPan.GetSelectedIndex() > -1) {
					RestaurantModel cRest = new RestaurantModel(RestaurantList.get(ListPan.GetSelectedIndex()).getId());
					cRest.Read();
					
					if(!cRest.isOpenAt(d_time)) {
						FAlerts.Say("Ordering", "Sorry, " + cRest.getName() + " is closed at that time.");
					} else if(FAlerts.Confirm("Confirm Order", "Confirm order. : \n" + ListOut(Order) + "\n" + "Total : "+sum+"$")) {
						
						if(!FAlerts.Confirm("Delivery", "Deliver to your profile Address ?")){
							o_adress = FAlerts.Ask("Ordering", "Enter full adress of Delivery");
							if( o_adress ==  null ){ return; }
						}
						
						if(!FAlerts.Confirm("Confirm Delivery", "Delivery Information : \n" + 
								"Target Order Time : " + o_date + " " + d_time + "\n" +
								"Address : " + o_adress + "\n" +
								"Confirm this Delivery ?"
						)) {return;}
						
						
						FAlerts.Say("Payment", "The amount due is : " + sum + "$");
						
						DBOrder.AddOrder(new OrderModel(
								o_adress,
								TFPostalCode.getText(),
								o_date, 
								ListOut(Order),
								d_time.toString(),
								sum,
								OrderModel.NOT_READY, 
								RestaurantList.get(ListPan.GetSelectedIndex()).getId(), 
								current_client.getClient_id()
								));
						
						Navigator.Dashboard(Me);
					}
				}
			}
		});


		BTNDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (Order.isEmpty() == false) {
					String selected = Order.get(ListPan3.GetSelectedIndex()).toString();
					String x = Order.get(ListPan3.GetSelectedIndex()).toString().substring(selected.indexOf(": ") + 2,
							selected.indexOf("$"));
					float selected_price = Float.parseFloat(x);

					Order.remove(ListPan3.GetSelectedIndex());

					ListPan3.SetList(Order);
					sum -= (selected_price);
					TFTotal.setText(String.valueOf(new DecimalFormat("##.##").format(sum)));
				}
				if (ListPan3.isEmpty()) {
					BTNRestaurant.setEnabled(true);
					BTNArea.setEnabled(true);
					BTNDelete.setEnabled(false);
				}

			}
		});

		BTNCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				Navigator.Dashboard(Me);

			}

		});

	}
	
	private String ListOut(ArrayList<Object> order) {
		String oo = "";
		
		for (Object s : order) {
			oo += s + "\n";
		}
		return oo;
	}

	public static boolean isNumeric(final String str) {

		// null or empty
		if (str == null || str.length() == 0) {
			return false;
		}

		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}

		return true;

	}
}
