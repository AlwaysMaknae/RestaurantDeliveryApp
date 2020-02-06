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
import Model.UserModel;
import database.*;
import utils.FormEntities;

public class Main {
	public static void main(String[] args) {

		new DBConnecter();
		
		
		new FEditRestaurant();
		new FormEntities();
		
		DBConnecter.OpenConnection();

		UserModel jose = new UserModel("JJJJ", "yeey", 3);
		UserModel Tester2 = new UserModel("tester2", "terst", 2);
		
		//DBUser.AddUser("Jose", "123", 3);
		DBUser.UpdateUser(2, "hhhhhhhm");
		
		//DBUser.DeleteUser(jose.getId());
		//DBUser.AddUser("Test", "123", 2);
	}

}
