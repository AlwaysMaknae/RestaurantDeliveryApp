package View;

import java.util.Observable;
import java.util.Observer;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import utils.FForm;

import java.awt.Font;
import javax.swing.JTextField;

public class FLoginPage extends FForm implements Observer{
	
	private JTextField UsernameTF;
	private JTextField PasswordTF;
	
	public FLoginPage(){
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("User Authentification");
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.WHITE);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel TopPan = new JPanel();
		MainPan.add(TopPan);
		TopPan.setBackground(Color.WHITE);
		TopPan.setPreferredSize(new Dimension(975, 300));
		
		JLabel LoginTitleLbl = new JLabel("Delivery System");
		LoginTitleLbl.setFont(new Font("Tahoma", Font.BOLD, 40));
		LoginTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		LoginTitleLbl.setPreferredSize(new Dimension(350, 45));
		LoginTitleLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		TopPan.add(LoginTitleLbl);
		
		JPanel CenterPan = new JPanel();
		CenterPan.setBackground(Color.WHITE);
		CenterPan.setPreferredSize(new Dimension(975, 600));
		MainPan.add(CenterPan);
		CenterPan.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel SpacePan = new JPanel();
		SpacePan.setBackground(Color.WHITE);
		SpacePan.setPreferredSize(new Dimension(975, 150));
		CenterPan.add(SpacePan);
		SpacePan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel LoginPan = new JPanel();
		LoginPan.setBackground(Color.WHITE);
		LoginPan.setPreferredSize(new Dimension(350, 100));
		CenterPan.add(LoginPan);
		LoginPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel UsernameLbl = new JLabel("Username:");
		UsernameLbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		UsernameLbl.setPreferredSize(new Dimension(61, 14));
		LoginPan.add(UsernameLbl);
		
		UsernameTF = new JTextField();
		UsernameTF.setPreferredSize(new Dimension(200, 18));
		LoginPan.add(UsernameTF);
		
		JPanel LoginSpacePan = new JPanel();
		LoginSpacePan.setBackground(Color.WHITE);
		LoginSpacePan.setPreferredSize(new Dimension(500, 5));
		LoginPan.add(LoginSpacePan);
		
		JLabel PasswordLbl = new JLabel("Password:");
		PasswordLbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		PasswordLbl.setPreferredSize(new Dimension(60, 14));
		LoginPan.add(PasswordLbl);
		
		PasswordTF = new JTextField();
		PasswordTF.setPreferredSize(new Dimension(200, 18));
		LoginPan.add(PasswordTF);
		
		JPanel BotPan = new JPanel();
		BotPan.setPreferredSize(new Dimension(975, 60));
		BotPan.setBackground(Color.WHITE);
		MainPan.add(BotPan);
		
		JPanel BotSpacePan = new JPanel();
		BotSpacePan.setBackground(Color.WHITE);
		BotSpacePan.setPreferredSize(new Dimension(975, 20));
		BotPan.add(BotSpacePan);
		
		JPanel BotSpacePan2 = new JPanel();
		BotSpacePan2.setBackground(Color.WHITE);
		BotSpacePan2.setPreferredSize(new Dimension(680, 10));
		BotPan.add(BotSpacePan2);
		
		JButton BTNConnect = new JButton("Connect");
		BTNConnect.setPreferredSize(new Dimension(90, 28));
		BotPan.add(BTNConnect);
		
		JButton BTNClientNew = new JButton("New Clients");
		BTNClientNew.setPreferredSize(new Dimension(120, 28));
		BotPan.add(BTNClientNew);
		
		JButton BTNQuit = new JButton("Quit");
		BTNQuit.setPreferredSize(new Dimension(60, 28));
		BotPan.add(BTNQuit);
		
		repaint();
		revalidate();
	}
	
	public void update(Observable o, Object arg) {
		
		
	}

}
