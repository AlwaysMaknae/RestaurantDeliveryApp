import Form.AddClient.FAddClient;
import Form.Admin.FAdmin;
import Form.Client.FDeleteAccount;
import Form.Client.FEditAccount;
import Form.Client.FOrderFood;
import Form.Client.FViewOrderFoodHistory;
import Form.Delivery.FAddDeliveryGuy;
import Form.Delivery.FDeleteDeliveryGuy;
import Form.Delivery.FEditDeliveryGuy;
import Form.DeliveryGuy.FAcceptDelivery;
import Form.DeliveryGuy.FDoneDelivery;
import Form.DeliveryGuy.FViewDelivery;
import Form.Login.FLogin;
<<<<<<< HEAD
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
=======
import Model.UserModel;
>>>>>>> 7c047e6d0baffbfb5cda4f6e3d4998caf6422408
import database.*;
import utils.FormEntities;

public class Main {

	public static void main(String[] args) {

		new DBConnecter();
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
		 * ***NOTE*** FORM.DELIVERY JAVA CLASSES ARE CALLED "DELIVERYGUY" WHILE
		 * FORM.DELIVERYGUY JAVA CLASSES ARE CALLED "DELIVERY". THIS WAS A BIG UH-OH
		 * MADE BY DOM. PLEASE FORGIVE HIM.
		 */
		
		//new FAddDeliveryGuy();
		//new FEditDeliveryGuy();
		//new FDeleteDeliveryGuy();
		
		/*
		 * ADMIN ACCOUNT FORM
		 */
		
		//new FAdmin();
		
		/*
		 * DELIVERYGUY ACCOUNT FORM
		 * ***NOTE*** FORM.DELIVERYGUY JAVA CLASSES ARE CALLED "DELIVER" WHILE
		 * FORM.DELIVERY JAVA CLASSES ARE CALLED "DELIVERYGUY". THIS WAS A BIG UH-OH
		 * MADE BY DOM. PLEASE FORGIVE HIM.
		 */
		
		//new FViewDelivery();
		//new FAcceptDelivery();
		//new FDoneDelivery();
		
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
		
		
		DBConnecter.OpenConnection();
		UserModel jose = new UserModel("JJJJ", "yeey", 3);
		UserModel Tester2 = new UserModel("tester2", "terst", 2);
		
		//DBUser.AddUser("Jose", "123", 3);
		DBUser.UpdateUser(2, "hhhhhhhm");
		
		//DBUser.DeleteUser(jose.getId());
		//DBUser.AddUser("Test", "123", 2);
	}

}
