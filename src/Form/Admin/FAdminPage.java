package Form.Admin;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import utils.FForm;

public class FAdminPage extends FForm implements Observer{

	
	
	
	public FAdminPage(){
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setTitle("Food Ordering Software");
		
	}
	
	
	
	
	
	
	public void update(Observable o, Object arg) {
		
		
	}

}
