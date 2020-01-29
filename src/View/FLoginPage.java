package utils;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;

public class FLoginPage extends FForm implements Observer{

//	JFrame fl1;
	
	public FLoginPage(){
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel MainPan = new JPanel();
		MainPan.setBackground(Color.WHITE);
		MainPan.setPreferredSize(new Dimension(975, 975));
		getContentPane().add(MainPan);
		
		JPanel panel = new JPanel();
		MainPan.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		MainPan.add(btnNewButton);
		
//		fl1 = new FForm();
		setTitle("Login");
//		fl1.setVisible(true);
		
		
		
		
	}
	
	public void update(Observable o, Object arg) {
		
		
	}

}
