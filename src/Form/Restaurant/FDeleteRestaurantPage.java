package Form.Restaurant;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import utils.FButton;
import utils.FForm;
import utils.FHoursComboBox;
import utils.FLabel;
import utils.FListView;
import utils.FTextField;

public class FDeleteRestaurantPage extends FForm{

	protected FTextField TFRestaurantName;
	protected FTextField TFRestaurantAddress;
	protected FTextField TFPhoneNum_1, TFPhoneNum_2, TFPhoneNum_3;
	protected FTextField TFDeliveryArea;
	protected FButton BTNSelect, BTNModifyAll, BTNAddDeliveryArea, BTNDeleteDeliveryArea, BTNDeliveryRestaurantDelete;
	
	protected JComboBox Fcb[] = new JComboBox[7];
	protected String days[] = { "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday" };
	
	protected FListView ListPan;
	
	public FDeleteRestaurantPage() {
		
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
		RestaurantListPan.setPreferredSize(new Dimension(225, 970));
		MainPan.add(RestaurantListPan);
		
		JPanel ListTitlePan = new JPanel();
		ListTitlePan.setBackground(Color.LIGHT_GRAY);
		ListTitlePan.setPreferredSize(new Dimension(220, 25));
		RestaurantListPan.add(ListTitlePan);
		
		FLabel RestaurantListLbl = new FLabel("Restaurant");
		ListTitlePan.add(RestaurantListLbl);
		
		ListPan = new FListView();
		ListPan.setPreferredSize(new Dimension(220, 895));
		RestaurantListPan.add(ListPan);
		
		JPanel ListButtonPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) ListButtonPan.getLayout();
		flowLayout.setVgap(0);
		ListButtonPan.setBackground(Color.LIGHT_GRAY);
		ListButtonPan.setPreferredSize(new Dimension(220, 33));
		RestaurantListPan.add(ListButtonPan);
		
		BTNSelect = new FButton("Select");
		BTNSelect.setPreferredSize(new Dimension(220, 30));
		ListButtonPan.add(BTNSelect);
		
		JPanel InnerPan = new JPanel();
		MainPan.add(InnerPan);
		InnerPan.setBackground(Color.LIGHT_GRAY);
		InnerPan.setPreferredSize(new Dimension(600, 970));
		
		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.LIGHT_GRAY);
		TitlePan.setPreferredSize(new Dimension(600, 40));
		InnerPan.add(TitlePan);
		
		JPanel TitleSpacePan = new JPanel();
		TitleSpacePan.setBackground(Color.LIGHT_GRAY);
		TitleSpacePan.setPreferredSize(new Dimension(600, 5));
		TitlePan.add(TitleSpacePan);
		
		FLabel TitleLbl = new FLabel("Delete Restaurant");
		TitlePan.add(TitleLbl);
		
		JPanel RestaurantInfoPan = new JPanel();
		RestaurantInfoPan.setBackground(Color.LIGHT_GRAY);
		RestaurantInfoPan.setPreferredSize(new Dimension(600, 100));
		InnerPan.add(RestaurantInfoPan);
		
		FLabel RestaurantNameLbl = new FLabel("Restaurant Name:");
		RestaurantNameLbl.setPreferredSize(new Dimension(120, 14));
		RestaurantInfoPan.add(RestaurantNameLbl);
		
		TFRestaurantName = new FTextField(0);
		TFRestaurantName.setEnabled(false);
		TFRestaurantName.setPreferredSize(new Dimension(215, 20));
		RestaurantInfoPan.add(TFRestaurantName);
		
		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(600, 3));
		RestaurantInfoPan.add(SpacePan1);
		
		FLabel RestaurantAddressLbl = new FLabel("Restaurant Address:");
		RestaurantAddressLbl.setPreferredSize(new Dimension(120, 14));
		RestaurantInfoPan.add(RestaurantAddressLbl);
		
		TFRestaurantAddress = new FTextField(0);
		TFRestaurantAddress.setEnabled(false);
		TFRestaurantAddress.setPreferredSize(new Dimension(215, 20));
		RestaurantInfoPan.add(TFRestaurantAddress);
		
		JPanel SpacePan2 = new JPanel();
		SpacePan2.setBackground(Color.LIGHT_GRAY);
		SpacePan2.setPreferredSize(new Dimension(600, 3));
		RestaurantInfoPan.add(SpacePan2);
		
		FLabel PhoneNumLbl = new FLabel("Phone Number:");
		PhoneNumLbl.setPreferredSize(new Dimension(120, 14));
		PhoneNumLbl.setHorizontalAlignment(SwingConstants.LEFT);
		RestaurantInfoPan.add(PhoneNumLbl);
		
		FLabel BracketLbl = new FLabel("(");
		BracketLbl.setPreferredSize(new Dimension(5, 14));
		BracketLbl.setHorizontalAlignment(SwingConstants.LEFT);
		RestaurantInfoPan.add(BracketLbl);
		
		TFPhoneNum_1 = new FTextField(0);
		TFPhoneNum_1.setEnabled(false);
		TFPhoneNum_1.setPreferredSize(new Dimension(25, 18));
		RestaurantInfoPan.add(TFPhoneNum_1);
		
		FLabel BracketLbl2 = new FLabel(")");
		BracketLbl2.setPreferredSize(new Dimension(5, 14));
		BracketLbl2.setHorizontalAlignment(SwingConstants.LEFT);
		RestaurantInfoPan.add(BracketLbl2);
		
		TFPhoneNum_2 = new FTextField(0);
		TFPhoneNum_2.setEnabled(false);
		TFPhoneNum_2.setPreferredSize(new Dimension(25, 18));
		RestaurantInfoPan.add(TFPhoneNum_2);
		
		JPanel SpacePan3 = new JPanel();
		SpacePan3.setBackground(Color.LIGHT_GRAY);
		SpacePan3.setPreferredSize(new Dimension(5, 15));
		RestaurantInfoPan.add(SpacePan3);
		
		TFPhoneNum_3 = new FTextField(0);
		TFPhoneNum_3.setEnabled(false);
		TFPhoneNum_3.setPreferredSize(new Dimension(30, 18));
		RestaurantInfoPan.add(TFPhoneNum_3);
		
		JPanel SpacePan4 = new JPanel();
		SpacePan4.setPreferredSize(new Dimension(90, 15));
		SpacePan4.setBackground(Color.LIGHT_GRAY);
		RestaurantInfoPan.add(SpacePan4);
		
		JPanel TitlePan2 = new JPanel();
		TitlePan2.setBackground(Color.LIGHT_GRAY);
		TitlePan2.setPreferredSize(new Dimension(600, 35));
		InnerPan.add(TitlePan2);
		
		JPanel TitleSpacePan2 = new JPanel();
		TitleSpacePan2.setBackground(Color.LIGHT_GRAY);
		TitleSpacePan2.setPreferredSize(new Dimension(600, 3));
		TitlePan2.add(TitleSpacePan2);
		
		FLabel OpenTimeLbl = new FLabel("Opening Time");
		TitlePan2.add(OpenTimeLbl);
		
		JPanel OpenTimePan = new JPanel();
		OpenTimePan.setBackground(Color.LIGHT_GRAY);
		OpenTimePan.setPreferredSize(new Dimension(600, 400));
		InnerPan.add(OpenTimePan);
		
		JPanel OpenTimeTitlePan = new JPanel();
		OpenTimeTitlePan.setBackground(Color.LIGHT_GRAY);
		OpenTimeTitlePan.setPreferredSize(new Dimension(600, 25));
		OpenTimePan.add(OpenTimeTitlePan);
		
		JPanel OpenTimeSpacePan0 = new JPanel();
		OpenTimeSpacePan0.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan0.setPreferredSize(new Dimension(50, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan0);
		
		FLabel DayLbl = new FLabel("Day");
		OpenTimeTitlePan.add(DayLbl);
		
		JPanel OpenTimeSpacePan1 = new JPanel();
		OpenTimeSpacePan1.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan1.setPreferredSize(new Dimension(75, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan1);
		
		FLabel OpeningTimeLbl = new FLabel("Opening Time");
		OpenTimeTitlePan.add(OpeningTimeLbl);
		
		JPanel OpenTimeSpacePan2 = new JPanel();
		OpenTimeSpacePan2.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan2.setPreferredSize(new Dimension(135, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan2);
		
		FLabel ClosingTimeLbl = new FLabel("Closing Time");
		OpenTimeTitlePan.add(ClosingTimeLbl);
		
		JPanel OpenTimeSpacePan22 = new JPanel();
		OpenTimeSpacePan22.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan22.setPreferredSize(new Dimension(60, 10));
		OpenTimeTitlePan.add(OpenTimeSpacePan22);
		
		JPanel OpenTimeSpacePan3 = new JPanel();
		OpenTimeSpacePan3.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan3.setPreferredSize(new Dimension(20, 10));
		OpenTimePan.add(OpenTimeSpacePan3);
		
		JPanel DayPan = new JPanel();
		DayPan.setBackground(Color.LIGHT_GRAY);
		DayPan.setPreferredSize(new Dimension(100, 365));
		OpenTimePan.add(DayPan);
		
		JPanel FcbSpacer00 = new JPanel();
		FcbSpacer00.setPreferredSize(new Dimension(100, 8));
		FcbSpacer00.setBackground(Color.LIGHT_GRAY);
		DayPan.add(FcbSpacer00);
		
		for(int i = 0; i < days.length; i++) {
			DayPan.add(new FLabel(days[i]));
			JPanel FcbSpacer0 = new JPanel();
			FcbSpacer0.setPreferredSize(new Dimension(100, 23));
			FcbSpacer0.setBackground(Color.LIGHT_GRAY);
			DayPan.add(FcbSpacer0);
		}
		
		JPanel OpenTimeSpacePan4 = new JPanel();
		OpenTimeSpacePan4.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan4.setPreferredSize(new Dimension(20, 10));
		OpenTimePan.add(OpenTimeSpacePan4);
		
		JPanel OpeningTimePan = new JPanel();
		OpeningTimePan.setBackground(Color.LIGHT_GRAY);
		OpeningTimePan.setPreferredSize(new Dimension(100, 365));
		OpenTimePan.add(OpeningTimePan);
		
		for(int i = 0; i < Fcb.length; i++) {
			Fcb[i] = new FHoursComboBox();
			Fcb[i].setEnabled(false);
			OpeningTimePan.add(Fcb[i]);
			JPanel FcbSpacer = new JPanel();
			FcbSpacer.setPreferredSize(new Dimension(100, 8));
			FcbSpacer.setBackground(Color.LIGHT_GRAY);
			OpeningTimePan.add(FcbSpacer);
		}
		
		JPanel OpenTimeSpacePan5 = new JPanel();
		OpenTimeSpacePan5.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan5.setPreferredSize(new Dimension(110, 10));
		OpenTimePan.add(OpenTimeSpacePan5);
		
		JPanel ClosingTimePan = new JPanel();
		ClosingTimePan.setBackground(Color.LIGHT_GRAY);
		ClosingTimePan.setPreferredSize(new Dimension(100, 365));
		OpenTimePan.add(ClosingTimePan);
		
		for(int i = 0; i < Fcb.length; i++) {
			Fcb[i] = new FHoursComboBox();
			Fcb[i].setEnabled(false);
			ClosingTimePan.add(Fcb[i]);
			JPanel FcbSpacer2 = new JPanel();
			FcbSpacer2.setPreferredSize(new Dimension(100, 8));
			FcbSpacer2.setBackground(Color.LIGHT_GRAY);
			ClosingTimePan.add(FcbSpacer2);
		}
		
		JPanel OpenTimeSpacePan6 = new JPanel();
		OpenTimeSpacePan6.setBackground(Color.LIGHT_GRAY);
		OpenTimeSpacePan6.setPreferredSize(new Dimension(50, 10));
		OpenTimePan.add(OpenTimeSpacePan6);
		
		JPanel ButtonPanel = new JPanel();
		ButtonPanel.setBackground(Color.LIGHT_GRAY);
		ButtonPanel.setPreferredSize(new Dimension(600, 40));
		InnerPan.add(ButtonPanel);
		
		BTNModifyAll = new FButton("Modify all the time at once");
		BTNModifyAll.setEnabled(false);
		BTNModifyAll.setPreferredSize(new Dimension(460, 30));
		ButtonPanel.add(BTNModifyAll);
		
		JPanel ButtonSpacerPan = new JPanel();
		ButtonSpacerPan.setBackground(Color.LIGHT_GRAY);
		ButtonSpacerPan.setPreferredSize(new Dimension(22, 10));
		ButtonPanel.add(ButtonSpacerPan);
		
		JPanel DeliveryPan = new JPanel();
		DeliveryPan.setBackground(Color.LIGHT_GRAY);
		DeliveryPan.setPreferredSize(new Dimension(600, 325));
		InnerPan.add(DeliveryPan);
		
		FLabel lblNewLabel = new FLabel("Delivery Area");
		DeliveryPan.add(lblNewLabel);
		
		JPanel DeliverySpacePan = new JPanel();
		DeliverySpacePan.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBorder(new LineBorder(Color.GRAY));
		textArea.setPreferredSize(new Dimension(460, 125));
		DeliveryPan.add(textArea);
		
		JPanel JTASpacePan2 = new JPanel();
		JTASpacePan2.setBackground(Color.LIGHT_GRAY);
		JTASpacePan2.setPreferredSize(new Dimension(22, 10));
		DeliveryPan.add(JTASpacePan2);
		
		JPanel DeliverySpacePan2 = new JPanel();
		DeliverySpacePan2.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan2.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan2);
		
		FLabel DeliveryAreaLbl = new FLabel("Delivery Area:");
		DeliveryAreaLbl.setPreferredSize(new Dimension(80, 14));
		DeliveryPan.add(DeliveryAreaLbl);
		
		TFDeliveryArea = new FTextField(0);
		TFDeliveryArea.setEnabled(false);
		TFDeliveryArea.setPreferredSize(new Dimension(30, 18));
		DeliveryPan.add(TFDeliveryArea);
		
		BTNAddDeliveryArea = new FButton("Add Delivery Area");
		BTNAddDeliveryArea.setEnabled(false);
		BTNAddDeliveryArea.setPreferredSize(new Dimension(150, 28));
		DeliveryPan.add(BTNAddDeliveryArea);
		
		JPanel DeliverySpacePan3 = new JPanel();
		DeliverySpacePan3.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan3.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan3);
		
		BTNDeleteDeliveryArea = new FButton("Delete Delivery Area");
		BTNDeleteDeliveryArea.setEnabled(false);
		BTNDeleteDeliveryArea.setPreferredSize(new Dimension(150, 28));
		DeliveryPan.add(BTNDeleteDeliveryArea);
		
		JPanel DeliverySpacePan4 = new JPanel();
		DeliverySpacePan4.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan4.setPreferredSize(new Dimension(600, 2));
		DeliveryPan.add(DeliverySpacePan4);
		
		JPanel DeliverySpacePan5 = new JPanel();
		DeliverySpacePan5.setPreferredSize(new Dimension(115, 2));
		DeliverySpacePan5.setBackground(Color.LIGHT_GRAY);
		DeliveryPan.add(DeliverySpacePan5);
		
		BTNDeliveryRestaurantDelete = new FButton("Delete");
		BTNDeliveryRestaurantDelete.setPreferredSize(new Dimension(150, 28));
		DeliveryPan.add(BTNDeliveryRestaurantDelete);

		JPanel RestaurantListSpacerPan = new JPanel();
		RestaurantListSpacerPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(RestaurantListSpacerPan);
		RestaurantListSpacerPan.setPreferredSize(new Dimension(125, 970));

		
		repaint();
		revalidate();
		
	}
	
}
