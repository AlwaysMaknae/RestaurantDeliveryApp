package Form.Restauranteur;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
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

public class FOrderReadyPage extends FForm{

	protected FButton BTNSelect, BTNOrderReady;
	protected FTextField TFDeliveryDate, TFTime, TFPostalCode;
	
	protected FListView ListPan;
	protected JTextArea JTAMealOrder;

	public FOrderReadyPage() {

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

		FLabel ListOrderTitleLbl = new FLabel("Order Accepted");
		ListTitlePan.add(ListOrderTitleLbl);

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
		
		FLabel OrderReadyLbl = new FLabel("Order Ready");
		OrderReadyLbl.setFont(OrderReadyLbl.getFont().deriveFont(OrderReadyLbl.getFont().getSize() + 20f));
		TitlePan.add(OrderReadyLbl);
		
		JPanel ViewOrderInfoPan1 = new JPanel();
		ViewOrderInfoPan1.setBackground(Color.LIGHT_GRAY);
		FlowLayout fl_ViewOrderInfoPan1 = (FlowLayout) ViewOrderInfoPan1.getLayout();
		ViewOrderInfoPan1.setPreferredSize(new Dimension(600, 110));
		InnerPan.add(ViewOrderInfoPan1);
		
		FLabel DeliveryTimeYMDLbl = new FLabel("Delivery Date : ");
		DeliveryTimeYMDLbl.setPreferredSize(new Dimension(160, 14));
		ViewOrderInfoPan1.add(DeliveryTimeYMDLbl);
		
		TFDeliveryDate = new FTextField(0);
		TFDeliveryDate.setEnabled(false);
		TFDeliveryDate.setPreferredSize(new Dimension(300, 20));
		ViewOrderInfoPan1.add(TFDeliveryDate);
		
		FLabel DeliveryTimeLbl = new FLabel("Delivery Time : ");
		DeliveryTimeLbl.setPreferredSize(new Dimension(160, 14));
		ViewOrderInfoPan1.add(DeliveryTimeLbl);
		
		TFTime = new FTextField(0);
		TFTime.setEnabled(false);
		TFTime.setPreferredSize(new Dimension(300, 20));
		ViewOrderInfoPan1.add(TFTime);
		
		FLabel PostalCodeLbl = new FLabel("Postal Code : ");
		PostalCodeLbl.setPreferredSize(new Dimension(160, 14));
		ViewOrderInfoPan1.add(PostalCodeLbl);
		
		TFPostalCode = new FTextField(0);
		TFPostalCode.setEnabled(false);
		TFPostalCode.setPreferredSize(new Dimension(300, 20));
		ViewOrderInfoPan1.add(TFPostalCode);
		
		JPanel ViewOrderInfoPan2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) ViewOrderInfoPan2.getLayout();
		ViewOrderInfoPan2.setPreferredSize(new Dimension(600, 400));
		ViewOrderInfoPan2.setBackground(Color.LIGHT_GRAY);
		InnerPan.add(ViewOrderInfoPan2);
		
		FLabel MealOrderLbl = new FLabel("Meal in Order");
		MealOrderLbl.setFont(MealOrderLbl.getFont().deriveFont(MealOrderLbl.getFont().getSize() + 12f));
		MealOrderLbl.setHorizontalAlignment(SwingConstants.CENTER);
		MealOrderLbl.setPreferredSize(new Dimension(600, 35));
		ViewOrderInfoPan2.add(MealOrderLbl);
		
		JTAMealOrder = new JTextArea();
		JTAMealOrder.setBorder(new LineBorder(Color.GRAY));
		JTAMealOrder.setLineWrap(true);
		JTAMealOrder.setEnabled(false);
		JTAMealOrder.setPreferredSize(new Dimension(400, 285));
		ViewOrderInfoPan2.add(JTAMealOrder);
		
		JPanel SpacePan2 = new JPanel();
		SpacePan2.setBackground(Color.LIGHT_GRAY);
		SpacePan2.setPreferredSize(new Dimension(600, 1));
		ViewOrderInfoPan2.add(SpacePan2);
		
		BTNOrderReady = new FButton("Order Ready");
		BTNOrderReady.setFont(BTNOrderReady.getFont().deriveFont(BTNOrderReady.getFont().getSize() + 12f));
		BTNOrderReady.setPreferredSize(new Dimension(400, 50));
		ViewOrderInfoPan2.add(BTNOrderReady);

		repaint();
		revalidate();

	}
	
}
