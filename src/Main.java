import javax.swing.JFrame;

import Form.AddClient.FAddClient;
import Form.Admin.FAdmin;
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
import Model.RestaurantModel;
import Model.UserModel;
import database.*;
import utils.FormEntities;

public class Main {
	public static void main(String[] args) {

		new DBConnecter();
		
		
		FormEntities ff = new FormEntities();
		
		ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DBConnecter.OpenConnection();

		UserModel jose = new UserModel("JJJJ", "yeey", 3);
		RestaurantModel tester = new RestaurantModel("CHeese factory");
		
		ManagerModel tester2 = new ManagerModel("Jose", "123", 1, 1);
		
		//DBManager.AddManager(tester2);
		
		System.out.println(DBRestaurant.getAllRestaurants().get(0).getName());
		System.out.println(DBRestaurant.getAllRestaurants().get(0).getId());
		
	}

}
