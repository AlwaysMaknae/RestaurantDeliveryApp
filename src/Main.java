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
import Model.ManagerModel;
import Model.OrderModel;
import Model.RestaurantModel;
import Model.UserModel;
import database.*;
//import utils.FAlerts;
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
		Session.AccesType = "";
		
		
		
		//FDashboard ff = new FDashboard();
		//ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//new FormEntities();
		
		
		DBConnecter.OpenConnection();
		new FLogin();
		

		ManagerModel tester2 = new ManagerModel("Jose", "123", 1, 1);

		OrderModel tester3 = new OrderModel("address2" , "postal", "2020-02-10 12:12:00", "items", "12:12:12", 32.2f, "NOT READY", 1, 1, 3, 0);

		//ManagerModel tester2 = new ManagerModel("Jose", "123", 1, 1);

		//DBManager.AddManager(tester2);

		
		DBOrder.AddOrder(tester3);
		
		System.out.println(DBRestaurant.getAllRestaurants().get(0).getName());
		System.out.println(DBRestaurant.getAllRestaurants().get(0).getId());
		System.out.println(DBOrder.getOrderbyClient(3));
		
	}

}
