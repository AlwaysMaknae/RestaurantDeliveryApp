package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import Form.Dashboard.FDashboard;
import Form.Login.FLogin;
import database.Session;

public class FForm extends JFrame implements ActionListener, WindowListener{
	
	protected FMainMenu MenuBar;
	private FForm Me;
	
	public FForm(){
		this.setTitle("New FForm");
		this.setSize(984,1080);
		this.setResizable(false);
		
		MenuBar = new FMainMenu();
		
		this.addWindowListener(this);
		this.setJMenuBar( MenuBar );
		this.setLocationRelativeTo(null); 
		
		Me = this;
		
		MenuBar.file_disconnect.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Session.Quit();
				new FLogin();
				Me.dispose();
			}
		});
		
		MenuBar.file_quit.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(FAlerts.Confirm("Quit", "Close the application ?")){
					Session.Quit();
					System.exit(0);
				}
			}
			
		});
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {
		Me.dispose();
		new FDashboard();
	}

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
