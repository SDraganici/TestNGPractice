package pack01;
import org.testng.annotations.Test;

public class LogoutTest {
  @Test(groups =  {"Sanity"})
  public void logoutAdmin() {
	  System.out.println("~~~LogoutAdmin~~~");
  }
  @Test(groups =  {"Sanity"})
  public void logoutEmployee() {
	  System.out.println("~~~LogoutEmployee~~~");
  }
  @Test
  public void logoutGuest() {
	  System.out.println("~~~LogoutGuest~~~");
	  System.out.println("---**************////////////////**************---");
  }
  
}
