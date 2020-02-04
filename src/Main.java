import Form.Delivery.FAddDeliveryGuy;
import Form.Delivery.FDeleteDeliveryGuy;
import Form.Delivery.FEditDeliveryGuy;
import Form.DeliveryGuy.FAcceptDelivery;
import Form.DeliveryGuy.FDoneDelivery;
import Form.DeliveryGuy.FViewDelivery;
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
		/*
		 * LOGIN & CREATE/EDIT/DELETE ACCOUNT
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
		 * DELIVERYGUY ACCOUNT FORM
		 * ***NOTE*** FORM.DELIVERYGUY JAVA CLASSES ARE CALLED "DELIVER" WHILE
		 * FORM.DELIVERY JAVA CLASSES ARE CALLED "DELIVERYGUY". THIS WAS A BIG UH-OH
		 * MADE BY DOM. PLEASE FORGIVE HIM.
		 */
		
		//new FViewDelivery();
		//new FAcceptDelivery();
		//new FDoneDelivery();
		

		DBConnecter.OpenConnection();
	}

}
