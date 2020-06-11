package Demo_TestNG.Demo_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginTestCases {
	@BeforeSuite
	public void dependencyTriggering() {
	BrowserUtility.launchBrowser("ch");
	}
	@AfterMethod
	public void settingURL() {
		if(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed())
		{
			BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
			wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("email_field"))));	
		}
	}
	@Test
	public void checkLoginSuccessOrNot_InvalidCredentials() throws Exception{
		System.out.println("1111");
		BrowserUtility.loginToBrowser("admin123@gmail.com", "admin12");
	}
	
	@Test
	public void checkLoginSuccessOrNot_ValidCredentials() throws Exception{
		System.out.println("2222");
		BrowserUtility.loginToBrowser("admin123@gmail.com", "admin123");
	}
	
	
	@AfterSuite
	public void tearDownDependencies() {
		BrowserUtility.quitBrowser();
	}
	
	

}
