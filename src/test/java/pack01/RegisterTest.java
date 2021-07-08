package pack01;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterTest {
	@Parameters({ "URL", "Nombre" })
	@Test(groups =  {"Sanity"})
	public void registerAdmin(String urlName, int nom) {
		System.out.println("---registerAdmin---");
		System.out.println("L URL est: " + urlName);
		System.out.println("User Name: " + nom);
		
	}

	@Parameters({ "URL" })
	@Test(groups =  {"Sanity"})
	public void registerEmployee(String urlName) {
		System.out.println("---registerEmployee---");
		System.out.println("L URL est: " + urlName);
	
	}
	@Parameters({ "URL" })
	@Test(enabled=true)
	public void registerGuest(String urlName) {
		System.out.println("---registerGuest---");
		System.out.println("L URL est: " + urlName);
		System.out.println("---**************////////////////**************---");
	}
}

