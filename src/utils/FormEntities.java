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

public class FormEntities extends JFrame implements ActionListener {
	
	DentalTextField FName;
	DentalTextField LName;
	DentalTextField MName;
	
	DentalTextField Adress;
	
	DentalTextField PhoneHome;
	DentalTextField PhoneCell;
	
	DentalTextField SIN;
	DentalTextField DOB_M;
	DentalTextField DOB_D;
	DentalTextField DOB_Y;
	DentalTextField Email;
	
	
	DentalTextField Position;
	DentalTextField Salary;
	
	JCheckBox Time_Full;
	JCheckBox Time_Part;
	JCheckBox Time_Temp;
	JCheckBox Time_Perm;
	
	YesNoRadio Cert_Assis;
	YesNoRadio Cert_Hygen;
	
	DentalTextField WorkStart;
	DentalTextField DriverPermit;
	DentalTextField Transportation;
	DentalTextField Reference;
	
	
	String[] Days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	ArrayList<HoursComboBox> Times = new ArrayList<HoursComboBox>();
	
	String[] Regions = {"NYC", "Queens ", "Bronx", "Brooklyn", "Westchester", "State Island", "Nassau County", "Suffolk County", "New Jersey"};
	ArrayList<JCheckBox> RegionsCheck = new ArrayList<JCheckBox>();
	
	String[] rHeaders = {"High School", "Collage", "Business or Trade School", "Professional School"};
	String[] cHeaders = {"School Name", "Location(Mailing Address)", "Number of years completed", "Major & Degree"};
	ArrayList<DentalTextField> Education = new ArrayList<DentalTextField>();
	
	
	
	public FormEntities() {
		this.setTitle("Dental Staffing Application");
		this.setSize(984,1010);
		this.setResizable(false);
//		this.setAlwaysOnTop(true);
		
		 

		//--Main Panel
		JPanel pan = new JPanel();
		pan.setLayout( new FlowLayout(FlowLayout.LEADING));
		pan.setBackground(Color.WHITE);
		
		
		//--Title Line
		JPanel line = new JPanel();
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("ressources/title.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		line.add(picLabel);
		line.setBackground(Color.WHITE);
		pan.add(line);
		
		
		//--User Information
		
		//- Name
		line = new FormLine();
		line.add( new DentalLabel("Name:", true) );
		FName = new DentalTextField(15);
		LName = new DentalTextField(15);
		MName = new DentalTextField(15);
		line.add(FName);
		line.add(LName);
		line.add(MName);
		pan.add(line);
		
		
		//-- Address
		line = new FormLine();
		line.add( new DentalLabel("Adress: ", true));
		Adress =  new DentalTextField(70);
		line.add(Adress);
		pan.add(line);
		
		//Telephone
		 line = new FormLine();
		 line.add(new DentalLabel("Home Telephone :", true));
		 PhoneHome = new DentalTextField(20);
		 PhoneHome.SetMask("(###)###-####");
		 line.add(PhoneHome);
		 line.add( new DentalLabel("Cellular:"));
		 PhoneCell = new DentalTextField(20);
		 PhoneCell.SetMask("(###)###-####");
		 line.add(PhoneCell);
		 pan.add(line);
		 
		 //NAS
		 line = new FormLine();
		 line.add(new DentalLabel("Social Secutiry No.:", true));
		 SIN = new DentalTextField(20);
		 SIN.SetMask("### ### ###");
		 line.add(SIN);
		 
		 //DOB
		 line.add( new DentalLabel("D.O.B.:"));
		 DOB_D = new DentalTextField(5);
		 DOB_D.SetMask("##");
		 DOB_M = new DentalTextField(5);
		 DOB_M.SetMask("##");
		 DOB_Y = new DentalTextField(5);
		 DOB_Y.SetMask("####");
		 
		 line.add(DOB_D);
		 line.add( new DentalLabel("/"));
		 line.add(DOB_M);
		 line.add( new DentalLabel("/"));
		 line.add(DOB_Y);
		 
		 
		 //Email
		 line.add( new DentalLabel("Email:"));
		 Email = new DentalTextField(20);
		 line.add( Email );
		 pan.add(line);
		 
		 //Line
		pan.add(new HorizontalRule(955,500));

		//Weird Up Text
		line =  new FormLine();
		line.setPreferredSize( new Dimension(836, 24));
		line.setLayout( new BorderLayout() );
		JLabel tt =  new DentalLabel("Desired Employment(check all the apply):");
		line.add(tt, BorderLayout.LINE_END);
		pan.add(line);
		
		
		//Job Type
		line = new FormLine();
		line.add( new DentalLabel("Position Applied for:" , true));
		Position = new DentalTextField(15);
		line.add(Position);
		
		line.add( new DentalLabel("Desired Salary:"));
		Salary = new DentalTextField(15);
		Salary.SetDecimal();
		line.add(Salary);
		
		Time_Full = new DentalCheckBox("Full-Time");
		Time_Part = new DentalCheckBox("Part-Time");
		Time_Temp = new DentalCheckBox("Temporary");
		Time_Perm = new DentalCheckBox("Permanent");
		line.add(Time_Full);
		line.add(Time_Part);
		line.add(Time_Temp);
		line.add(Time_Perm);
		pan.add(line);
		
		
		line = new FormLine();
		line.add( new DentalLabel("Are you a Certified Dental Assistant? "));
		Cert_Assis = new YesNoRadio();
		line.add( Cert_Assis );
		line.add( new DentalLabel("(If yes, please provide a copy of your certificate.)"));
		line.setPreferredSize( new Dimension(948, 32));
		pan.add(line);
		
		line =  new FormLine();
		line.add( new DentalLabel("Are you a Certified Dental Hygienist? "));
		Cert_Hygen = new YesNoRadio();
		line.add( Cert_Hygen );
		line.add( new DentalLabel("(If yes, please provide a copy of your certificate.)"));
		line.setPreferredSize( new Dimension(948, 38));
		pan.add(line);
		
		//Days/Hours are you available to work:
		line = new FormLine();
		line.add( new DentalLabel("Days/Hours are you available to work:"));
		line.setPreferredSize( new Dimension(948, 32));
		pan.add(line);
		
		 //Line
		pan.add(new HorizontalRule(955,500));
		
		
		//Times
		line = new FormLine();
		line.setLayout( new FlowLayout(FlowLayout.LEFT));
		line.setPreferredSize( new Dimension(908,100));
		HoursComboBox h = new HoursComboBox();
		for (String day : Days) {
			line.add( new DentalLabel(day + ":") );
			h = new HoursComboBox();
			line.add(h);
			Times.add(h);
			line.add( new DentalLabel("-") );
			h = new HoursComboBox();
			Times.add(h);
			line.add( h );
		}
		
		pan.add(line);
		
		 //Line
		pan.add(new HorizontalRule(955,500));
		
		//Start And Driver
		line = new FormLine();
		line.add( new DentalLabel("When are you available to start work?"));
		WorkStart = new DentalTextField(15);
		WorkStart.SetMask("##/##/####");
		line.add(WorkStart);
		line.add( new DentalLabel("Do you have a Driver's license?"));
		DriverPermit = new DentalTextField(15);
		line.add(DriverPermit);
		pan.add(line);
		
		//Transportation
		line = new FormLine();
		line.add( new DentalLabel("What means of transportation do you use to commute to work?"));
		Transportation = new DentalTextField(15);
		line.add(Transportation);
		line.add( new DentalLabel("Who referred you to use?"));
		Reference = new DentalTextField(15);
		line.add(Reference);
		pan.add(line);
		
		
		 //Line
		pan.add(new HorizontalRule(955,500));
		
		line = new FormLine();
		line.add( new DentalLabel("What areas are you willing to commute to?"));
		line.setPreferredSize(new Dimension(948, 20));
		pan.add(line);
		
		line = new FormLine();
		JCheckBox k;
		for (String place : Regions) {
			k = new DentalCheckBox(place);
			RegionsCheck.add(k);
			line.add(k);
		}
		pan.add(line);
		
		 //Line
		pan.add(new HorizontalRule(955,500));
		
		
		line = new FormLine();
		line.setLayout( new GridLayout(5,5));
		line.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
		line.setPreferredSize( new Dimension(948, 150));
		JLabel ll;
		String tx = "";
		DentalTextField ttx;
		JPanel padding;
				
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				padding = new JPanel();
				padding.setBorder( BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
				padding.setBackground(Color.WHITE);
				padding.setLayout( new BorderLayout());
				
				if(i == 0 && j == 0){
					tx = "Education";
				} else if(i == 0){
					tx = cHeaders[j-1];
				} else if(j == 0){
					tx = rHeaders[i-1];
				} else {
					ttx = new DentalTextField(15);
					ttx.setBorder( BorderFactory.createEmptyBorder(0,5,0,0));
					Education.add((DentalTextField) ttx);
					padding.add(ttx, BorderLayout.CENTER);
					line.add(padding);
					tx = "";
				}
				if(!tx.equals("")){
					ll = new DentalLabel(tx);
					ll.setBorder( BorderFactory.createEmptyBorder(0,5,0,0));
					padding.add(ll, BorderLayout.CENTER);
					line.add( padding );
				}
				tx = " ";
			}

		}
		pan.add(line);
		
		 //Line
		pan.add(new HorizontalRule(955,500));
		
		//Submit Button
		line =  new FormLine();
		line.setLayout( new BorderLayout());
		line.setPreferredSize(new Dimension(948, 50));
		
		JButton Submit = new JButton("Submit form");
		Submit.setPreferredSize( new Dimension(184,44));
		Submit.setBackground( Color.decode("#0b75b7"));
		Submit.setFont( new Font(Submit.getFont().getFontName(), Font.PLAIN, 18));
		Submit.setForeground(Color.WHITE);
		Submit.setBorder( BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
		
		Submit.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	Submit.setBackground(Color.ORANGE);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	Submit.setBackground(Color.decode("#0b75b7"));
		    }
		});
		Submit.addActionListener(this);
		
		
		line.add(Submit, BorderLayout.EAST);
		pan.add(line);
		
		
		this.setContentPane(pan);
		this.setLocationRelativeTo(null);  //place frame in the middle of screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application when frame closes
		this.setVisible(true); //display frame
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		
		System.out.println(" -- Form Submission -- ");
		
		System.out.println("Personnal Information");
		System.out.println("Firstname : " + FName.GetContent() );
		System.out.println("Lastname : " + LName.GetContent() );
		System.out.println("Middlename : " + MName.GetContent() );
		System.out.println("Address : " + Adress.GetContent() );
		System.out.println("Home Phone : " + PhoneHome.GetContent() );
		System.out.println("Cell Phone : " + PhoneCell.GetContent() );
		System.out.println("S.I.N : " + SIN.GetContent() );
		System.out.println("D.O.B. : " + DOB_D.GetContent()  + "-" + DOB_M.GetContent()  + "-" + DOB_Y.GetContent());
		System.out.println("Email : " + Email.GetContent() );
		
		System.out.println(" --- ");
		System.out.println("Job Information");
		System.out.println("Position Asked : " + Position.GetContent() );
		System.out.println("Desired Salary: " + Salary.GetContent() );
		
		String times = "";
		if(Time_Full.isSelected())
			times += "Full-Time ";
		if(Time_Part.isSelected())
			times += "Part-Time ";
		if(Time_Temp.isSelected())
			times += "Temporary ";
		if(Time_Perm.isSelected())
			times += "Permanent ";
		if(times.equals(""))
			times = "N/A";
		
		System.out.println("Avialibality : " + times );
		System.out.println("Assistant Certification : " + Cert_Assis.Awnser() );
		System.out.println("Hygenist  Certification : " + Cert_Hygen.Awnser() );
		
		System.out.println(" --- ");
		System.out.println("Schedule");
		for (int i = 0, j=0; i < Days.length; i++, j++) {
			System.out.print(Days[i] + " - ");
			System.out.print( "Start : " + Times.get(j).getSelectedItem() + " - ");
			j++;
			System.out.println( "End : " + Times.get(j).getSelectedItem());
		}
		System.out.println(" --- ");
		System.out.println("More Information");
		System.out.println("Desired Start Date : " + WorkStart.GetContent());
		System.out.println("Driver's Permit : " + DriverPermit.GetContent());
		System.out.println("Transportation : " + Transportation.GetContent());
		System.out.println("Reference : " + Reference.GetContent());
		
		System.out.println(" --- ");
		System.out.println("Education Information");
		for (int i = 0; i < cHeaders.length; i++) {
			for (int j = 0; j < rHeaders.length; j++) {
				System.out.println(cHeaders[i] + "->" + rHeaders[j] + ": " + Education.get(i+j).GetContent() );
			}
		}


	}
	
	
	class DentalTextField extends JFormattedTextField{
		
		/**
		 * Extended TextField to Use in Swing Forms
		 * Has Formats and Style !
		 */
		private static final long serialVersionUID = 1L;
		private String mask = "";
		
		public DentalTextField(int Columns) {
			this.setColumns(Columns);
			this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 12));
			this.setPreferredSize( new Dimension(20,29));
			mask = "";
		}
		
		public void SetInteger() {
			//oof#1
			this.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(NumberFormat.getIntegerInstance())));
		}
		public void SetDecimal() {
			//oof#2
			this.setFormatterFactory( new DefaultFormatterFactory(new NumberFormatter(new DecimalFormat())));
		}
		public void SetDate() {
			//oof#2
			this.setFormatterFactory( new DefaultFormatterFactory(new DateFormatter( DateFormat.getDateInstance())));
		}
		public void SetMask(String mask) {
			//This is Great !
			this.mask = mask;
			try {
				this.setFormatterFactory( new DefaultFormatterFactory( new MaskFormatter(mask)) );
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		public String GetContent() {
			
			String eM = this.mask.replace("#", " ");
			
			if( this.getText().equals("")) {
				return "N/A";		
			} else if(this.getText().equals(eM)) {
				return "N/A";	
			}else {
				return this.getText();
			}
		}

	}

	
	class DentalLabel extends JLabel{
		
		public DentalLabel(String text) {
			this.setText(text);
			this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 12));
		}
		
		public DentalLabel(String text, Dimension size) {
			this.setText(text);
			this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 12));
			this.setPreferredSize(size);
		}
		public DentalLabel(String text, Boolean DefaultSize) {
			this.setText(text);
			this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 12));
			this.setPreferredSize(new Dimension(150,24));
		}
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
	
	class HoursComboBox extends JComboBox<Object>{
		
		public int end = 22;
		
		public HoursComboBox(){
			for (int i = 0; i <= end; i++) {
				this.addItem(String.format("%02d",i) + ":00H" );
			}
			this.setBackground(Color.WHITE);
			this.setPreferredSize( new Dimension(70,32));
		}
		
	}
	
	
	

}
