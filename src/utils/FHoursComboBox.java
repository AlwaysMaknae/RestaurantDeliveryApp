package utils;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;

public class FHoursComboBox extends JComboBox<Object> {
	public int end = 22;
	
	public FHoursComboBox(){
		for (int i = 0; i <= end; i++) {
			this.addItem(String.format("%02d",i) + ":00H" );
		}
		this.setBackground(Color.WHITE);
		this.setPreferredSize( new Dimension(70,32) );
	}
}
