package Form.Delivery;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import utils.FForm;
import utils.FLabel;

public class FEditDeliveryGuyPage extends FForm {

	protected JTextField TFName, TFDeliveryArea;
	protected JTextField TFPhoneNum_1, TFPhoneNum_2, TFPhoneNum_3;

	protected JButton BTNSelect, BTNAddDeliveryArea, BTNDeleteDeliveryArea, BTNSaveDeliveryArea;

	public FEditDeliveryGuyPage() {

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
		
		FLabel ListDeliveryGuyTitleLbl = new FLabel("Delivery Man");
		ListTitlePan.add(ListDeliveryGuyTitleLbl);
		
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
		
		JPanel MainSpacePan = new JPanel();
		MainSpacePan.setBackground(Color.LIGHT_GRAY);
		MainSpacePan.setPreferredSize(new Dimension(115, 975));
		MainPan.add(MainSpacePan);
		
		JPanel InnerPan = new JPanel();
		InnerPan.setBackground(Color.LIGHT_GRAY);
		InnerPan.setPreferredSize(new Dimension(425, 975));
		MainPan.add(InnerPan);
		

		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.LIGHT_GRAY);
		TitlePan.setPreferredSize(new Dimension(425, 35));
		InnerPan.add(TitlePan);

		JPanel TitleSpacePan = new JPanel();
		TitleSpacePan.setBackground(Color.LIGHT_GRAY);
		TitleSpacePan.setPreferredSize(new Dimension(425, 1));
		TitlePan.add(TitleSpacePan);

		FLabel TitleLbl = new FLabel("Edit Delivery Man");
		TitlePan.add(TitleLbl);

		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(425, 1));
		InnerPan.add(SpacePan0);

		JPanel InfoPan = new JPanel();
		InfoPan.setBackground(Color.LIGHT_GRAY);
		InfoPan.setPreferredSize(new Dimension(425, 65));
		InnerPan.add(InfoPan);

		FLabel NameLbl = new FLabel("Name:");
		NameLbl.setPreferredSize(new Dimension(110, 14));
		InfoPan.add(NameLbl);

		TFName = new JTextField();
		TFName.setPreferredSize(new Dimension(285, 20));
		InfoPan.add(TFName);

		JPanel InfoSpacePan = new JPanel();
		InfoSpacePan.setBackground(Color.LIGHT_GRAY);
		InfoSpacePan.setPreferredSize(new Dimension(425, 1));
		InfoPan.add(InfoSpacePan);

		FLabel PhoneNumLbl = new FLabel("Phone Number:");
		PhoneNumLbl.setPreferredSize(new Dimension(110, 14));
		PhoneNumLbl.setHorizontalAlignment(SwingConstants.LEFT);
		InfoPan.add(PhoneNumLbl);

		FLabel BracketLbl = new FLabel("(");
		BracketLbl.setPreferredSize(new Dimension(5, 14));
		BracketLbl.setHorizontalAlignment(SwingConstants.LEFT);
		InfoPan.add(BracketLbl);

		TFPhoneNum_1 = new JTextField();
		TFPhoneNum_1.setPreferredSize(new Dimension(25, 18));
		InfoPan.add(TFPhoneNum_1);

		FLabel BracketLbl2 = new FLabel(")");
		BracketLbl2.setPreferredSize(new Dimension(5, 14));
		BracketLbl2.setHorizontalAlignment(SwingConstants.LEFT);
		InfoPan.add(BracketLbl2);

		TFPhoneNum_2 = new JTextField();
		TFPhoneNum_2.setPreferredSize(new Dimension(25, 18));
		InfoPan.add(TFPhoneNum_2);

		JPanel InfoSpacePan2 = new JPanel();
		InfoSpacePan2.setBackground(Color.LIGHT_GRAY);
		InfoSpacePan2.setPreferredSize(new Dimension(5, 15));
		InfoPan.add(InfoSpacePan2);

		TFPhoneNum_3 = new JTextField();
		TFPhoneNum_3.setPreferredSize(new Dimension(30, 18));
		InfoPan.add(TFPhoneNum_3);

		JPanel InfoSpacePan3 = new JPanel();
		InfoSpacePan3.setPreferredSize(new Dimension(160, 5));
		InfoSpacePan3.setBackground(Color.LIGHT_GRAY);
		InfoPan.add(InfoSpacePan3);

		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(425, 1));
		InnerPan.add(SpacePan1);

		JPanel DeliveryInfoPan = new JPanel();
		DeliveryInfoPan.setBackground(Color.LIGHT_GRAY);
		DeliveryInfoPan.setPreferredSize(new Dimension(425, 440));
		InnerPan.add(DeliveryInfoPan);

		FLabel DeliveryAreaTitleLbl = new FLabel("Delivery Area");
		DeliveryInfoPan.add(DeliveryAreaTitleLbl);

		JPanel DeliveryInfoSpacePan = new JPanel();
		DeliveryInfoSpacePan.setBackground(Color.LIGHT_GRAY);
		DeliveryInfoSpacePan.setPreferredSize(new Dimension(425, 1));
		DeliveryInfoPan.add(DeliveryInfoSpacePan);

		JTextArea JTADeliveryArea = new JTextArea();
		JTADeliveryArea.setPreferredSize(new Dimension(400, 100));
		JTADeliveryArea.setBorder(new LineBorder(new Color(128, 128, 128)));
		JTADeliveryArea.setLineWrap(true);
		DeliveryInfoPan.add(JTADeliveryArea);

		JPanel DeliverySpacePan2 = new JPanel();
		DeliverySpacePan2.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan2.setPreferredSize(new Dimension(600, 2));
		DeliveryInfoPan.add(DeliverySpacePan2);

		FLabel DeliveryAreaLbl = new FLabel("Delivery Area:");
		DeliveryAreaLbl.setPreferredSize(new Dimension(80, 14));
		DeliveryInfoPan.add(DeliveryAreaLbl);

		TFDeliveryArea = new JTextField();
		TFDeliveryArea.setPreferredSize(new Dimension(30, 18));
		DeliveryInfoPan.add(TFDeliveryArea);

		BTNAddDeliveryArea = new JButton("Add Delivery Area");
		BTNAddDeliveryArea.setPreferredSize(new Dimension(150, 28));
		DeliveryInfoPan.add(BTNAddDeliveryArea);

		JPanel DeliverySpacePan3 = new JPanel();
		DeliverySpacePan3.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan3.setPreferredSize(new Dimension(600, 2));
		DeliveryInfoPan.add(DeliverySpacePan3);

		BTNDeleteDeliveryArea = new JButton("Delete Delivery Area");
		BTNDeleteDeliveryArea.setPreferredSize(new Dimension(150, 28));
		DeliveryInfoPan.add(BTNDeleteDeliveryArea);

		JPanel DeliverySpacePan4 = new JPanel();
		DeliverySpacePan4.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan4.setPreferredSize(new Dimension(600, 2));
		DeliveryInfoPan.add(DeliverySpacePan4);

		JPanel DeliverySpacePan5 = new JPanel();
		DeliverySpacePan5.setPreferredSize(new Dimension(30, 2));
		DeliverySpacePan5.setBackground(Color.LIGHT_GRAY);
		DeliveryInfoPan.add(DeliverySpacePan5);

		BTNSaveDeliveryArea = new JButton("Save");
		BTNSaveDeliveryArea.setPreferredSize(new Dimension(80, 28));
		DeliveryInfoPan.add(BTNSaveDeliveryArea);
		
		JPanel MainSpacePan2 = new JPanel();
		MainSpacePan2.setPreferredSize(new Dimension(115, 975));
		MainSpacePan2.setBackground(Color.LIGHT_GRAY);
		MainPan.add(MainSpacePan2);

		repaint();
		revalidate();

	}

}
