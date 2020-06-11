package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class attest_annotation {
	
	@BeforeSuite
	public void z1() {
		System.out.println(" @BeforeSuite z1");
		//annotaion_1.srinidi();
	}
	
	@BeforeSuite
	public void z3() {
		System.out.println(" @BeforeSuite z3");
	}
	
	@BeforeClass
	public void z2() {
		System.out.println("@@BeforeClass z2");
	}
	
	@BeforeTest
	public void z4() {
		System.out.println("@BeforeTest z4");
	}
	
	@BeforeTest
	public void z5() {
		System.out.println("@BeforeTest z5");
	}
	
	@BeforeMethod
	public void z6() {
		System.out.println("@BeforeMethod z6");
	}
	@AfterMethod
	public void z7() {
		System.out.println("@AfterMethod z7");
	
	}
	
		
	@Test
	public void m1() {
		System.out.println("@Test M1");
	}
	
	@Test
	public void aM1() {
		System.out.println("@Test aM1");
	}
	
	@Test
	public void a1M1() {
		System.out.println("@Test a1M1");
	}
	@Test
	public void A2M1() {
		System.out.println("@Test A2M1");
	}
}
	
	


