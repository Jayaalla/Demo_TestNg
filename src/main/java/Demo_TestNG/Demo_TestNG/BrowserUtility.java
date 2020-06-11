package Demo_TestNG.Demo_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	static WebDriver driver = null;
	
	static void launchBrowser(String sbrowser)
		{
		if(sbrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
	//  System.setProperty("webdriver.chrome.driver","C:\\Users\\susmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.out.println("you have not given the browser type correct");
		}
		driver.manage().window().maximize();
		driver.get("http://qa-tekarch.firebaseapp.com/");
	}
	
	static void quitBrowser() {
		driver.quit();
	}
	
	static void loginToBrowser(String sUserName,String sPassword) throws Exception {
		 driver.get("http://qa-tekarch.firebaseapp.com/");
	     WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		//driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		 driver.findElement(By.id("email_field")).sendKeys(sUserName);
		//driver.findElement(By.id("password_field")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@placeholder='Email...']")).sendKeys("admin123@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@placeholder='Password...']")).sendKeys(sPassword);
			
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));		
        
	}
   static void waitForPageElementToDispaly(WebElement eleToWait) 
   {
	   WebDriverWait wait = new WebDriverWait(BrowserUtility.driver,30);
	    wait.until(ExpectedConditions.visibilityOf(eleToWait));
   }
	
	
}
