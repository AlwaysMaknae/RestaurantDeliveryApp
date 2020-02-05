package Form.AddClient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import utils.FForm;
import utils.FLabel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FAddClientPage extends FForm{
	
	protected JTextField TFNewUsername, TFNewPassword, TFConfirmPass, TFLastName, TFFirstName, TFAddress, TFEmail;
	protected JTextField TFPhoneNum_1, TFPhoneNum_2, TFPhoneNum_3;
	
	protected JButton BTNSave;
	
	
	public FAddClientPage() {
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("New Client Account");
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel TitlePan = new JPanel();
		MainPan.add(TitlePan);
		TitlePan.setBackground(Color.LIGHT_GRAY);
		TitlePan.setPreferredSize(new Dimension(975, 300));
		
		FLabel LoginTitleLbl = new FLabel("Open New Account");
		TitlePan.add(LoginTitleLbl);
		
		JPanel AccountDetailsPan = new JPanel();
		AccountDetailsPan.setBackground(Color.LIGHT_GRAY);
		AccountDetailsPan.setPreferredSize(new Dimension(975, 600));
		MainPan.add(AccountDetailsPan);
		AccountDetailsPan.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel CreateAccountPan = new JPanel();
		CreateAccountPan.setPreferredSize(new Dimension(650, 500));
		CreateAccountPan.setBackground(Color.LIGHT_GRAY);
		AccountDetailsPan.add(CreateAccountPan);
		
		JPanel SpacePan0 = new JPanel();
		SpacePan0.setBackground(Color.LIGHT_GRAY);
		SpacePan0.setPreferredSize(new Dimension(105, 10));
		CreateAccountPan.add(SpacePan0);
		
		FLabel NewUsernameLbl = new FLabel("Username:");
		NewUsernameLbl.setHorizontalAlignment(SwingConstants.LEFT);
		NewUsernameLbl.setPreferredSize(new Dimension(125, 14));
		CreateAccountPan.add(NewUsernameLbl);
		
		TFNewUsername = new JTextField();
		TFNewUsername.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFNewUsername);
		
		JPanel SpacePan1 = new JPanel();
		SpacePan1.setBackground(Color.LIGHT_GRAY);
		SpacePan1.setPreferredSize(new Dimension(30, 10));
		CreateAccountPan.add(SpacePan1);
		
		JButton BTNVerify = new JButton("Verify");
		BTNVerify.setPreferredSize(new Dimension(70, 25));
		CreateAccountPan.add(BTNVerify);
		
		JPanel SpacePan2 = new JPanel();
		SpacePan2.setBackground(Color.LIGHT_GRAY);
		SpacePan2.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan2);
		
		FLabel NewPasswordLbl = new FLabel("Password:");
		NewPasswordLbl.setPreferredSize(new Dimension(125, 14));
		NewPasswordLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(NewPasswordLbl);
		
		TFNewPassword = new JTextField();
		TFNewPassword.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFNewPassword);
		
		JPanel SpacePan3 = new JPanel();
		SpacePan3.setBackground(Color.LIGHT_GRAY);
		SpacePan3.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan3);
		
		FLabel NewConfirmPassLbl = new FLabel("Confirm Password:");
		NewConfirmPassLbl.setPreferredSize(new Dimension(125, 14));
		NewConfirmPassLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(NewConfirmPassLbl);
		
		TFConfirmPass = new JTextField();
		TFConfirmPass.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFConfirmPass);
		
		JPanel SpacePan4 = new JPanel();
		SpacePan4.setBackground(Color.LIGHT_GRAY);
		SpacePan4.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan4);
		
		FLabel LastNameLbl = new FLabel("Last Name:");
		LastNameLbl.setPreferredSize(new Dimension(125, 14));
		LastNameLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(LastNameLbl);
		
		TFLastName = new JTextField();
		TFLastName.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFLastName);
		
		JPanel SpacePan5 = new JPanel();
		SpacePan5.setBackground(Color.LIGHT_GRAY);
		CreateAccountPan.add(SpacePan5);
		SpacePan5.setPreferredSize(new Dimension(600, 15));
		
		FLabel FirstNameLbl = new FLabel("First Name:");
		FirstNameLbl.setPreferredSize(new Dimension(125, 14));
		FirstNameLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(FirstNameLbl);
		
		TFFirstName = new JTextField();
		TFFirstName.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFFirstName);
		
		JPanel SpacePan6 = new JPanel();
		SpacePan6.setBackground(Color.LIGHT_GRAY);
		SpacePan6.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan6);
		
		FLabel AddressLbl = new FLabel("Address:");
		AddressLbl.setPreferredSize(new Dimension(125, 14));
		AddressLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(AddressLbl);
		
		TFAddress = new JTextField();
		TFAddress.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFAddress);
		
		JPanel SpacePan7 = new JPanel();
		SpacePan7.setBackground(Color.LIGHT_GRAY);
		SpacePan7.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan7);
		
		FLabel EmailLbl = new FLabel("Email:");
		EmailLbl.setPreferredSize(new Dimension(125, 14));
		EmailLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(EmailLbl);
		
		TFEmail = new JTextField();
		TFEmail.setPreferredSize(new Dimension(250, 18));
		CreateAccountPan.add(TFEmail);
		
		JPanel SpacePan8 = new JPanel();
		SpacePan8.setBackground(Color.LIGHT_GRAY);
		SpacePan8.setPreferredSize(new Dimension(600, 15));
		CreateAccountPan.add(SpacePan8);
		
		FLabel PhoneNumLbl = new FLabel("Phone Number:");
		PhoneNumLbl.setPreferredSize(new Dimension(125, 14));
		PhoneNumLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(PhoneNumLbl);
		
		JLabel BracketLbl = new JLabel("(");
		BracketLbl.setPreferredSize(new Dimension(5, 14));
		BracketLbl.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(BracketLbl);
		
		TFPhoneNum_1 = new JTextField();
		TFPhoneNum_1.setPreferredSize(new Dimension(25, 18));
		CreateAccountPan.add(TFPhoneNum_1);
		
		JLabel BracketLbl2 = new JLabel(")");
		BracketLbl2.setPreferredSize(new Dimension(5, 14));
		BracketLbl2.setHorizontalAlignment(SwingConstants.LEFT);
		CreateAccountPan.add(BracketLbl2);
		
		TFPhoneNum_2 = new JTextField();
		TFPhoneNum_2.setPreferredSize(new Dimension(25, 18));
		CreateAccountPan.add(TFPhoneNum_2);
		
		JPanel SpacePan9 = new JPanel();
		SpacePan9.setBackground(Color.LIGHT_GRAY);
		SpacePan9.setPreferredSize(new Dimension(5, 15));
		CreateAccountPan.add(SpacePan9);
		
		TFPhoneNum_3 = new JTextField();
		TFPhoneNum_3.setPreferredSize(new Dimension(30, 18));
		CreateAccountPan.add(TFPhoneNum_3);
		
		JPanel SpacePan10 = new JPanel();
		SpacePan10.setBackground(Color.LIGHT_GRAY);
		SpacePan10.setPreferredSize(new Dimension(125, 15));
		CreateAccountPan.add(SpacePan10);
		
		JPanel ButtonPan = new JPanel();
		FlowLayout flowLayout = (FlowLayout) ButtonPan.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		ButtonPan.setPreferredSize(new Dimension(975, 60));
		ButtonPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(ButtonPan);
		
		JPanel SpacePan11 = new JPanel();
		SpacePan11.setBackground(Color.LIGHT_GRAY);
		SpacePan11.setPreferredSize(new Dimension(900, 15));
		ButtonPan.add(SpacePan11);
		
		BTNSave = new JButton("Save");
		BTNSave.setPreferredSize(new Dimension(89, 28));
		ButtonPan.add(BTNSave);
		
		JButton BTNReturn = new JButton("Return");
		BTNReturn.setPreferredSize(new Dimension(89, 28));
		ButtonPan.add(BTNReturn);
		
		JButton BTNQuit = new JButton("Quit");
		BTNQuit.setPreferredSize(new Dimension(89, 28));
		ButtonPan.add(BTNQuit);
		
		repaint();
		revalidate();
	}
}
