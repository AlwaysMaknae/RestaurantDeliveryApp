package Form.Client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import utils.FButton;
import utils.FForm;
import utils.FLabel;
import utils.FTextField;

public class FEditAccountPage extends FForm{

	protected FTextField TFNewUsername, TFOldPassword, TFNewPassword, TFConfirmPass, TFLastName, TFFirstName, TFAddress, TFEmail;
	protected FTextField TFPhoneNum_1, TFPhoneNum_2, TFPhoneNum_3;
	
	protected FButton BTNVerify, BTNSave;
	
	public FEditAccountPage() {
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Service");
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel TopPan = new JPanel();
		MainPan.add(TopPan);
		TopPan.setBackground(Color.LIGHT_GRAY);
		TopPan.setPreferredSize(new Dimension(975, 30));
		
		FLabel EditAccountLbl = new FLabel("Open New Account");
		EditAccountLbl.setText("Edit Account");
		TopPan.add(EditAccountLbl);
		
		JPanel CenterPan = new JPanel();
		CenterPan.setBackground(Color.LIGHT_GRAY);
		CenterPan.setPreferredSize(new Dimension(975, 380));
		MainPan.add(CenterPan);
		CenterPan.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel CreateAccountPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) CreateAccountPan.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		CreateAccountPan.setPreferredSize(new Dimension(650, 375));
		CreateAccountPan.setBackground(Color.LIGHT_GRAY);
		CenterPan.add(CreateAccountPan);
		
		JPanel LabelSpacePan0 = new JPanel();
		LabelSpacePan0.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan0.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan0);
		
		FLabel NewUsernameLbl = new FLabel("Username:");
		NewUsernameLbl.setHorizontalAlignment(SwingConstants.LEFT);
		NewUsernameLbl.setPreferredSize(new Dimension(125, 14));
		CreateAccountPan.add(NewUsernameLbl);
		
		JPanel TextFieldSpacePan0 = new JPanel();
		TextFieldSpacePan0.setBackground(Color.LIGHT_GRAY);
		TextFieldSpacePan0.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSpacePan0);
		
		TFNewUsername = new FTextField(0);
		TFNewUsername.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFNewUsername);
		
		BTNVerify = new FButton("Verify");
		BTNVerify.setPreferredSize(new Dimension(70, 25));
		CreateAccountPan.add(BTNVerify);
		
		JPanel SpacePan2 = new JPanel();
		SpacePan2.setBackground(Color.LIGHT_GRAY);
		SpacePan2.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan2);
		
		JPanel LabelSpacePan1 = new JPanel();
		LabelSpacePan1.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan1.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan1);
		
		FLabel OldPasswordLbl = new FLabel("Password:");
		OldPasswordLbl.setText("Old Password:");
		OldPasswordLbl.setPreferredSize(new Dimension(125, 14));
		OldPasswordLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(OldPasswordLbl);
		
		JPanel TextFieldSpacePan1 = new JPanel();
		TextFieldSpacePan1.setBackground(Color.LIGHT_GRAY);
		TextFieldSpacePan1.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSpacePan1);
		
		TFOldPassword = new FTextField(0);
		TFOldPassword.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFOldPassword);
		
		JPanel SpacePan3 = new JPanel();
		SpacePan3.setBackground(Color.LIGHT_GRAY);
		SpacePan3.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan3);
		
		JPanel LabelSpacePan2 = new JPanel();
		LabelSpacePan2.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan2.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan2);
		
		FLabel NewPasswordLbl = new FLabel("Password:");
		NewPasswordLbl.setText("New Password:");
		NewPasswordLbl.setPreferredSize(new Dimension(125, 14));
		NewPasswordLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(NewPasswordLbl);
		
		JPanel TextFieldSPacePan3 = new JPanel();
		TextFieldSPacePan3.setBackground(Color.LIGHT_GRAY);
		TextFieldSPacePan3.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSPacePan3);
		
		TFNewPassword = new FTextField(0);
		TFNewPassword.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFNewPassword);
		
		JPanel SpacePan33 = new JPanel();
		SpacePan33.setPreferredSize(new Dimension(600, 15));
		SpacePan33.setBackground(Color.LIGHT_GRAY);
		CreateAccountPan.add(SpacePan33);
		
		JPanel LabelSpacePan3 = new JPanel();
		LabelSpacePan3.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan3.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan3);
		
		FLabel NewConfirmPassLbl = new FLabel("Confirm Password:");
		NewConfirmPassLbl.setText("Confirm New Password:");
		NewConfirmPassLbl.setPreferredSize(new Dimension(180, 14));
		NewConfirmPassLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(NewConfirmPassLbl);
		
		TFConfirmPass = new FTextField(0);
		TFConfirmPass.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFConfirmPass);
		
		JPanel SpacePan4 = new JPanel();
		SpacePan4.setBackground(Color.LIGHT_GRAY);
		SpacePan4.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan4);
		
		JPanel LabelSpacePan4 = new JPanel();
		LabelSpacePan4.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan4.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan4);
		
		FLabel LastNameLbl = new FLabel("Last Name:");
		LastNameLbl.setPreferredSize(new Dimension(125, 14));
		LastNameLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(LastNameLbl);
		
		JPanel TextFieldSpacePan5 = new JPanel();
		TextFieldSpacePan5.setBackground(Color.LIGHT_GRAY);
		TextFieldSpacePan5.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSpacePan5);
		
		TFLastName = new FTextField(0);
		TFLastName.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFLastName);
		
		JPanel SpacePan5 = new JPanel();
		SpacePan5.setBackground(Color.LIGHT_GRAY);
		CreateAccountPan.add(SpacePan5);
		SpacePan5.setPreferredSize(new Dimension(600, 15));
		
		JPanel LabelSpacePan5 = new JPanel();
		LabelSpacePan5.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan5.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan5);
		
		FLabel FirstNameLbl = new FLabel("First Name:");
		FirstNameLbl.setPreferredSize(new Dimension(125, 14));
		FirstNameLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(FirstNameLbl);
		
		JPanel TextFieldSpacePan6 = new JPanel();
		TextFieldSpacePan6.setBackground(Color.LIGHT_GRAY);
		TextFieldSpacePan6.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSpacePan6);
		
		TFFirstName = new FTextField(0);
		TFFirstName.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFFirstName);
		
		JPanel SpacePan6 = new JPanel();
		SpacePan6.setBackground(Color.LIGHT_GRAY);
		SpacePan6.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan6);
		
		JPanel LabelSpacePan6 = new JPanel();
		LabelSpacePan6.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan6.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan6);
		
		FLabel AddressLbl = new FLabel("Address:");
		AddressLbl.setPreferredSize(new Dimension(125, 14));
		AddressLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(AddressLbl);
		
		JPanel TextFieldSpacePan7 = new JPanel();
		TextFieldSpacePan7.setBackground(Color.LIGHT_GRAY);
		TextFieldSpacePan7.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSpacePan7);
		
		TFAddress = new FTextField(0);
		TFAddress.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFAddress);
		
		JPanel SpacePan7 = new JPanel();
		SpacePan7.setBackground(Color.LIGHT_GRAY);
		SpacePan7.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan7);
		
		JPanel LabelSpacePan7 = new JPanel();
		LabelSpacePan7.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan7.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan7);
		
		FLabel EmailLbl = new FLabel("Email:");
		EmailLbl.setPreferredSize(new Dimension(125, 14));
		EmailLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(EmailLbl);
		
		JPanel TextFieldSpacePan8 = new JPanel();
		TextFieldSpacePan8.setBackground(Color.LIGHT_GRAY);
		TextFieldSpacePan8.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSpacePan8);
		
		TFEmail = new FTextField(0);
		TFEmail.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFEmail);
		
		JPanel SpacePan8 = new JPanel();
		SpacePan8.setBackground(Color.LIGHT_GRAY);
		SpacePan8.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan8);
		
		JPanel LabelSpacePan8 = new JPanel();
		LabelSpacePan8.setBackground(Color.LIGHT_GRAY);
		LabelSpacePan8.setPreferredSize(new Dimension(100, 10));
		CreateAccountPan.add(LabelSpacePan8);
		
		FLabel PhoneNumLbl = new FLabel("Phone Number:");
		PhoneNumLbl.setPreferredSize(new Dimension(125, 14));
		PhoneNumLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(PhoneNumLbl);
		
		JPanel TextFieldSpacePan9 = new JPanel();
		TextFieldSpacePan9.setBackground(Color.LIGHT_GRAY);
		TextFieldSpacePan9.setPreferredSize(new Dimension(50, 10));
		CreateAccountPan.add(TextFieldSpacePan9);
		
		FLabel BracketLbl = new FLabel("(");
		BracketLbl.setPreferredSize(new Dimension(5, 14));
		BracketLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(BracketLbl);
		
		TFPhoneNum_1 = new FTextField(0);
		TFPhoneNum_1.setPreferredSize(new Dimension(25, 18));
		CreateAccountPan.add(TFPhoneNum_1);
		
		FLabel BracketLbl2 = new FLabel(")");
		BracketLbl2.setPreferredSize(new Dimension(5, 14));
		BracketLbl2.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(BracketLbl2);
		
		TFPhoneNum_2 = new FTextField(0);
		TFPhoneNum_2.setPreferredSize(new Dimension(25, 18));
		CreateAccountPan.add(TFPhoneNum_2);
		
		JPanel SpacePan9 = new JPanel();
		SpacePan9.setBackground(Color.LIGHT_GRAY);
		SpacePan9.setPreferredSize(new Dimension(5, 15));
		CreateAccountPan.add(SpacePan9);
		
		TFPhoneNum_3 = new FTextField(0);
		TFPhoneNum_3.setPreferredSize(new Dimension(30, 18));
		CreateAccountPan.add(TFPhoneNum_3);
		
		JPanel SpacePan10 = new JPanel();
		SpacePan10.setBackground(Color.LIGHT_GRAY);
		SpacePan10.setPreferredSize(new Dimension(125, 15));
		CreateAccountPan.add(SpacePan10);
		
		JPanel BotButtonPan = new JPanel();
		FlowLayout fl_BotButtonPan = (FlowLayout) BotButtonPan.getLayout();
		fl_BotButtonPan.setVgap(0);
		fl_BotButtonPan.setAlignment(FlowLayout.RIGHT);
		BotButtonPan.setPreferredSize(new Dimension(650, 30));
		BotButtonPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(BotButtonPan);
		
		BTNSave = new FButton("Save");
		BTNSave.setPreferredSize(new Dimension(90, 25));
		BotButtonPan.add(BTNSave);
		
		JPanel SpacePan11 = new JPanel();
		SpacePan11.setPreferredSize(new Dimension(25, 10));
		SpacePan11.setBackground(Color.LIGHT_GRAY);
		BotButtonPan.add(SpacePan11);
		
		repaint();
		revalidate();
		
		
	}
}
