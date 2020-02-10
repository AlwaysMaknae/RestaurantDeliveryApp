package utils;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class FButton extends JButton {
	public FButton(String text){
		this.setText(text);
		this.setBackground(Color.WHITE);
		this.setBorder( BorderFactory.createLineBorder(Color.BLACK) );
		this.setPreferredSize( new Dimension(100,29));
	}
	
	public void SetType(String type){
		//Update Colors to nicer later
		switch (type) {
		case "Danger":
			this.setBackground(Color.RED);
			break;
		case "Warning":
			this.setBackground(Color.YELLOW);
			break;
		case "Good":
			this.setBackground(Color.GREEN);
			break;
		default:
			this.setBackground(Color.WHITE);
			break;
		}
	}
}
