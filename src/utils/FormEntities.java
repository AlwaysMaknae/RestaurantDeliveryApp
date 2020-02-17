package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class FormEntities extends FForm {
	
	public FormEntities() {

		this.setTitle("Entities Testing Playground");
		this.setSize(800,600);
		this.setResizable(false);

		//--Main Panel
		JPanel pan = new JPanel();
		pan.setLayout( new FlowLayout(FlowLayout.LEADING));
		pan.setBackground(Color.WHITE);
		
		FButton testBtn = new FButton("This is a Test");
		pan.add(testBtn);
		FButton testBtn2 = new FButton("This is a Test");
		pan.add(testBtn2);
		FButton testBtn3 = new FButton("This is a Test");
		pan.add(testBtn3);
		FButton testBtn4 = new FButton("This is a Test");
		pan.add(testBtn4);
		
		testBtn2.SetType("Danger");
		testBtn3.SetType("Warning");
		testBtn4.SetType("Good");
		
		
		FTextField ttx = new FTextField(20);
		//ttx.SetInteger();
		//ttx.SetStringLength(5);
		pan.add(ttx);
		
		
		ArrayList<Object> test = new ArrayList<Object>();
		test.add("Orange");
		test.add("Banana");
		test.add("Cherry");
		test.add("Watermelon");
		test.add("Zinc");
		
		FListView FLV = new FListView(test);
		pan.add(FLV);
		FLV.setListScrollerDimension( new Dimension(100,75));
		
		testBtn.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ttx.IsValid() + ":" + ttx.GetContent());
			}
		});
		
		

		
		FHoursComboBox hhh = new FHoursComboBox(11);
		pan.add(hhh);
		hhh.setSelectedFromText("20:00");
		LocalTime ll = LocalTime.of(Integer.parseInt(hhh.getSelectedItem().toString().substring(0, 2)), 00);
		LocalTime l2 = LocalTime.parse((CharSequence) hhh.getSelectedItem());
		System.out.println(l2);
		
		
		this.setContentPane(pan);
		this.setVisible(true); //display frame
	}
	
	@Override
	public void windowClosing(WindowEvent e) {}
	
	
	
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
		
		public boolean Reponse(){
			return YesBtn.isSelected();
		}
		public String Answer() {
			return this.Reponse() ? "Yes" : "No";
		}
	}
	
	
	

}
