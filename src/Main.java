import Form.Login.FLogin;
import Model.UserModel;
import database.*;
import utils.FormEntities;

public class Main {

	public static void main(String[] args) {
		DBConnecter.OpenConnection();
		UserModel jose = new UserModel("JJJJ", "yeey", 3);
		UserModel Tester2 = new UserModel("tester2", "terst", 2);
		
		DBUser.AddUser("Jose", "123", 3);
		//DBUser.UpdateUser(0, "testerz", "123123", 1);
		
		//DBUser.DeleteUser(jose.getId());
		//DBUser.AddUser("Test", "123", 2);
	}

}
