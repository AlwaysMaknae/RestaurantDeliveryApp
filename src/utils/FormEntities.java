package utils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

public class FormEntities extends JFrame {
	
	public FormEntities() {
		this.setTitle("Dental Staffing Application");
		this.setSize(984,1010);
		this.setResizable(false);

		//--Main Panel
		JPanel pan = new JPanel();
		pan.setLayout( new FlowLayout(FlowLayout.LEADING));
		pan.setBackground(Color.WHITE);
		
		this.setContentPane(pan);
		this.setLocationRelativeTo(null);  //place frame in the middle of screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application when frame closes
		this.setVisible(true); //display frame
	}
	
	class FormLine extends JPanel{
		public FormLine() {
			this.setLayout(new FlowLayout(FlowLayout.LEFT));
			this.setBackground(Color.WHITE);
		}
	}
	
	class HorizontalRule extends JPanel{
		public HorizontalRule(int width, int strut){
			this.setPreferredSize( new Dimension(width,1));
			this.setLayout( new BoxLayout(this, BoxLayout.LINE_AXIS));
			this.add( new JSeparator(SwingConstants.HORIZONTAL) );
			this.add(Box.createHorizontalStrut(strut));
			this.setBorder( BorderFactory.createLineBorder(Color.DARK_GRAY, 4));
		}
	}
	
	class DentalCheckBox extends JCheckBox{
		public DentalCheckBox(String text){
			this.setText(text);
			this.setBackground(Color.WHITE);
			
		}
	}
	
	class YesNoRadio extends JPanel{
		public ButtonGroup RadioGroup;
		public JRadioButton YesBtn;
		
		public YesNoRadio(){
			this.setBackground(Color.WHITE);
			RadioGroup = new ButtonGroup();
			YesBtn = new JRadioButton("Yes");
			YesBtn.setBackground(Color.WHITE);
			JRadioButton No = new JRadioButton("No");
			No.setBackground(Color.WHITE);
			RadioGroup.add(YesBtn);
			RadioGroup.add(No);
			this.add(YesBtn);
			this.add(No);
		}
		
		public Boolean Reponse(){
			
			return YesBtn.isSelected();
		}
		public String Awnser() {
			return this.Reponse() ? "Yes" : "No";
		}
	}
	
	
	

}