package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

import Form.Dashboard.FDashboard;
import Form.Login.FLogin;
import database.Session;

public class FForm extends JFrame implements ActionListener, WindowListener{
	
	protected FMainMenu MenuBar;
	protected FForm Me;
	
	public FForm(){
		this.setTitle("New FForm");
		this.setSize(800,600);
		this.setResizable(false);
		
		MenuBar = new FMainMenu(this);
		
		this.addWindowListener(this);
		this.setJMenuBar( MenuBar );
		this.setLocationRelativeTo(null); 
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 
		Me = this;
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) { 
		if(Session.AccesType.equals("")) {
			Navigator.Quit();
		} else {
			this.dispose();
			new FDashboard();
		}
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}

}
