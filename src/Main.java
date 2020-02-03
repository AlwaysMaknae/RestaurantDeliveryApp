import Form.AddClient.FAddClient;
import Form.AddClient.FAddClientPage;
import Form.Login.FLogin;
import Form.Restaurant.FAddRestaurant;
import Form.Restaurant.FEditRestaurant;
import database.*;
import utils.FormEntities;

public class Main {

	public static void main(String[] args) {

		new DBConnecter();
		//new FLogin();
		//new FAddClient();
		//new FAddRestaurant();
		//new FEditRestaurant();

		DBConnecter.OpenConnection();

	}

}
