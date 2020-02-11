import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import Form.AddClient.FAddClient;
import Form.Client.FDeleteAccount;
import Form.Client.FEditAccount;
import Form.Client.FOrderFood;
import Form.Client.FViewOrderFoodHistory;
import Form.Dashboard.FDashboard;
import Form.Deliverers.FAddDeliverer;
import Form.Deliverers.FDeleteDeliverer;
import Form.Deliverers.FEditDeliverer;
import Form.DeliveryGuy.FAcceptDeliveryGuy;
import Form.DeliveryGuy.FDoneDeliveryGuy;
import Form.DeliveryGuy.FViewDeliveryGuy;
import Form.Client.FEditAccount;
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
import Model.RestaurantModel;
import Model.UserModel;
import database.*;
import utils.FAlerts;
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
		//new FAddRestaurantMenu();//VVVVVV
		//TODO SHOW THIS JOPTION IF THE RESTAURANT HAS NO MENU!
		//FAlerts.Error("Menu Error", "All restaurants do not have a Menu. \n Please select a restaurant to add a Menu.");
		
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
		new FEditDeliverer();
		
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

		
		
		//FDashboard ff = new FDashboard();
		//ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//new FormEntities();
		
		/*
		FAlerts.Error("Error Test", "Testing the errors.");
		
		if(FAlerts.Confirm("Testing Confirm", "Testing the confirming of the thing")){
			System.out.println("Yes");
		} else {
			System.out.println("No.");
		}
		
		FAlerts.Say("title", "message");
		
		System.out.println(FAlerts.Ask("Question", "Why ?"));
		
		
		DBConnecter.OpenConnection();
		*/
		
		
	}

}
