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
import Model.ClientModel;
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
		new FOrderFood();
		//new FViewOrderFoodHistory();
		
		
		
		//new FormEntities();
		Session.AccesType = "";
		

		
		DBConnecter.OpenConnection();
		
		new FLogin();
		

		//ManagerModel tester2 = new ManagerModel("Jose", "123", 1, 1);
		//OrderModel tester3 = new OrderModel("address2" , "postal", "2020-02-10 12:12:00", "items", "12:12:12", 32.2f, "NOT READY", 1, 1, 3, 0);

		//ManagerModel tester2 = new ManagerModel("Jose", "123", 1, 1);



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
>>>>>>> 528ac22e3f55b9662a7c73b91ea08303cd5ac7e5
		//UserModel jose = new UserModel("JJJJ", "yeey", 3);
		//RestaurantModel tester = DBRestaurant.GetRestaurant(2);
		//tester.setAreas("J2K K9K J8A O9Q Q5A");
		
		//ManagerModel tester2 = new ManagerModel("Jose", "123", 1, 1);

		//OrderModel tester3 = new OrderModel("address2" , "postal", "2020-02-10 12:12:00", "items", "12:12:12", 32.2f, "NOT READY", 1, 1, 3, 0);
		
		//System.out.println(DBItem.getAllItems(3).get(0).getItem_dish());
		

		//DBManager.AddManager(tester2);

		
		//System.out.println(DBOrder.getOrderbyClient(3).get(1).getPostal_code());

		/*
		System.out.println(DBRestaurant.getRestaurantByArea("H6K"));
		System.out.println(DBDeliverer.getDelivererByArea("H5K").get(0).getName());
		System.out.println(DBDeliverer.CompareArea(2, "J2K"));
		*/

		//System.out.println(DBRestaurant.getRestaurantArea("H6K").get(0).getArealist());
		//System.out.println(DBDeliverer.getDelivererArea("H5K").get(0).getName());
		//System.out.println(DBDeliverer.CompareArea(2, "J2K").get(0).getName());
		

		//DBRestaurant.UpdateRestaurant(tester);

		/*
		System.out.println(DBRestaurant.getAllRestaurants().get(0).getName());
		System.out.println(DBRestaurant.getAllRestaurants().get(0).getId());
		*/
		
	//	System.out.println(DBOrder.getOrderbyClient(3));
		//DBUser.getAllUsers("JJJ");
		

		//ClientModel moodle = new ClientModel(10);
		//moodle.Read();
		//System.out.println(moodle.getClient_email());

	}

}
