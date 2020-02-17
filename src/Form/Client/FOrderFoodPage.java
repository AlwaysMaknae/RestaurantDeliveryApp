package Form.Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.time.LocalTime;
import java.time.ZoneId;

import javax.swing.JPanel;

import utils.FButton;
import utils.FForm;
import utils.FHoursComboBox;
import utils.FLabel;
import utils.FListView;
import utils.FTextField;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class FOrderFoodPage extends FForm {
	
	protected FTextField TFPostalCode, TFMeal, TFPrice, TFQuantity, TFTotal;
	
	protected FHoursComboBox CBDeliveryTime;
	
	protected FButton BTNAdd, BTNDelete, BTNOrder, BTNRestaurant, BTNMenu, BTNCancel, BTNArea;

	protected FListView ListPan, ListPan2, ListPan3;
	
	public FOrderFoodPage() {

		setSize(900, 720);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");

		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel OrderFoodInfoPan = new JPanel();
		OrderFoodInfoPan.setPreferredSize(new Dimension(280, 155));
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
		DeliveryInfoPan.setPreferredSize(new Dimension(400, 110));
		DeliveryInfoPan.setBackground(Color.LIGHT_GRAY);
		OrderFoodInfoPan.add(DeliveryInfoPan);
		
		FLabel DeliveryTimeYMDLbl = new FLabel("Delivery Time : ");
		DeliveryInfoPan.add(DeliveryTimeYMDLbl);
		
		CBDeliveryTime = new FHoursComboBox( LocalTime.now(ZoneId.of("America/New_York")).getHour() );
		DeliveryInfoPan.add(CBDeliveryTime);
		
		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(250, 1));
		DeliveryInfoPan.add(SpacePan0);
		
		FLabel DeliveryTimeLbl = new FLabel("Delivery Time : ");
		DeliveryTimeLbl.setPreferredSize(new Dimension(165, 14));
		DeliveryInfoPan.add(DeliveryTimeLbl);
		
		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(400, 1));
		DeliveryInfoPan.add(SpacePan1);
		
		FLabel PostalCodeLbl = new FLabel("Postal Code : ");
		PostalCodeLbl.setPreferredSize(new Dimension(80, 14));
		DeliveryInfoPan.add(PostalCodeLbl);
		
		TFPostalCode = new FTextField(0);
		TFPostalCode.setPreferredSize(new Dimension(75, 20));
		DeliveryInfoPan.add(TFPostalCode);
		
		BTNArea = new FButton("Set Area");
		DeliveryInfoPan.add(BTNArea);
		
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
		
		ListPan = new FListView();
		ListPan.setPreferredSize(new Dimension(200, 350));
		RestaurantListPan.add(ListPan);
		
		BTNRestaurant = new FButton("SELECT");
		ListPan.add(BTNRestaurant, BorderLayout.SOUTH);
		
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
		
		ListPan2 = new FListView();
		ListPan2.setPreferredSize(new Dimension(200, 350));
		MenuListPan.add(ListPan2);
		
		BTNMenu = new FButton("SELECT");
		ListPan2.add(BTNMenu, BorderLayout.SOUTH);
		
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
		
		TFMeal = new FTextField(0);
		TFMeal.setEnabled(false);
		TFMeal.setPreferredSize(new Dimension(75, 20));
		OrderInfoPan.add(TFMeal);
		
		FLabel PriceLbl = new FLabel("Price: ");
		PriceLbl.setPreferredSize(new Dimension(75, 14));
		OrderInfoPan.add(PriceLbl);
		
		TFPrice = new FTextField(0);
		TFPrice.setEnabled(false);
		TFPrice.setPreferredSize(new Dimension(75, 20));
		OrderInfoPan.add(TFPrice);
		
		FLabel QuantityLbl = new FLabel("Quantity: ");
		QuantityLbl.setPreferredSize(new Dimension(75, 14));
		OrderInfoPan.add(QuantityLbl);
		
		TFQuantity = new FTextField(0);
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
		
		BTNAdd = new FButton("Add");
		BTNAdd.setPreferredSize(new Dimension(125, 25));
		OrderInfoPan.add(BTNAdd);
	
		BTNDelete = new FButton("Delete");
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
		
		ListPan3 = new FListView();
		ListPan3.setPreferredSize(new Dimension(200, 350));
		OrderListPan.add(ListPan3);
		
		JPanel PaymentPan = new JPanel();
		PaymentPan.setBackground(Color.LIGHT_GRAY);
		PaymentPan.setPreferredSize(new Dimension(790, 75));
		MainPan.add(PaymentPan);
		
		FLabel TotalLbl = new FLabel("Total (no taxes): ");
		PaymentPan.add(TotalLbl);
		
		TFTotal = new FTextField(0);
		TFTotal.setEnabled(false);
		PaymentPan.add(TFTotal);
		TFTotal.setColumns(10);
		
		FLabel DollarSignLbl = new FLabel("$");
		PaymentPan.add(DollarSignLbl);
		
		JPanel PaymentSpacePan = new JPanel();
		PaymentSpacePan.setBackground(Color.LIGHT_GRAY);
		PaymentSpacePan.setPreferredSize(new Dimension(790, 1));
		PaymentPan.add(PaymentSpacePan);
		
		BTNOrder = new FButton("Order");
		BTNOrder.setPreferredSize(new Dimension(100, 30));
		PaymentPan.add(BTNOrder);
		
		BTNCancel = new FButton("Cancel");
		BTNOrder.setPreferredSize(new Dimension(100, 30));
		PaymentPan.add(BTNCancel);
		
		repaint();
		revalidate();
	}
}
