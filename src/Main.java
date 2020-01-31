import Form.Login.FLogin;
import Form.Login.FLoginView;
import Model.UserModel;
import database.*;


public class Main {

	public static void main(String[] args){
		DBConnecter.OpenConnection();
		new FLogin();
	}
	
}
