import javax.swing.JFrame;

import Form.AddClient.FAddClient;
import Form.Admin.FAdmin;
<<<<<<< HEAD
import Form.Client.FDeleteAccount;
import Form.Client.FEditAccount;
import Form.Client.FOrderFood;
import Form.Client.FViewOrderFoodHistory;
import Form.Deliverers.FAddDeliverer;
import Form.Deliverers.FDeleteDeliverer;
import Form.Deliverers.FEditDeliverer;
import Form.DeliveryGuy.FAcceptDeliveryGuy;
import Form.DeliveryGuy.FDoneDeliveryGuy;
import Form.DeliveryGuy.FViewDeliveryGuy;
=======
import Form.Client.FEditAccount;
>>>>>>> 71c9c1d7afadb39f6c1f16d1b724437641c378a9
import Form.Login.FLogin;
import Form.Manager.FViewRestaurantOrder;
import Form.Menu.FAddMenu;
import Form.Menu.FDeleteMenu;
import Form.Menu.FEditMenu;
import Form.Restaurant.FAddRestaurant;
import Form.Restaurant.FAddRestaurantMenu;
import Form.Restaurant.FDeleteRestaurant;
import Form.Restaurant.FEditRestaurant;
import Form.Restauranteur.FAcceptOrder;
import Form.Restauranteur.FOrderReady;
import Model.UserModel;
import database.*;
import utils.FormEntities;

public class Main {
	public static void main(String[] args) {

		new DBConnecter();
<<<<<<< HEAD
		/*
		 * LOGIN & CREATE NEW ACCOUNT
		 */
		
		//new FLogin();
		//new FAddClient();
		
		/*
		 * RESTAURANT FORM
		 */
		
		//new FAddRestaurant();
		//new FEditRestaurant();
		//new FDeleteRestaurant();
		//new FAddRestaurantMenu();
		
		/*
		 * MENU FORM
		 */
		
		//new FAddMenu();
		//new FEditMenu();
		//new FDeleteMenu();
		
		/*
		 * DELIVERY FORM
		 */
		
		//new FAddDeliverer();
		//new FDeleteDeliverer();
		//new FEditDeliverer();
		
		/*
		 * ADMIN ACCOUNT FORM
		 */
		
		//new FAdmin();
		
		/*
		 * DELIVERYGUY ACCOUNT FORM
		 */
		
		//new FViewDeliveryGuy();
		//new FAcceptDeliveryGuy();
		//new FDoneDeliveryGuy();
		
		/*
		 * RESTAURANTEUR ACCOUNT FORM
		 */
		
		//new FAcceptOrder();
		//new FOrderReady();
		
		/*
		 * MANAGER ACCOUNT FORM
		 */
		
		//new FViewRestaurantOrder();
		
		/*
		 * CLIENT ACCOUNT FORM
		 */

		//new FEditAccount();
		//new FDeleteAccount();
		//new FOrderFood();
		//new FViewOrderFoodHistory();
		
		
		
		//new FormEntities();

		
		
		FormEntities ff = new FormEntities();

		
		ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DBConnecter.OpenConnection();

		UserModel jose = new UserModel("JJJJ", "yeey", 3);
		UserModel Tester2 = new UserModel("tester2", "terst", 2);
		
		//DBUser.AddUser("Jose", "123", 3);
		//DBUser.UpdateUser(2, "hhhhhhhm");
		
		//DBUser.DeleteUser(jose.getId());
		//DBUser.AddUser("Test", "123", 2);
	}

}
