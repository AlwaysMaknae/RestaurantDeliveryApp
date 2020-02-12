package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class FForm extends JFrame implements ActionListener, WindowListener{
	
	protected FMainMenu MenuBar;
	
	public FForm(){
		this.setTitle("New FForm");
		this.setSize(984,1080);
		this.setResizable(false);
		
		MenuBar = new FMainMenu();
		
		this.addWindowListener(this);
		
		this.setJMenuBar( MenuBar );
		this.setLocationRelativeTo(null);  //place frame in the middle of screen
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close application when frame closes
		this.setVisible(true); //display frame
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}

}
