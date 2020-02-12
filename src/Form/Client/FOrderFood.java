package Form.Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.ItemModel;
import Model.RestaurantModel;
import database.DBItem;
import database.DBRestaurant;

public class FOrderFood extends FOrderFoodPage {
	private ArrayList<ItemModel> MenuList;
	private String order_items;
	private float sum;
	public FOrderFood() {
		

		ArrayList<RestaurantModel> RestaurantList = DBRestaurant.getAllRestaurants();
		
		// ArrayList<OrderModel> OrderList = new ArrayList<OrderModel>();


		ArrayList<Object> Restaurant = new ArrayList<Object>();
		
		for (int i = 0; i < RestaurantList.size(); i++) {
			Restaurant.add(RestaurantList.get(i).getName());
		}
		
		
		ArrayList<Object> Menu = new ArrayList<Object>();
		ArrayList<Object> Order = new ArrayList<Object>();

		ListPan.SetList(Restaurant);
		// ListPan3.SetList(Order);

		BTNRestaurant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BTNRestaurant.setEnabled(false);

				MenuList = DBItem.getAllItems(RestaurantList.get(ListPan.GetSelectedIndex()).getId());
				
				for (int i = 0; i < MenuList.size(); i++) {
					Menu.add(MenuList.get(i).getItem_dish());
				}

				ListPan2.SetList(Menu);

			}

		});
		
		BTNMenu.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				TFMeal.setText(MenuList.get(ListPan2.GetSelectedIndex()).getItem_dish() + "");
				TFPrice.setText(MenuList.get(ListPan2.GetSelectedIndex()).getItem_price() + "");
				
				
			}
			
		});

		BTNAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				order_items = "(" + TFQuantity.getText() + "x)" + TFMeal.getText() + " : " + String.valueOf(Float.parseFloat(TFPrice.getText()) * Float.parseFloat(TFQuantity.getText())) + "$" ;
				Order.add(order_items);
				ListPan3.SetList(Order);
				sum += (Float.parseFloat(TFPrice.getText()) * Float.parseFloat(TFQuantity.getText()));
				TFTotal.setText(String.valueOf(sum));
			}
		});

		BTNOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				;;;;;;;;; 

			}
		});

		BTNDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}
