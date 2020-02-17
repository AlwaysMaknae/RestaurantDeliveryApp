package utils;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import Form.Dashboard.FDashboard;
import database.Session;

public class FForm extends JFrame implements ActionListener, WindowListener, KeyListener {
	
	protected FMainMenu MenuBar;
	protected FForm Me;
	
	public FForm(){
		this.setTitle("New FForm");
		this.setSize(800,600);
		this.setResizable(false);
		
		MenuBar = new FMainMenu(this);
		
		this.addWindowListener(this);
		this.setJMenuBar( MenuBar );
		
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, 0);
		
		 
		Me = this;
		this.addKeyListener(this);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

}
