package Model;

public abstract class AccesLevel {

	 static final int CLIENT = 0;
	 static final int MANAGER = 1; 
	 static final int RESTAURATEUR = 2;
	 static final int DELIVERY_GUY = 3; 
	 static final int ADMIN = 4; 
	 
	 public static String GetType(int level){
		 
		 switch (level) {
			case AccesLevel.CLIENT:
				return "Client";
			case AccesLevel.MANAGER:
				return "Manager";
			case AccesLevel.RESTAURATEUR:
				return "Restaurateur";
			case AccesLevel.DELIVERY_GUY:
				return "Deliverer";
			case AccesLevel.ADMIN:
				return "Admin";
			default:
				return "";
		}
		 
	 }
	 
	 
	 public static Model GetInstance(int level, int id){
		 
		 Model oo;
		 
		 switch (level) {
			case AccesLevel.CLIENT:
				oo =  new ClientModel(id);
				((ClientModel)oo).Read();
			case AccesLevel.MANAGER:
				oo =  new ManagerModel(id);
				((ManagerModel)oo).Read();
			case AccesLevel.RESTAURATEUR:
				oo = new RestaurateurModel(id);
				((RestaurateurModel)oo).Read();
			case AccesLevel.DELIVERY_GUY:
				oo = new DelivererModel(id);
				((DelivererModel)oo).Read();
			case AccesLevel.ADMIN:
				oo = new UserModel(id);
				((UserModel)oo).Read();
			default:
				oo = null;
		}
		 
		 return oo;
	 }
}
