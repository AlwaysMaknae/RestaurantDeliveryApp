import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import Form.AddClient.FAddClient;
import Form.Client.FDeleteAccount;
import Form.Client.FEditAccount;
import Form.Client.FOrderFood;
import Form.Client.FOrderFoodPage;
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
import Model.Model;
import Model.OrderModel;
import Model.RestaurantModel;
import Model.UserModel;
import database.*;
//import utils.FAlerts;
import utils.FormEntities;
import utils.Navigator;

public class Main {
	public static void main(String[] args) {

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
*/
		DBConnecter.OpenConnection();
		Session.AccesType = "";
		
		Navigator.Login(null);
<<<<<<< HEAD
		//new FOrderFoodPage();
		new FormEntities();

	
=======
		
		
>>>>>>> bdf3b1b9e5216a03bd7173258ed4a58e2cfbd93c
	}

}
