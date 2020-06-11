package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {

	//public static void main(String[] args) {
		
	//@Test
	//public void m1() {
	//		System.out.println("I am testNG Method");
			

			//Annotations
			@BeforeSuite
			public void m1() {
				//launch
				System.out.println("m1 @BeforeSuite");
			}
			
			@AfterSuite
			public void m2() {
				System.out.println("m2 @AfterSuite");
			}
			
			@BeforeClass
			public void m3() {
				System.out.println("m3 @BeforeClass");
			}
			
			@AfterClass
			public void m4() {
				System.out.println("m4 @AfterClass");
			}
			
			@BeforeGroups
			public void m5() {
				System.out.println("m5 @BeforeGroup5");
			}
			
			@AfterGroups
			public void m6() {
				System.out.println("m6 @AfterGroups");
			}
			
			@BeforeTest
			public void m7() {
				System.out.println("m7 @BeforeTest");
			}
			@AfterTest
			public void m8() {
				System.out.println("m8 @AfterTest");
			}
			
			@BeforeMethod
			public void m9() {
				System.out.println("m9 @BeforeMethod");
			}
			@AfterMethod
			public void m10() {
				System.out.println("m10 @AfterMethod");
			}
			@Test // Write your test cases // this will be captured in your report
			public void m11() {
				System.out.println("m11 @Test");
			}		
			
			
			
		}
	


