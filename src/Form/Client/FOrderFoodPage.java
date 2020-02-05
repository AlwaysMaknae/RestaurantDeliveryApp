package Form.Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import utils.FForm;
import utils.FLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FOrderFoodPage extends FForm {
	
	protected JTextField TFDeliveryTimeYMD, TFHour, TFMinute, TFPostalCode, TFMeal, TFPrice, TFQuantity, TFTotal;
	
	protected JButton BTNAdd, BTNDelete, BTNOrder;


	public FOrderFoodPage() {

		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");

		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel OrderFoodInfoPan = new JPanel();
		OrderFoodInfoPan.setPreferredSize(new Dimension(260, 135));
		OrderFoodInfoPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(OrderFoodInfoPan);
		
		JPanel OrderFoodTitlePan = new JPanel();
		OrderFoodTitlePan.setPreferredSize(new Dimension(250, 35));
		OrderFoodTitlePan.setBackground(Color.LIGHT_GRAY);
		OrderFoodInfoPan.add(OrderFoodTitlePan);
		
		FLabel OrderFoodLbl = new FLabel("Accepting Order");
		OrderFoodLbl.setText("Order Food");
		OrderFoodTitlePan.add(OrderFoodLbl);
		
		JPanel DeliveryInfoPan = new JPanel();
		DeliveryInfoPan.setPreferredSize(new Dimension(260, 90));
		DeliveryInfoPan.setBackground(Color.LIGHT_GRAY);
		OrderFoodInfoPan.add(DeliveryInfoPan);
		
		FLabel DeliveryTimeYMDLbl = new FLabel("Delivery Time (yyyy/mm/dd) : ");
		DeliveryInfoPan.add(DeliveryTimeYMDLbl);
		
		TFDeliveryTimeYMD = new JTextField();
		TFDeliveryTimeYMD.setPreferredSize(new Dimension(75, 20));
		DeliveryInfoPan.add(TFDeliveryTimeYMD);
		
		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(250, 1));
		DeliveryInfoPan.add(SpacePan0);
		
		FLabel DeliveryTimeLbl = new FLabel("Delivery Time : ");
		DeliveryTimeLbl.setPreferredSize(new Dimension(165, 14));
		DeliveryInfoPan.add(DeliveryTimeLbl);
		
		TFHour = new JTextField();
		TFHour.setPreferredSize(new Dimension(20, 20));
		DeliveryInfoPan.add(TFHour);
		
		FLabel HourLbl = new FLabel("H");
		DeliveryInfoPan.add(HourLbl);
		
		TFMinute = new JTextField();
		TFMinute.setPreferredSize(new Dimension(20, 20));
		DeliveryInfoPan.add(TFMinute);
		
		FLabel MinuteLbl = new FLabel("M");
		DeliveryInfoPan.add(MinuteLbl);
		
		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(250, 1));
		DeliveryInfoPan.add(SpacePan1);
		
		FLabel PostalCodeLbl = new FLabel("Postal Code : ");
		PostalCodeLbl.setPreferredSize(new Dimension(160, 14));
		DeliveryInfoPan.add(PostalCodeLbl);
		
		TFPostalCode = new JTextField();
		TFPostalCode.setPreferredSize(new Dimension(75, 20));
		DeliveryInfoPan.add(TFPostalCode);
		
		JPanel MainSpacePan0 = new JPanel();
		MainSpacePan0.setBackground(Color.LIGHT_GRAY);
		MainSpacePan0.setPreferredSize(new Dimension(975, 10));
		MainPan.add(MainSpacePan0);
		
		JPanel RestaurantListPan = new JPanel();
		RestaurantListPan.setPreferredSize(new Dimension(200, 380));
		RestaurantListPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(RestaurantListPan);
		
		JPanel RestaurantListTitlePan = new JPanel();
		RestaurantListTitlePan.setPreferredSize(new Dimension(250, 20));
		RestaurantListTitlePan.setBackground(Color.LIGHT_GRAY);
		RestaurantListPan.add(RestaurantListTitlePan);
		
		FLabel RestaurantTitleLbl = new FLabel("Order");
		RestaurantTitleLbl.setText("Restaurant");
		RestaurantListTitlePan.add(RestaurantTitleLbl);
		
		JPanel ListPan = new JPanel();
		ListPan.setPreferredSize(new Dimension(250, 350));
		ListPan.setBackground(Color.RED);
		RestaurantListPan.add(ListPan);
		
		JPanel MenuListPan = new JPanel();
		MenuListPan.setPreferredSize(new Dimension(200, 380));
		MenuListPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(MenuListPan);
		
		JPanel MenuListTitlePan = new JPanel();
		MenuListTitlePan.setPreferredSize(new Dimension(200, 20));
		MenuListTitlePan.setBackground(Color.LIGHT_GRAY);
		MenuListPan.add(MenuListTitlePan);
		
		FLabel MenuListTitleLbl = new FLabel("Order");
		MenuListTitleLbl.setText("Menu");
		MenuListTitlePan.add(MenuListTitleLbl);
		
		JPanel ListPan2 = new JPanel();
		ListPan2.setPreferredSize(new Dimension(200, 350));
		ListPan2.setBackground(Color.RED);
		MenuListPan.add(ListPan2);
		
		JPanel OrderInfoPan = new JPanel();
		OrderInfoPan.setPreferredSize(new Dimension(175, 380));
		OrderInfoPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(OrderInfoPan);
		
		JPanel OderInfoSpacePan = new JPanel();
		OderInfoSpacePan.setBackground(Color.LIGHT_GRAY);
		OderInfoSpacePan.setPreferredSize(new Dimension(175, 100));
		OrderInfoPan.add(OderInfoSpacePan);
		
		FLabel MealLbl = new FLabel("Meal: ");
		MealLbl.setPreferredSize(new Dimension(75, 14));
		OrderInfoPan.add(MealLbl);
		
		TFMeal = new JTextField();
		TFMeal.setEnabled(false);
		TFMeal.setPreferredSize(new Dimension(75, 20));
		OrderInfoPan.add(TFMeal);
		
		FLabel PriceLbl = new FLabel("Price: ");
		PriceLbl.setPreferredSize(new Dimension(75, 14));
		OrderInfoPan.add(PriceLbl);
		
		TFPrice = new JTextField();
		TFPrice.setEnabled(false);
		TFPrice.setPreferredSize(new Dimension(75, 20));
		OrderInfoPan.add(TFPrice);
		
		FLabel QuantityLbl = new FLabel("Quantity: ");
		QuantityLbl.setPreferredSize(new Dimension(75, 14));
		OrderInfoPan.add(QuantityLbl);
		
		TFQuantity = new JTextField();
		TFQuantity.setPreferredSize(new Dimension(75, 20));
		OrderInfoPan.add(TFQuantity);
		
		FLabel LimitLbl = new FLabel("(Max 10)");
		LimitLbl.setPreferredSize(new Dimension(75, 14));
		OrderInfoPan.add(LimitLbl);
		
		JPanel OrderInfoSpacePan2 = new JPanel();
		OrderInfoSpacePan2.setBackground(Color.LIGHT_GRAY);
		OrderInfoSpacePan2.setPreferredSize(new Dimension(75, 1));
		OrderInfoPan.add(OrderInfoSpacePan2);
		
		JPanel OrderInfoSpacePan3 = new JPanel();
		OrderInfoSpacePan3.setBackground(Color.LIGHT_GRAY);
		OrderInfoSpacePan3.setPreferredSize(new Dimension(175, 115));
		OrderInfoPan.add(OrderInfoSpacePan3);
		
		BTNAdd = new JButton("Add");
		BTNAdd.setPreferredSize(new Dimension(125, 25));
		OrderInfoPan.add(BTNAdd);
	
		BTNDelete = new JButton("Delete");
		BTNDelete.setPreferredSize(new Dimension(125, 25));
		OrderInfoPan.add(BTNDelete);
		
		JPanel OrderListPan = new JPanel();
		MainPan.add(OrderListPan);
		OrderListPan.setPreferredSize(new Dimension(200, 380));
		OrderListPan.setBackground(Color.LIGHT_GRAY);
		
		JPanel OrderListTitlePan = new JPanel();
		OrderListTitlePan.setPreferredSize(new Dimension(200, 20));
		OrderListTitlePan.setBackground(Color.LIGHT_GRAY);
		OrderListPan.add(OrderListTitlePan);
		
		FLabel OrderListTitleLbl = new FLabel("Order");
		OrderListTitlePan.add(OrderListTitleLbl);
		
		JPanel ListPan3 = new JPanel();
		ListPan3.setPreferredSize(new Dimension(200, 350));
		ListPan3.setBackground(Color.RED);
		OrderListPan.add(ListPan3);
		
		JPanel PaymentPan = new JPanel();
		PaymentPan.setBackground(Color.LIGHT_GRAY);
		PaymentPan.setPreferredSize(new Dimension(790, 75));
		MainPan.add(PaymentPan);
		
		FLabel TotalLbl = new FLabel("Total (no taxes): ");
		PaymentPan.add(TotalLbl);
		
		TFTotal = new JTextField();
		TFTotal.setEnabled(false);
		PaymentPan.add(TFTotal);
		TFTotal.setColumns(10);
		
		FLabel DollarSignLbl = new FLabel("$");
		PaymentPan.add(DollarSignLbl);
		
		JPanel PaymentSpacePan = new JPanel();
		PaymentSpacePan.setBackground(Color.LIGHT_GRAY);
		PaymentSpacePan.setPreferredSize(new Dimension(790, 1));
		PaymentPan.add(PaymentSpacePan);
		
		BTNOrder = new JButton("Order");
		BTNOrder.setPreferredSize(new Dimension(75, 25));
		PaymentPan.add(BTNOrder);
		
		repaint();
		revalidate();
	}
}
