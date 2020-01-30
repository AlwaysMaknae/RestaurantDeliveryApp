package Form.Login;

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
import utils.*;

public class FLoginView extends FForm{
	
	protected FTextField TFUsername;
	protected FTextField TFPassword;
	
	protected JButton BTNConnect, BTNClientNew, BTNQuit;
	
	public FLoginView(){
		
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
		
		FLabel LoginTitleLbl = new FLabel("Delivery System");
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
		
		FLabel UsernameLbl = new FLabel("Username:");
		LoginPan.add(UsernameLbl);
		
		TFUsername = new FTextField(20);
		TFUsername.setPreferredSize(new Dimension(200, 18));
		LoginPan.add(TFUsername);
		
		JPanel LoginSpacePan = new JPanel();
		LoginSpacePan.setBackground(Color.WHITE);
		LoginSpacePan.setPreferredSize(new Dimension(500, 5));
		LoginPan.add(LoginSpacePan);
		
		FLabel PasswordLbl = new FLabel("Password:");
		LoginPan.add(PasswordLbl);
		
		TFPassword = new FTextField(20);
		TFPassword.setPreferredSize(new Dimension(200, 18));
		LoginPan.add(TFPassword);
		
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
		
		BTNConnect = new JButton("Connect");
		BTNConnect.setPreferredSize(new Dimension(90, 28));
		BotPan.add(BTNConnect);
		
		BTNClientNew = new JButton("New Clients");
		BTNClientNew.setPreferredSize(new Dimension(120, 28));
		BotPan.add(BTNClientNew);
		
		BTNQuit = new JButton("Quit");
		BTNQuit.setPreferredSize(new Dimension(60, 28));
		BotPan.add(BTNQuit);
		
		repaint();
		revalidate();
	}

}
