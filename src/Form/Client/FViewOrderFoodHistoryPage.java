package Form.Client;

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

public class FViewOrderFoodHistoryPage extends FForm{

	protected FButton BTNSelect;
	protected FTextField TFDeliveryTime, TFAddress, TFStatus;
	
	protected FListView ListPan, JTAMealOrder;
	
	public FViewOrderFoodHistoryPage() {
		
		setSize(984, 1040);
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

		FLabel YourOrderListTitleLbl = new FLabel("Order Accepted");
		YourOrderListTitleLbl.setText("Your Orders");
		ListTitlePan.add(YourOrderListTitleLbl);

		ListPan = new FListView();
		ListPan.setPreferredSize(new Dimension(300, 850));
		RestaurantListPan.add(ListPan);

		JPanel RestaurantListButtonPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) RestaurantListButtonPan.getLayout();
		flowLayout.setVgap(0);
		RestaurantListButtonPan.setPreferredSize(new Dimension(300, 85));
		RestaurantListPan.add(RestaurantListButtonPan);

		BTNSelect = new FButton("Select");
		BTNSelect.setFont(BTNSelect.getFont().deriveFont(BTNSelect.getFont().getStyle() & ~Font.BOLD, BTNSelect.getFont().getSize() + 36f));
		BTNSelect.setPreferredSize(new Dimension(300, 85));
		//BTNSelect.SetType("Good");
		RestaurantListButtonPan.add(BTNSelect);

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
		
		FLabel ViewOrderLbl = new FLabel("Order Ready");
		ViewOrderLbl.setFont(ViewOrderLbl.getFont().deriveFont(ViewOrderLbl.getFont().getSize() + 20f));
		ViewOrderLbl.setText("View Order");
		TitlePan.add(ViewOrderLbl);
		
		JPanel ViewOrderInfoPan1 = new JPanel();
		ViewOrderInfoPan1.setBackground(Color.LIGHT_GRAY);
		FlowLayout fl_ViewOrderInfoPan1 = (FlowLayout) ViewOrderInfoPan1.getLayout();
		fl_ViewOrderInfoPan1.setAlignment(FlowLayout.LEFT);
		ViewOrderInfoPan1.setPreferredSize(new Dimension(600, 110));
		InnerPan.add(ViewOrderInfoPan1);
		
		FLabel DeliveryTimeYMDLbl = new FLabel("Delivery Time : ");
		DeliveryTimeYMDLbl.setPreferredSize( new Dimension(120,14));
		ViewOrderInfoPan1.add(DeliveryTimeYMDLbl);
		
		TFDeliveryTime = new FTextField(0);
		TFDeliveryTime.setEnabled(false);
		TFDeliveryTime.setPreferredSize(new Dimension(400, 20));
		ViewOrderInfoPan1.add(TFDeliveryTime);
		
		FLabel DeliveryTimeLbl = new FLabel("Delivery Address : ");
		DeliveryTimeLbl.setPreferredSize( new Dimension(120,14));
		ViewOrderInfoPan1.add(DeliveryTimeLbl);
		
		
		TFAddress = new FTextField(0);
		TFAddress.setEnabled(false);
		TFAddress.setPreferredSize(new Dimension(400, 20));
		ViewOrderInfoPan1.add(TFAddress);
		
		FLabel DeliveryStatusLbl = new FLabel("Delivery Status : ");
		DeliveryStatusLbl.setPreferredSize( new Dimension(120,14));
		ViewOrderInfoPan1.add(DeliveryStatusLbl);
		
		
		TFStatus = new FTextField(0);
		TFStatus.setEnabled(false);
		TFStatus.setPreferredSize(new Dimension(400, 20));
		ViewOrderInfoPan1.add(TFStatus);
		
		
		JPanel ViewOrderInfoPan2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) ViewOrderInfoPan2.getLayout();
		ViewOrderInfoPan2.setPreferredSize(new Dimension(600, 350));
		ViewOrderInfoPan2.setBackground(Color.LIGHT_GRAY);
		InnerPan.add(ViewOrderInfoPan2);
		
		FLabel MealOrderLbl = new FLabel("Meal in Order");
		MealOrderLbl.setHorizontalAlignment(SwingConstants.CENTER);
		MealOrderLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		MealOrderLbl.setFont(MealOrderLbl.getFont().deriveFont(MealOrderLbl.getFont().getSize() + 20f));
		MealOrderLbl.setPreferredSize(new Dimension(600, 30));
		ViewOrderInfoPan2.add(MealOrderLbl);
		
		JTAMealOrder = new FListView();
		JTAMealOrder.setBorder(new LineBorder(Color.GRAY));
		JTAMealOrder.setEnabled(false);
		JTAMealOrder.setPreferredSize(new Dimension(600, 285));
		ViewOrderInfoPan2.add(JTAMealOrder);

		repaint();
		revalidate();
		
	}
}
