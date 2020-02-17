package Form.Deliverers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import utils.FButton;
import utils.FForm;
import utils.FLabel;
import utils.FListView;
import utils.FTextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class FAddDelivererPage extends FForm{
	
	protected FTextField TFName, TFDeliveryArea, TFNewUsername;
	protected JPasswordField TFPassword, TFConfirmPass;
	protected FTextField TFPhoneNum_1, TFPhoneNum_2, TFPhoneNum_3;
	
	protected FListView JTADeliveryArea;
	
	protected FButton BTNAddDeliveryArea, BTNDeleteDeliveryArea, BTNSaveDeliveryArea, BTNVerify;

	public FAddDelivererPage() {
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel TitlePan = new JPanel();
		TitlePan.setBackground(Color.LIGHT_GRAY);
		TitlePan.setPreferredSize(new Dimension(425, 35));
		MainPan.add(TitlePan);
		
		JPanel TitleSpacePan = new JPanel();
		TitleSpacePan.setBackground(Color.LIGHT_GRAY);
		TitleSpacePan.setPreferredSize(new Dimension(425, 1));
		TitlePan.add(TitleSpacePan);
		
		FLabel TitleLbl = new FLabel("Add new Delivery Man");
		TitlePan.add(TitleLbl);
		
		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(975, 1));
		MainPan.add(SpacePan0);
		
		JPanel InfoPan = new JPanel();
		InfoPan.setBackground(Color.LIGHT_GRAY);
		InfoPan.setPreferredSize(new Dimension(500, 140));
		MainPan.add(InfoPan);
		
		FLabel NameLbl = new FLabel("Name:");
		NameLbl.setPreferredSize(new Dimension(110, 14));
		InfoPan.add(NameLbl);
		
		TFName = new FTextField(0);
		TFName.setPreferredSize(new Dimension(285, 20));
		InfoPan.add(TFName);
		
		FLabel Usernamelbl = new FLabel("Username:");
		Usernamelbl.setPreferredSize(new Dimension(110, 14));
		InfoPan.add(Usernamelbl);
		
		TFNewUsername = new FTextField(0);
		TFNewUsername.setPreferredSize(new Dimension(210, 20));
		InfoPan.add(TFNewUsername);
		
		BTNVerify = new FButton("Verify");
		BTNVerify.setPreferredSize(new Dimension(70, 25));
		InfoPan.add(BTNVerify);
		
		FLabel Passwordlbl = new FLabel("Password:");
		Passwordlbl.setPreferredSize(new Dimension(110, 14));
		InfoPan.add(Passwordlbl);
		
		TFPassword = new JPasswordField(0);
		TFPassword.setPreferredSize(new Dimension(285, 20));
		InfoPan.add(TFPassword);
		
		FLabel CPasswordlbl = new FLabel("Confirm Password:");
		CPasswordlbl.setPreferredSize(new Dimension(110, 14));
		InfoPan.add(CPasswordlbl);
		
		TFConfirmPass = new JPasswordField(0);
		TFConfirmPass.setPreferredSize(new Dimension(285, 20));
		InfoPan.add(TFConfirmPass);
		
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
		
		TFPhoneNum_1 = new FTextField(0);
		TFPhoneNum_1.setPreferredSize(new Dimension(25, 18));
		InfoPan.add(TFPhoneNum_1);
		
		FLabel BracketLbl2 = new FLabel(")");
		BracketLbl2.setPreferredSize(new Dimension(5, 14));
		BracketLbl2.setHorizontalAlignment(SwingConstants.LEFT);
		InfoPan.add(BracketLbl2);
		
		TFPhoneNum_2 = new FTextField(0);
		TFPhoneNum_2.setPreferredSize(new Dimension(25, 18));
		InfoPan.add(TFPhoneNum_2);
		
		JPanel InfoSpacePan2 = new JPanel();
		InfoSpacePan2.setBackground(Color.LIGHT_GRAY);
		InfoSpacePan2.setPreferredSize(new Dimension(5, 15));
		InfoPan.add(InfoSpacePan2);
		
		TFPhoneNum_3 = new FTextField(0);
		TFPhoneNum_3.setPreferredSize(new Dimension(30, 18));
		InfoPan.add(TFPhoneNum_3);
		
		JPanel InfoSpacePan3 = new JPanel();
		InfoSpacePan3.setPreferredSize(new Dimension(160, 5));
		InfoSpacePan3.setBackground(Color.LIGHT_GRAY);
		InfoPan.add(InfoSpacePan3);
		
		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(975, 1));
		MainPan.add(SpacePan1);
		
		JPanel DeliveryInfoPan = new JPanel();
		DeliveryInfoPan.setBackground(Color.LIGHT_GRAY);
		DeliveryInfoPan.setPreferredSize(new Dimension(425, 440));
		MainPan.add(DeliveryInfoPan);
		
		FLabel DeliveryAreaTitleLbl = new FLabel("Delivery Area");
		DeliveryInfoPan.add(DeliveryAreaTitleLbl);
		
		JPanel DeliveryInfoSpacePan = new JPanel();
		DeliveryInfoSpacePan.setBackground(Color.LIGHT_GRAY);
		DeliveryInfoSpacePan.setPreferredSize(new Dimension(425, 1));
		DeliveryInfoPan.add(DeliveryInfoSpacePan);
		
		JTADeliveryArea = new FListView();
		JTADeliveryArea.setPreferredSize(new Dimension(400, 100));
		JTADeliveryArea.setBorder(new LineBorder(new Color(128, 128, 128)));
		JTADeliveryArea.setEnabled(false);
		DeliveryInfoPan.add(JTADeliveryArea);
		
		JPanel DeliverySpacePan2 = new JPanel();
		DeliverySpacePan2.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan2.setPreferredSize(new Dimension(600, 2));
		DeliveryInfoPan.add(DeliverySpacePan2);
		
		FLabel DeliveryAreaLbl = new FLabel("Delivery Area:");
		DeliveryAreaLbl.setPreferredSize(new Dimension(80, 14));
		DeliveryInfoPan.add(DeliveryAreaLbl);
		
		TFDeliveryArea = new FTextField(0);
		TFDeliveryArea.setPreferredSize(new Dimension(30, 18));
		DeliveryInfoPan.add(TFDeliveryArea);
		
		BTNAddDeliveryArea = new FButton("Add Delivery Area");
		BTNAddDeliveryArea.setPreferredSize(new Dimension(150, 28));
		DeliveryInfoPan.add(BTNAddDeliveryArea);
		
		JPanel DeliverySpacePan3 = new JPanel();
		DeliverySpacePan3.setBackground(Color.LIGHT_GRAY);
		DeliverySpacePan3.setPreferredSize(new Dimension(600, 2));
		DeliveryInfoPan.add(DeliverySpacePan3);
		
		BTNDeleteDeliveryArea = new FButton("Delete Delivery Area");
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
		
		BTNSaveDeliveryArea = new FButton("Save");
		BTNSaveDeliveryArea.setPreferredSize(new Dimension(80, 28));
		DeliveryInfoPan.add(BTNSaveDeliveryArea);

		repaint();
		revalidate();
		
	}
	
}
