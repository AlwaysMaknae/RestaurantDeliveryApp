import Form.Login.FLogin;
import Form.Restaurant.FAddRestaurant;
import Form.Restaurant.FAddRestaurantMenu;
import Form.Restaurant.FDeleteRestaurant;
import Form.Restaurant.FEditRestaurant;
import database.*;
import utils.FormEntities;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD

		new DBConnecter();
		//new FLogin();
		//new FAddClient();
		//new FAddRestaurant();
		//new FEditRestaurant();
		//new FDeleteRestaurant();
		new FAddRestaurantMenu();

=======
>>>>>>> 9d3440d95194e79441e9b86e7aefd165abe1478a
		DBConnecter.OpenConnection();
	}

}
