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
import utils.FormEntities;

public class Main {

	public static void main(String[] args) {

		new DBConnecter();
		/*
		 * LOGIN & CREATE NEW ACCOUNT
		 */
		
		new FLogin();
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
		//UserModel jose = new UserModel("JJJJ", "yeey", 3);
		//RestaurantModel tester = DBRestaurant.GetRestaurant(2);
		//tester.setAreas("J2K K9K J8A O9Q Q5A");
		
		//ManagerModel tester2 = new ManagerModel("Jose", "123", 1, 1);

		//OrderModel tester3 = new OrderModel("address2" , "postal", "2020-02-10 12:12:00", "items", "12:12:12", 32.2f, "NOT READY", 1, 1, 3, 0);
		
		//System.out.println(DBItem.getAllItems(3).get(0).getItem_dish());
		
		//DBManager.AddManager(tester2);
		
		
		//System.out.println(DBOrder.getOrderbyClient(3).get(1).getPostal_code());
		//System.out.println(DBRestaurant.getRestaurantArea("H6K").get(0).getArealist());
		//System.out.println(DBDeliverer.getDelivererArea("H5K").get(0).getName());
		//System.out.println(DBDeliverer.CompareArea(2, "J2K").get(0).getName());
		
		//DBRestaurant.UpdateRestaurant(tester);
		
		
		//DBUser.getAllUsers("JJJ");
		
	}

}
