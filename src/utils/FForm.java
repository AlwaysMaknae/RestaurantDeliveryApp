package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class FForm extends JFrame implements ActionListener{
	
	public FForm(){
		this.setTitle("New FForm");
		this.setSize(984,1010);
		this.setResizable(false);
		
		
		
		this.setLocationRelativeTo(null);  //place frame in the middle of screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application when frame closes
		this.setVisible(true); //display frame
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Submit
	}

}
