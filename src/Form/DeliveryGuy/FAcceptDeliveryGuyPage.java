package Form.DeliveryGuy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import utils.FButton;
import utils.FForm;
import utils.FLabel;
import utils.FListView;

public class FAcceptDeliveryGuyPage extends FForm {

	protected FButton BTNSelect, BTNAccept;
	
	protected int OrderNum = 0, RestaurantNum = 0;
	protected String DeliveryAddress = " ", DeliveryPostalCode = " ";

	protected FListView ListPan;
	
	public FAcceptDeliveryGuyPage() {

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
		ListPan.setPreferredSize(new Dimension(300, 905));
		RestaurantListPan.add(ListPan);

		JPanel RestaurantListButtonPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) RestaurantListButtonPan.getLayout();
		flowLayout.setVgap(0);
		RestaurantListButtonPan.setPreferredSize(new Dimension(300, 26));
		RestaurantListPan.add(RestaurantListButtonPan);

		BTNSelect = new FButton("Select");
		BTNSelect.setPreferredSize(new Dimension(300, 26));
		RestaurantListButtonPan.add(BTNSelect);

		JPanel MainSpacePan = new JPanel();
		MainSpacePan.setBackground(Color.LIGHT_GRAY);
		MainSpacePan.setPreferredSize(new Dimension(160, 975));
		MainPan.add(MainSpacePan);

		JPanel InnerPan = new JPanel();
		InnerPan.setBackground(Color.LIGHT_GRAY);
		InnerPan.setPreferredSize(new Dimension(325, 975));
		MainPan.add(InnerPan);
		
		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.LIGHT_GRAY);
		FlowLayout fl_TitlePan = (FlowLayout) TitlePan.getLayout();
		fl_TitlePan.setVgap(10);
		TitlePan.setPreferredSize(new Dimension(250, 35));
		InnerPan.add(TitlePan);
		
		FLabel AcceptDeliveryLbl = new FLabel("Accept a Delivery");
		TitlePan.add(AcceptDeliveryLbl);
		
		JPanel ViewDeliveryInfoPan = new JPanel();
		ViewDeliveryInfoPan.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout_1 = (FlowLayout) ViewDeliveryInfoPan.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		ViewDeliveryInfoPan.setPreferredSize(new Dimension(250, 110));
		InnerPan.add(ViewDeliveryInfoPan);
		
		FLabel OrderLbl = new FLabel("Order # : " + OrderNum);
		ViewDeliveryInfoPan.add(OrderLbl);
		
		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(250, 1));
		ViewDeliveryInfoPan.add(SpacePan0);
		
		FLabel RestaurantLbl = new FLabel("Restaurant # : " + RestaurantNum);
		RestaurantLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ViewDeliveryInfoPan.add(RestaurantLbl);
		
		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(250, 1));
		ViewDeliveryInfoPan.add(SpacePan1);
		
		FLabel DeliveryAddressLbl = new FLabel("Delivery Address: " + DeliveryAddress);
		ViewDeliveryInfoPan.add(DeliveryAddressLbl);
		
		JPanel SpacePan2 = new JPanel();
		SpacePan2.setBackground(Color.LIGHT_GRAY);
		SpacePan2.setPreferredSize(new Dimension(250, 1));
		ViewDeliveryInfoPan.add(SpacePan2);
		
		FLabel DeliveryPostalCodeLbl = new FLabel("Delivery Postal Code: " + DeliveryPostalCode);
		ViewDeliveryInfoPan.add(DeliveryPostalCodeLbl);
		
		JPanel SpacePan3 = new JPanel();
		SpacePan3.setBackground(Color.LIGHT_GRAY);
		SpacePan3.setPreferredSize(new Dimension(250, 1));
		ViewDeliveryInfoPan.add(SpacePan3);
		
		JPanel ButtonPan = new JPanel();
		ButtonPan.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout_2 = (FlowLayout) ButtonPan.getLayout();
		flowLayout_2.setHgap(2);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setVgap(0);
		ButtonPan.setPreferredSize(new Dimension(250, 25));
		InnerPan.add(ButtonPan);
		
		BTNAccept = new FButton("Accept Delivery");
		BTNAccept.setPreferredSize(new Dimension(200, 25));
		ButtonPan.add(BTNAccept);
		
		JPanel MainSpacePan2 = new JPanel();
		MainSpacePan2.setPreferredSize(new Dimension(160, 975));
		MainSpacePan2.setBackground(Color.LIGHT_GRAY);
		MainPan.add(MainSpacePan2);

		repaint();
		revalidate();


	}

}
