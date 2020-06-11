package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.Test;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;



public class TC_LOgin_Assertion {
	@Test
	public void TC_Login_01() {
		System.out.println("TC_Login_01 Executed");
		//you have entered the credentials in a login screen and then you went to home screen and ther you are 
		//validating whether hme screen is dsplayed or not
		
		//assertEquals(false, true);
		//assertEquals(false, true, "Home screen is not displayed");
		//logged getting text of some element 
		//credentials -- admin / user 
		//admin -- User
		assertNotSame("admin", "User", "Jayasree is not displayed");
		//assertSame("admin", "user","Logged in as an user im expecting user here");
		//assertno
		
	}
	
	
	
	
	
	

}
