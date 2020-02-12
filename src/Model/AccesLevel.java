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
	 
}
