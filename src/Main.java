import Form.AddClient.FAddClientPage;
import Form.Login.FLogin;
import database.*;
import utils.FormEntities;


public class Main {

	public static void main(String[] args){

		new DBConnecter();
		new FLogin();
		//new FAddClientPage();

		DBConnecter.OpenConnection();

	}
	
}
