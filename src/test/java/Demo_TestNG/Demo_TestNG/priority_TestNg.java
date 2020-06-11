package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.Test;

public class priority_TestNg {
	
	
	@Test(priority = 1)
	public void m1() {
		System.out.println("@Test M1");
	}
	
	@Test(priority = -1)
	public void aM1() {
		System.out.println("@Test aM1");
	}
	
	@Test(priority = 10,enabled = false)
	public void a1M1() {
		System.out.println("@Test a1M1");
	}
	@Test
	public void A2M1() {
		System.out.println("@Test A2M1");
	}
}
	
	
	
	
	
	
	


