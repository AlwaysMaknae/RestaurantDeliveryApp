package Model;

public abstract class AccesLevel {

	 public static final int CLIENT = 0;
	 public static final int MANAGER = 1; 
	 public static final int RESTAURATEUR = 2;
	 public static final int DELIVERY_GUY = 3; 
	 public static final int ADMIN = 4; 
	 
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
	 
}
