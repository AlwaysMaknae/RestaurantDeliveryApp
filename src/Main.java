import Form.Login.FLogin;
import Model.UserModel;
import database.*;
import utils.FormEntities;

public class Main {

	public static void main(String[] args) {
		DBConnecter.OpenConnection();
		UserModel jose = new UserModel("JJJJ", "yeey", 3);
		
		DBUser.DeleteUser(jose.getId());
		//DBUser.AddUser("Test", "123", 2);
	}

}
