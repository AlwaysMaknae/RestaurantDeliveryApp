package Form.Login;

import java.awt.event.ActionEvent;

public class FLogin extends FLoginView{
	
	public FLogin(){
		BTNConnect.addActionListener(this);
		System.out.println("Form Controller");
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		//Submit
		System.out.println(TFUsername.GetContent());
		
	}

	
}
