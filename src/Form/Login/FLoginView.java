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
	
	protected FButton BTNConnect, BTNClientNew, BTNQuit;
	
	public FLoginView(){
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("User Authentification");
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.LIGHT_GRAY);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		MainPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel TitlePan = new JPanel();
		MainPan.add(TitlePan);
		TitlePan.setBackground(Color.LIGHT_GRAY);
		TitlePan.setPreferredSize(new Dimension(975, 200));
		
		FLabel LoginTitleLbl = new FLabel("Delivery System");
		TitlePan.add(LoginTitleLbl);
		
		JPanel InfoPan = new JPanel();
		InfoPan.setBackground(Color.LIGHT_GRAY);
		InfoPan.setPreferredSize(new Dimension(975, 265));
		MainPan.add(InfoPan);
		InfoPan.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		JPanel LoginPan = new JPanel();
		LoginPan.setBackground(Color.LIGHT_GRAY);
		LoginPan.setPreferredSize(new Dimension(350, 100));
		InfoPan.add(LoginPan);
		LoginPan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		FLabel UsernameLbl = new FLabel("Username:");
		LoginPan.add(UsernameLbl);
		
		TFUsername = new FTextField(20);
		TFUsername.setPreferredSize(new Dimension(200, 18));
		LoginPan.add(TFUsername);
		
		JPanel LoginSpacePan = new JPanel();
		LoginSpacePan.setBackground(Color.LIGHT_GRAY);
		LoginSpacePan.setPreferredSize(new Dimension(500, 5));
		LoginPan.add(LoginSpacePan);
		
		FLabel PasswordLbl = new FLabel("Password:");
		LoginPan.add(PasswordLbl);
		
		TFPassword = new FTextField(20);
		TFPassword.setPreferredSize(new Dimension(200, 18));
		LoginPan.add(TFPassword);
		
		JPanel ButtonPan = new JPanel();
		FlowLayout fl_ButtonPan = (FlowLayout) ButtonPan.getLayout();
		fl_ButtonPan.setAlignment(FlowLayout.RIGHT);
		ButtonPan.setPreferredSize(new Dimension(800, 60));
		ButtonPan.setBackground(Color.LIGHT_GRAY);
		MainPan.add(ButtonPan);
		
		JPanel ButtonSpacePan = new JPanel();
		ButtonSpacePan.setBackground(Color.LIGHT_GRAY);
		ButtonSpacePan.setPreferredSize(new Dimension(975, 20));
		ButtonPan.add(ButtonSpacePan);
		
		BTNConnect = new FButton("Connect");
		BTNConnect.setPreferredSize(new Dimension(90, 28));
		ButtonPan.add(BTNConnect);
		
		BTNClientNew = new FButton("New Clients");
		BTNClientNew.setPreferredSize(new Dimension(120, 28));
		ButtonPan.add(BTNClientNew);
		
		BTNQuit = new FButton("Quit");
		BTNQuit.setPreferredSize(new Dimension(60, 28));
		ButtonPan.add(BTNQuit);
		
		repaint();
		revalidate();
	}

}
