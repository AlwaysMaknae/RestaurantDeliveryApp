package Form.Restaurant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import utils.FForm;
import utils.FHoursComboBox;
import utils.FLabel;
import utils.FTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class FAddRestaurantPage extends FForm{
	
	protected JTextField TFRestaurantName;
	protected JTextField TFRestaurantAddress;
	protected JTextField TFPhoneNum_1, TFPhoneNum_2, TFPhoneNum_3;
	protected JTextField TFDeliveryArea;
	
	protected JComboBox Fcb[] = new JComboBox[7];
	protected String days[] = { "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday" };
	
	
	public FAddRestaurantPage() {
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.WHITE);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel InnerPan = new JPanel();
		MainPan.add(InnerPan);
		InnerPan.setBackground(Color.WHITE);
		InnerPan.setPreferredSize(new Dimension(600, 970));
		
		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.WHITE);
		TitlePan.setPreferredSize(new Dimension(600, 40));
		InnerPan.add(TitlePan);
		
		JPanel TitleSpacePan = new JPanel();
		TitleSpacePan.setBackground(Color.WHITE);
		TitleSpacePan.setPreferredSize(new Dimension(600, 5));
		TitlePan.add(TitleSpacePan);
		
		JLabel TitleLbl = new JLabel("Add new Restaurant");
		TitlePan.add(TitleLbl);
		
		JPanel RestaurantInfoPan = new JPanel();
		RestaurantInfoPan.setBackground(Color.WHITE);
		RestaurantInfoPan.setPreferredSize(new Dimension(600, 100));
		InnerPan.add(RestaurantInfoPan);
		
		JLabel RestaurantNameLbl = new JLabel("Restaurant Name:");
		RestaurantNameLbl.setPreferredSize(new Dimension(120, 14));
		RestaurantInfoPan.add(RestaurantNameLbl);
		
		TFRestaurantName = new JTextField();
		TFRestaurantName.setPreferredSize(new Dimension(215, 20));
		RestaurantInfoPan.add(TFRestaurantName);
		
		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.WHITE);
		SpacePan1.setPreferredSize(new Dimension(600, 3));
		RestaurantInfoPan.add(SpacePan1);
		
		JLabel RestaurantAddressLbl = new JLabel("Restaurant Address:");
		RestaurantAddressLbl.setPreferredSize(new Dimension(120, 14));
		RestaurantInfoPan.add(RestaurantAddressLbl);
		
		TFRestaurantAddress = new JTextField();
		TFRestaurantAddress.setPreferredSize(new Dimension(215, 20));
		RestaurantInfoPan.add(TFRestaurantAddress);
		
		JPanel SpacePan2 = new JPanel();
		SpacePan2.setBackground(Color.WHITE);
		SpacePan2.setPreferredSize(new Dimension(600, 3));
		RestaurantInfoPan.add(SpacePan2);
		
		FLabel PhoneNumLbl = new FLabel("Phone Number:");
		PhoneNumLbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		PhoneNumLbl.setPreferredSize(new Dimension(120, 14));
		PhoneNumLbl.setHorizontalAlignment(SwingConstants.LEFT);
		RestaurantInfoPan.add(PhoneNumLbl);
		
		JLabel BracketLbl = new JLabel("(");
		BracketLbl.setPreferredSize(new Dimension(5, 14));
		BracketLbl.setHorizontalAlignment(SwingConstants.LEFT);
		RestaurantInfoPan.add(BracketLbl);
		
		TFPhoneNum_1 = new JTextField();
		TFPhoneNum_1.setPreferredSize(new Dimension(25, 18));
		RestaurantInfoPan.add(TFPhoneNum_1);
		
		JLabel BracketLbl2 = new JLabel(")");
		BracketLbl2.setPreferredSize(new Dimension(5, 14));
		BracketLbl2.setHorizontalAlignment(SwingConstants.LEFT);
		RestaurantInfoPan.add(BracketLbl2);
		
		TFPhoneNum_2 = new JTextField();
		TFPhoneNum_2.setPreferredSize(new Dimension(25, 18));
		RestaurantInfoPan.add(TFPhoneNum_2);
		
		JPanel SpacePan3 = new JPanel();
		SpacePan3.setBackground(Color.WHITE);
		SpacePan3.setPreferredSize(new Dimension(5, 15));
		RestaurantInfoPan.add(SpacePan3);
		
		TFPhoneNum_3 = new JTextField();
		TFPhoneNum_3.setPreferredSize(new Dimension(30, 18));
		RestaurantInfoPan.add(TFPhoneNum_3);
		
		JPanel SpacePan4 = new JPanel();
		SpacePan4.setPreferredSize(new Dimension(90, 15));
		SpacePan4.setBackground(Color.WHITE);
		RestaurantInfoPan.add(SpacePan4);
		
		JPanel TitlePan2 = new JPanel();
		TitlePan2.setBackground(Color.WHITE);
		TitlePan2.setPreferredSize(new Dimension(600, 35));
		InnerPan.add(TitlePan2);
		
		JPanel TitleSpacePan2 = new JPanel();
		TitleSpacePan2.setBackground(Color.WHITE);
		TitleSpacePan2.setPreferredSize(new Dimension(600, 3));
		TitlePan2.add(TitleSpacePan2);
		
		JLabel OpenTimeLbl = new JLabel("Opening Time");
		TitlePan2.add(OpenTimeLbl);
		
		JPanel OpenTimePan = new JPanel();
		OpenTimePan.setBackground(Color.WHITE);
		OpenTimePan.setPreferredSize(new Dimension(600, 400));
		InnerPan.add(OpenTimePan);
		
		JPanel OpenTimeTitlePan = new JPanel();
		OpenTimeTitlePan.setBackground(Color.WHITE);
		OpenTimeTitlePan.setPreferredSize(new Dimension(600, 25));
		OpenTimePan.add(OpenTimeTitlePan);
		
		JPanel OpenTimeSpacePan0 = new JPanel();
		OpenTimeSpacePan0.setBackground(Color.WHITE);
		OpenTimeSpacePan0.setPreferredSize(new Dimension(50, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan0);
		
		JLabel DayLbl = new JLabel("Day");
		OpenTimeTitlePan.add(DayLbl);
		
		JPanel OpenTimeSpacePan1 = new JPanel();
		OpenTimeSpacePan1.setBackground(Color.WHITE);
		OpenTimeSpacePan1.setPreferredSize(new Dimension(75, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan1);
		
		JLabel OpeningTimeLbl = new JLabel("Opening Time");
		OpenTimeTitlePan.add(OpeningTimeLbl);
		
		JPanel OpenTimeSpacePan2 = new JPanel();
		OpenTimeSpacePan2.setBackground(Color.WHITE);
		OpenTimeSpacePan2.setPreferredSize(new Dimension(135, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan2);
		
		JLabel ClosingTimeLbl = new JLabel("Closing Time");
		OpenTimeTitlePan.add(ClosingTimeLbl);
		
		JPanel OpenTimeSpacePan22 = new JPanel();
		OpenTimeSpacePan22.setBackground(Color.WHITE);
		OpenTimeSpacePan22.setPreferredSize(new Dimension(60, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan22);
		
		JPanel OpenTimeSpacePan3 = new JPanel();
		OpenTimeSpacePan3.setBackground(Color.WHITE);
		OpenTimeSpacePan3.setPreferredSize(new Dimension(20, 10));
		OpenTimePan.add(OpenTimeSpacePan3);
		
		JPanel DayPan = new JPanel();
		DayPan.setBackground(Color.WHITE);
		DayPan.setPreferredSize(new Dimension(100, 365));
		OpenTimePan.add(DayPan);
		
		JPanel FcbSpacer00 = new JPanel();
		FcbSpacer00.setPreferredSize(new Dimension(100, 8));
		FcbSpacer00.setBackground(Color.WHITE);
		DayPan.add(FcbSpacer00);
		
		for(int i = 0; i < days.length; i++) {
			DayPan.add(new FLabel(days[i]));
			JPanel FcbSpacer0 = new JPanel();
			FcbSpacer0.setPreferredSize(new Dimension(100, 23));
			FcbSpacer0.setBackground(Color.RED);
			DayPan.add(FcbSpacer0);
		}
		
		JPanel OpenTimeSpacePan4 = new JPanel();
		OpenTimeSpacePan4.setBackground(Color.WHITE);
		OpenTimeSpacePan4.setPreferredSize(new Dimension(20, 10));
		OpenTimePan.add(OpenTimeSpacePan4);
		
		JPanel OpeningTimePan = new JPanel();
		OpeningTimePan.setBackground(Color.WHITE);
		OpeningTimePan.setPreferredSize(new Dimension(100, 365));
		OpenTimePan.add(OpeningTimePan);
		
		for(int i = 0; i < Fcb.length; i++) {
			Fcb[i] = new FHoursComboBox();
			OpeningTimePan.add(Fcb[i]);
			JPanel FcbSpacer = new JPanel();
			FcbSpacer.setPreferredSize(new Dimension(100, 8));
			FcbSpacer.setBackground(Color.RED);
			OpeningTimePan.add(FcbSpacer);
		}
		
		JPanel OpenTimeSpacePan5 = new JPanel();
		OpenTimeSpacePan5.setBackground(Color.WHITE);
		OpenTimeSpacePan5.setPreferredSize(new Dimension(110, 10));
		OpenTimePan.add(OpenTimeSpacePan5);
		
		JPanel ClosingTimePan = new JPanel();
		ClosingTimePan.setBackground(Color.WHITE);
		ClosingTimePan.setPreferredSize(new Dimension(100, 365));
		OpenTimePan.add(ClosingTimePan);
		
		for(int i = 0; i < Fcb.length; i++) {
			Fcb[i] = new FHoursComboBox();
			ClosingTimePan.add(Fcb[i]);
			JPanel FcbSpacer2 = new JPanel();
			FcbSpacer2.setPreferredSize(new Dimension(100, 8));
			FcbSpacer2.setBackground(Color.RED);
			ClosingTimePan.add(FcbSpacer2);
		}
		
		JPanel OpenTimeSpacePan6 = new JPanel();
		OpenTimeSpacePan6.setBackground(Color.WHITE);
		OpenTimeSpacePan6.setPreferredSize(new Dimension(50, 10));
		OpenTimePan.add(OpenTimeSpacePan6);
		
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBackground(Color.WHITE);
		ButtonPanel.setPreferredSize(new Dimension(600, 40));
		InnerPan.add(ButtonPanel);
		
		JButton BTNModifyAll = new JButton("Modify all the time at once");
		BTNModifyAll.setPreferredSize(new Dimension(460, 30));
		ButtonPanel.add(BTNModifyAll);
		
		JPanel ButtonSpacerPan = new JPanel();
		ButtonSpacerPan.setBackground(Color.WHITE);
		ButtonSpacerPan.setPreferredSize(new Dimension(22, 10));
		ButtonPanel.add(ButtonSpacerPan);
		
		JPanel DeliveryPan = new JPanel();
		DeliveryPan.setBackground(Color.WHITE);
		DeliveryPan.setPreferredSize(new Dimension(600, 325));
		InnerPan.add(DeliveryPan);
		
		JLabel lblNewLabel = new JLabel("Delivery Area");
		DeliveryPan.add(lblNewLabel);
		
		JPanel DeliverySpacePan = new JPanel();
		DeliverySpacePan.setBackground(Color.WHITE);
		DeliverySpacePan.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(Color.GRAY));
		textArea.setPreferredSize(new Dimension(460, 125));
		DeliveryPan.add(textArea);
		
		JPanel JTASpacePan2 = new JPanel();
		JTASpacePan2.setBackground(Color.WHITE);
		JTASpacePan2.setPreferredSize(new Dimension(22, 10));
		DeliveryPan.add(JTASpacePan2);
		
		JPanel DeliverySpacePan2 = new JPanel();
		DeliverySpacePan2.setBackground(Color.WHITE);
		DeliverySpacePan2.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan2);
		
		JLabel DeliveryAreaLbl = new JLabel("Delivery Area:");
		DeliveryAreaLbl.setPreferredSize(new Dimension(75, 14));
		DeliveryPan.add(DeliveryAreaLbl);
		
		TFDeliveryArea = new JTextField();
		TFDeliveryArea.setPreferredSize(new Dimension(30, 18));
		DeliveryPan.add(TFDeliveryArea);
		
		JButton BTNAddDeliveryArea = new JButton("Add Delivery Area");
		BTNAddDeliveryArea.setPreferredSize(new Dimension(150, 28));
		DeliveryPan.add(BTNAddDeliveryArea);
		
		JPanel DeliverySpacePan3 = new JPanel();
		DeliverySpacePan3.setBackground(Color.WHITE);
		DeliverySpacePan3.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan3);
		
		JButton BTNDeleteDeliveryArea = new JButton("Delete Delivery Area");
		BTNDeleteDeliveryArea.setPreferredSize(new Dimension(150, 28));
		DeliveryPan.add(BTNDeleteDeliveryArea);
		
		JPanel DeliverySpacePan4 = new JPanel();
		DeliverySpacePan4.setBackground(Color.WHITE);
		DeliverySpacePan4.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan4);
		
		JButton BTNDeliverySave = new JButton("Save");
		BTNDeliverySave.setPreferredSize(new Dimension(75, 28));
		DeliveryPan.add(BTNDeliverySave);
		
		
		
		repaint();
		revalidate();
		
	}

}
