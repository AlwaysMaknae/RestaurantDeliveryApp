package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.BorderFactory;
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
		private int StringLength = 0;
		private Boolean Valid = true;
		
		public FTextField(int Columns) {
			this.setColumns(Columns);
			this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 12));
			this.setPreferredSize( new Dimension(20,29));
			
			this.mask = "";
			this.Valid = false;
			this.StringLength = 0;
			
			this.setBorder( BorderFactory.createLineBorder(Color.GRAY) );
			
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
			
			if(this.Valid){
				this.setBorder( BorderFactory.createLineBorder(Color.GREEN) );
			} else {
				this.setBorder( BorderFactory.createLineBorder(Color.RED) );
			}
			
			
			return this.Valid;
		}
		public String GetContent() {
			
			String eM = this.mask.replace("#", " ");
			String History = this.getText().replaceAll("\\p{Blank}","");
			//System.out.println("Cleaned Text->" + History + ";");
			
			if( History.equals("")) {
				this.Valid = false;
				return "";		
			} else if(History.equals(eM)) {
				this.Valid = false;
				return "";	
			}else if(this.StringLength > 0) {
				if( History.length() >= this.StringLength){
					this.Valid = true;
					this.setText(History);
					return History;
				} else {
					this.Valid = false;
					return "";	
				}
			}else {
				this.Valid = true;
				this.setText(History);
				return History;
			}
		}
}
