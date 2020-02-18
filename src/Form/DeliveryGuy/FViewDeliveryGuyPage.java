package Form.DeliveryGuy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.FButton;
import utils.FForm;
import utils.FLabel;
import utils.FListView;

import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FViewDeliveryGuyPage extends FForm {
	
	protected FButton BTNSelect, BTNComplete;
	
	protected int OrderNum = 0, RestaurantNum = 0;
	protected String DeliveryAddress = " ", DeliveryPostalCode = " ";
	
	protected FListView ListPan;
	
	protected FLabel RestaurantLbl, DeliveryAddressLbl, DeliveryPostalCodeLbl, OrderLbl;

	public FViewDeliveryGuyPage() {

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

		FLabel ListOrderTitleLbl = new FLabel("Order");
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
		
		FLabel ViewDeliveryLbl = new FLabel("View Delivery");
		ViewDeliveryLbl.setFont(ViewDeliveryLbl.getFont().deriveFont(ViewDeliveryLbl.getFont().getSize() + 20f));
		TitlePan.add(ViewDeliveryLbl);
		
		JPanel ViewDeliveryInfoPan = new JPanel();
		ViewDeliveryInfoPan.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout_1 = (FlowLayout) ViewDeliveryInfoPan.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		ViewDeliveryInfoPan.setPreferredSize(new Dimension(600, 150));
		InnerPan.add(ViewDeliveryInfoPan);
		
		OrderLbl = new FLabel("Order # : " + OrderNum);
		OrderLbl.setPreferredSize(new Dimension(600, 30));
		OrderLbl.setFont(OrderLbl.getFont().deriveFont(OrderLbl.getFont().getSize() + 12f));
		ViewDeliveryInfoPan.add(OrderLbl);
		
		RestaurantLbl = new FLabel("Restaurant # : " + RestaurantNum);
		RestaurantLbl.setPreferredSize(new Dimension(600, 30));
		RestaurantLbl.setFont(RestaurantLbl.getFont().deriveFont(RestaurantLbl.getFont().getSize() + 12f));
		RestaurantLbl.setHorizontalAlignment(SwingConstants.LEFT);
		ViewDeliveryInfoPan.add(RestaurantLbl);
		
		DeliveryAddressLbl = new FLabel("Delivery Address: " + DeliveryAddress);
		DeliveryAddressLbl.setPreferredSize(new Dimension(600, 30));
		DeliveryAddressLbl.setFont(DeliveryAddressLbl.getFont().deriveFont(DeliveryAddressLbl.getFont().getSize() + 12f));
		ViewDeliveryInfoPan.add(DeliveryAddressLbl);
		
		DeliveryPostalCodeLbl = new FLabel("Delivery Postal Code: " + DeliveryPostalCode);
		DeliveryPostalCodeLbl.setPreferredSize(new Dimension(600, 30));
		DeliveryPostalCodeLbl.setFont(DeliveryPostalCodeLbl.getFont().deriveFont(DeliveryPostalCodeLbl.getFont().getSize() + 12f));
		ViewDeliveryInfoPan.add(DeliveryPostalCodeLbl);
		
		JPanel ButtonPan = new JPanel();
		ButtonPan.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout_2 = (FlowLayout) ButtonPan.getLayout();
		flowLayout_2.setHgap(2);
		flowLayout_2.setVgap(0);
		ButtonPan.setPreferredSize(new Dimension(600, 50));
		InnerPan.add(ButtonPan);
		
		BTNComplete = new FButton("Check Items");
		BTNComplete.setFont(BTNComplete.getFont().deriveFont(BTNComplete.getFont().getSize() + 20f));
		BTNComplete.setPreferredSize(new Dimension(200, 50));
		ButtonPan.add(BTNComplete);

		repaint();
		revalidate();

	}

}
