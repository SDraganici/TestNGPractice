package pack01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
  @Test(dataProvider="userLogin")
  public void testLogin(String userName, String password) {
	  System.out.println("L*utilisateur: "+userName+"  Password: "+password+"  Est connecte");
  }
  
  @DataProvider(name= "userLogin")
  public  Object [] [] loginData() {
	  Object [] []  users = { {"admin","admin12123"}, {"employee","empo12132"}, {"quest","quest1232"}};
	  return users;
  }
}
