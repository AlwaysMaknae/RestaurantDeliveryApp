package Form.Manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import utils.FButton;
import utils.FForm;
import utils.FLabel;
import utils.FListView;
import utils.FTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FViewRestaurantOrderPage extends FForm {

	protected FButton BTNSelect, BTNSelect2;
	protected FTextField TFDeliveryTimeYMD, TFHour, TFPostalCode, TFMinute;
	
	protected JTextArea JTAMealOrder;
	
	protected FListView ListPan, ListPan2;

	public FViewRestaurantOrderPage() {
		
		setSize(984, 1040);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");

		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

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
		
		ListPan2 = new FListView();
		ListPan2.setPreferredSize(new Dimension(300, 850));
		RestaurantOrderListPan.add(ListPan2);
		
		JPanel RestaurantOrderListButtonPan = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) RestaurantOrderListButtonPan.getLayout();
		flowLayout_2.setVgap(0);
		RestaurantOrderListButtonPan.setPreferredSize(new Dimension(300, 85));
		RestaurantOrderListPan.add(RestaurantOrderListButtonPan);
		
		BTNSelect2 = new FButton("Select");
		BTNSelect2.setFont(BTNSelect2.getFont().deriveFont(BTNSelect2.getFont().getStyle() & ~Font.BOLD, BTNSelect2.getFont().getSize() + 36f));
		BTNSelect2.setPreferredSize(new Dimension(300, 85));
		RestaurantOrderListButtonPan.add(BTNSelect2);

		JPanel InnerPan = new JPanel();
		InnerPan.setBackground(Color.LIGHT_GRAY);
		InnerPan.setPreferredSize(new Dimension(625, 975));
		MainPan.add(InnerPan);

		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.LIGHT_GRAY);
		FlowLayout fl_TitlePan = (FlowLayout) TitlePan.getLayout();
		fl_TitlePan.setVgap(10);
		TitlePan.setPreferredSize(new Dimension(600, 55));
		InnerPan.add(TitlePan);

		FLabel ViewOrderLbl = new FLabel("Accepting Order");
		ViewOrderLbl.setFont(ViewOrderLbl.getFont().deriveFont(ViewOrderLbl.getFont().getSize() + 20f));
		ViewOrderLbl.setText("View Order");
		TitlePan.add(ViewOrderLbl);

		JPanel ViewOrderInfoPan1 = new JPanel();
		ViewOrderInfoPan1.setBackground(Color.LIGHT_GRAY);
		FlowLayout fl_ViewOrderInfoPan1 = (FlowLayout) ViewOrderInfoPan1.getLayout();
		fl_ViewOrderInfoPan1.setAlignment(FlowLayout.LEFT);
		ViewOrderInfoPan1.setPreferredSize(new Dimension(600, 110));
		InnerPan.add(ViewOrderInfoPan1);

		FLabel DeliveryTimeYMDLbl = new FLabel("Delivery Time (yyyy/mm/dd) : ");
		DeliveryTimeYMDLbl.setPreferredSize(new Dimension(150, 15));
		DeliveryTimeYMDLbl.setText("Delivery Time: ");
		ViewOrderInfoPan1.add(DeliveryTimeYMDLbl);

		TFDeliveryTimeYMD = new FTextField(0);
		TFDeliveryTimeYMD.setEnabled(false);
		TFDeliveryTimeYMD.setPreferredSize(new Dimension(300, 20));
		ViewOrderInfoPan1.add(TFDeliveryTimeYMD);

		FLabel DeliveryTimeLbl = new FLabel("Delivery Time : ");
		DeliveryTimeLbl.setPreferredSize(new Dimension(150, 14));
		ViewOrderInfoPan1.add(DeliveryTimeLbl);

		TFHour = new FTextField(0);
		TFHour.setEnabled(false);
		TFHour.setPreferredSize(new Dimension(300, 20));
		ViewOrderInfoPan1.add(TFHour);

		FLabel PostalCodeLbl = new FLabel("Postal Code : ");
		PostalCodeLbl.setPreferredSize(new Dimension(150, 14));
		ViewOrderInfoPan1.add(PostalCodeLbl);

		TFPostalCode = new FTextField(0);
		TFPostalCode.setEnabled(false);
		TFPostalCode.setPreferredSize(new Dimension(300, 20));
		ViewOrderInfoPan1.add(TFPostalCode);

		JPanel ViewOrderInfoPan2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) ViewOrderInfoPan2.getLayout();
		ViewOrderInfoPan2.setPreferredSize(new Dimension(600, 350));
		ViewOrderInfoPan2.setBackground(Color.LIGHT_GRAY);
		InnerPan.add(ViewOrderInfoPan2);

		FLabel MealOrderLbl = new FLabel("Meal in Order");
		MealOrderLbl.setHorizontalAlignment(SwingConstants.CENTER);
		MealOrderLbl.setFont(MealOrderLbl.getFont().deriveFont(MealOrderLbl.getFont().getSize() + 20f));
		MealOrderLbl.setPreferredSize(new Dimension(600, 35));
		ViewOrderInfoPan2.add(MealOrderLbl);

		JTAMealOrder = new JTextArea();
		JTAMealOrder.setPreferredSize(new Dimension(500, 300));
		JTAMealOrder.setBorder(new LineBorder(new Color(128, 128, 128)));
		JTAMealOrder.setEnabled(false);
		ViewOrderInfoPan2.add(JTAMealOrder);

		repaint();
		revalidate();

	}

}
