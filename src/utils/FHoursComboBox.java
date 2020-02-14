package utils;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;

public class FHoursComboBox extends JComboBox<Object> {
	
	private int end = 23;
	private int start = 0;

	
	public FHoursComboBox(){
		init();
	}
	public FHoursComboBox(int StartTime){
		this.start = StartTime;
		init();
	}
	private void init(){
		for (int i = start; i <= end+start; i++) {
			this.addItem(String.format("%02d",i%24) + ":00" );
		}
		this.setBackground(Color.WHITE);
		this.setPreferredSize( new Dimension(70,32) );
	}
	
	public boolean setSelectedFromText(String time){
		
		for(int i=0; i<this.getItemCount();i++){
			if(this.getItemAt(i).equals(time)){
				this.setSelectedIndex(i);
				return true;
			}
		}
		return false;
		
	}
}
