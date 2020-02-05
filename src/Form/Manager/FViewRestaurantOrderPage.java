package Form.Manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import utils.FForm;
import utils.FLabel;

public class FViewRestaurantOrderPage extends FForm {

	protected JButton BTNSelect, BTNSelect2;
	protected JTextField TFDeliveryTimeYMD, TFHour, TFPostalCode, TFMinute;

	public FViewRestaurantOrderPage() {
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");

		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel RestaurantListPan = new JPanel();
		RestaurantListPan.setBackground(Color.LIGHT_GRAY);
		RestaurantListPan.setPreferredSize(new Dimension(300, 975));
		MainPan.add(RestaurantListPan);

		JPanel ListTitlePan = new JPanel();
		ListTitlePan.setPreferredSize(new Dimension(300, 20));
		ListTitlePan.setBackground(Color.LIGHT_GRAY);
		RestaurantListPan.add(ListTitlePan);

		FLabel ListRestaurantTitleLbl = new FLabel("Order");
		ListRestaurantTitleLbl.setText("Restaurant");
		ListTitlePan.add(ListRestaurantTitleLbl);

		JPanel ListPan = new JPanel();
		ListPan.setBackground(Color.RED);
		ListPan.setPreferredSize(new Dimension(300, 905));
		RestaurantListPan.add(ListPan);

		JPanel RestaurantListButtonPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) RestaurantListButtonPan.getLayout();
		flowLayout.setVgap(0);
		RestaurantListButtonPan.setPreferredSize(new Dimension(300, 26));
		RestaurantListPan.add(RestaurantListButtonPan);

		BTNSelect = new JButton("Select");
		BTNSelect.setPreferredSize(new Dimension(300, 26));
		RestaurantListButtonPan.add(BTNSelect);

		JPanel RestaurantOrderListPan = new JPanel();
		RestaurantOrderListPan.setBackground(Color.LIGHT_GRAY);
		RestaurantOrderListPan.setPreferredSize(new Dimension(320, 975));
		MainPan.add(RestaurantOrderListPan);
		
		JPanel ListTitlePan2 = new JPanel();
		ListTitlePan2.setPreferredSize(new Dimension(300, 20));
		ListTitlePan2.setBackground(Color.LIGHT_GRAY);
		RestaurantOrderListPan.add(ListTitlePan2);
		
		FLabel ListRestaurantOrderTitleLbl = new FLabel("Order");
		ListRestaurantOrderTitleLbl.setText("Restaurant's Order");
		ListTitlePan2.add(ListRestaurantOrderTitleLbl);
		
		JPanel ListPan2 = new JPanel();
		ListPan2.setPreferredSize(new Dimension(300, 905));
		ListPan2.setBackground(Color.RED);
		RestaurantOrderListPan.add(ListPan2);
		
		JPanel RestaurantOrderListButtonPan = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) RestaurantOrderListButtonPan.getLayout();
		flowLayout_2.setVgap(0);
		RestaurantOrderListButtonPan.setPreferredSize(new Dimension(300, 26));
		RestaurantOrderListPan.add(RestaurantOrderListButtonPan);
		
		BTNSelect2 = new JButton("Select");
		BTNSelect2.setPreferredSize(new Dimension(300, 26));
		RestaurantOrderListButtonPan.add(BTNSelect2);

		JPanel InnerPan = new JPanel();
		InnerPan.setBackground(Color.LIGHT_GRAY);
		InnerPan.setPreferredSize(new Dimension(325, 975));
		MainPan.add(InnerPan);
		
		JPanel InnerSpacePan = new JPanel();
		InnerSpacePan.setBackground(Color.LIGHT_GRAY);
		InnerSpacePan.setPreferredSize(new Dimension(300, 250));
		InnerPan.add(InnerSpacePan);

		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.LIGHT_GRAY);
		FlowLayout fl_TitlePan = (FlowLayout) TitlePan.getLayout();
		fl_TitlePan.setVgap(10);
		TitlePan.setPreferredSize(new Dimension(250, 35));
		InnerPan.add(TitlePan);

		FLabel ViewOrderLbl = new FLabel("Accepting Order");
		ViewOrderLbl.setText("View Order");
		TitlePan.add(ViewOrderLbl);

		JPanel ViewOrderInfoPan1 = new JPanel();
		ViewOrderInfoPan1.setBackground(Color.LIGHT_GRAY);
		FlowLayout fl_ViewOrderInfoPan1 = (FlowLayout) ViewOrderInfoPan1.getLayout();
		fl_ViewOrderInfoPan1.setAlignment(FlowLayout.LEFT);
		ViewOrderInfoPan1.setPreferredSize(new Dimension(250, 110));
		InnerPan.add(ViewOrderInfoPan1);

		FLabel DeliveryTimeYMDLbl = new FLabel("Delivery Time (yyyy/mm/dd) : ");
		ViewOrderInfoPan1.add(DeliveryTimeYMDLbl);

		TFDeliveryTimeYMD = new JTextField();
		TFDeliveryTimeYMD.setEnabled(false);
		TFDeliveryTimeYMD.setPreferredSize(new Dimension(75, 20));
		ViewOrderInfoPan1.add(TFDeliveryTimeYMD);

		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(250, 1));
		ViewOrderInfoPan1.add(SpacePan0);

		FLabel DeliveryTimeLbl = new FLabel("Delivery Time : ");
		DeliveryTimeLbl.setPreferredSize(new Dimension(165, 14));
		ViewOrderInfoPan1.add(DeliveryTimeLbl);

		TFHour = new JTextField();
		TFHour.setEnabled(false);
		TFHour.setPreferredSize(new Dimension(20, 20));
		ViewOrderInfoPan1.add(TFHour);

		FLabel HourLbl = new FLabel("H");
		ViewOrderInfoPan1.add(HourLbl);

		TFMinute = new JTextField();
		TFMinute.setEnabled(false);
		TFMinute.setPreferredSize(new Dimension(20, 20));
		ViewOrderInfoPan1.add(TFMinute);

		FLabel MinuteLbl = new FLabel("M");
		ViewOrderInfoPan1.add(MinuteLbl);

		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(250, 1));
		ViewOrderInfoPan1.add(SpacePan1);

		FLabel PostalCodeLbl = new FLabel("Postal Code : ");
		PostalCodeLbl.setPreferredSize(new Dimension(160, 14));
		ViewOrderInfoPan1.add(PostalCodeLbl);

		TFPostalCode = new JTextField();
		TFPostalCode.setEnabled(false);
		TFPostalCode.setPreferredSize(new Dimension(75, 20));
		ViewOrderInfoPan1.add(TFPostalCode);

		JPanel ViewOrderInfoPan2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) ViewOrderInfoPan2.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		ViewOrderInfoPan2.setPreferredSize(new Dimension(250, 350));
		ViewOrderInfoPan2.setBackground(Color.LIGHT_GRAY);
		InnerPan.add(ViewOrderInfoPan2);

		FLabel MealOrderLbl = new FLabel("Meal in Order");
		MealOrderLbl.setPreferredSize(new Dimension(240, 14));
		ViewOrderInfoPan2.add(MealOrderLbl);

		JTextArea JTAMealOrder = new JTextArea();
		JTAMealOrder.setBorder(new LineBorder(Color.GRAY));
		JTAMealOrder.setLineWrap(true);
		JTAMealOrder.setEnabled(false);
		JTAMealOrder.setPreferredSize(new Dimension(240, 285));
		ViewOrderInfoPan2.add(JTAMealOrder);

		repaint();
		revalidate();

	}

}
