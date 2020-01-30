package utils;

import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

public class FTextField extends JFormattedTextField {
		
		/**
		 * Extended TextField to Use in Swing Forms
		 * Has Formats and Style !
		 */
		private static final long serialVersionUID = 1L;
		private String mask = "";
		private int StringLength;
		private Boolean Valid = true;
		
		public FTextField(int Columns) {
			this.setColumns(Columns);
			this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 12));
			this.setPreferredSize( new Dimension(20,29));
			this.mask = "";
		}
		public FTextField(int Colums, String mask){
			this(Colums);
			this.mask = mask;
		}
		public void SetStringLength(int length){
			this.StringLength = length;
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
		public String GetMask(){return this.mask;}
		
		public Boolean IsValid(){
			this.GetContent();
			return this.Valid;
		}
		public String GetContent() {
			
			String eM = this.mask.replace("#", " ");
			
			if( this.getText().equals("")) {
				this.Valid = false;
				return "N/A";		
			} else if(this.getText().equals(eM)) {
				this.Valid = false;
				return "N/A";	
			}else if(this.getText().length() > this.StringLength) {
				this.Valid = true;
				return this.getText();
			} else{
				this.Valid = false;
				return "N/A";
			}
		}

	
	
	

}
