import Form.Delivery.FAddDeliveryGuy;
import Form.Delivery.FDeleteDeliveryGuy;
import Form.Delivery.FEditDeliveryGuy;
import Form.Login.FLogin;
import Form.Menu.FAddMenu;
import Form.Menu.FDeleteMenu;
import Form.Menu.FEditMenu;
import Form.Restaurant.FAddRestaurant;
import Form.Restaurant.FAddRestaurantMenu;
import Form.Restaurant.FDeleteRestaurant;
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
		//new FDeleteRestaurant();
		//new FAddRestaurantMenu();
		//new FAddMenu();
		//new FEditMenu();
		//new FDeleteMenu();
		//new FAddDeliveryGuy();
		//new FEditDeliveryGuy();
		//new FDeleteDeliveryGuy();
		

		DBConnecter.OpenConnection();
	}

}
