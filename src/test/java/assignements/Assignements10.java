package assignements;
       
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                                 //Info : Assignement 10 - WindowHandles in rahul shetty//
public class Assignements10 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
	@Test()
	public void TestCase1() 
	{
		Actions action = new Actions(driver);
		
		String parentWindow = driver.getWindowHandle();
		WebElement Restapi = driver.findElement(By.linkText("REST API"));
		
		action.keyDown(Keys.SHIFT).click(Restapi).keyUp(Keys.SHIFT).build().perform();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String windowHandle : allWindows) {
			 if (!windowHandle.equals(parentWindow)) {
			 driver.switchTo().window(windowHandle);
			 
			 }
			 }
		System.out.println("Title Of This Page: "+driver.getTitle());
		
		driver.switchTo().window(parentWindow);
	
	}
	@Test()
	public void TestCase2() 
	{
        Actions action = new Actions(driver);
		
		String parentWindow = driver.getWindowHandle();
		WebElement Soapui = driver.findElement(By.linkText("SoapUI"));
		
        action.keyDown(Keys.CONTROL).click(Soapui).keyUp(Keys.CONTROL).build().perform();
		
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowHandle : allWindows) {
			 if (!windowHandle.equals(parentWindow)) {
			 driver.switchTo().window(windowHandle);
			 break;
			 }
		}
		System.out.println("Title Of This Page: "+driver.getTitle());
	
		driver.switchTo().window(parentWindow);
	}
	@Test()
	public void TestCase3() 
	{
        Actions action = new Actions(driver);
		
		String parentWindow = driver.getWindowHandle();
		WebElement APPIUM = driver.findElement(By.linkText("Appium"));
		action.keyDown(Keys.CONTROL).click(APPIUM).keyUp(Keys.CONTROL).build().perform();
		
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowHandle : allWindows) {
			 if (!windowHandle.equals(parentWindow)) {
			 driver.switchTo().window(windowHandle);
			 break;
			 }
		}
		
		System.out.println("Title Of This Page: "+driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		
	}
	@Test()
	public void TestCase4() 
	{
        Actions action = new Actions(driver);
		
		String parentWindow = driver.getWindowHandle();
		
		WebElement JMETER = driver.findElement(By.linkText("JMeter"));
	
		action.keyDown(Keys.CONTROL).click(JMETER).keyUp(Keys.CONTROL).build().perform();
		Set<String> allWindows = driver.getWindowHandles();

		for (String windowHandle : allWindows) {
			 if (!windowHandle.equals(parentWindow)) {
			 driver.switchTo().window(windowHandle);
			 break;
			 }
		}
		System.out.println("Title Of This Page: "+driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		
	}


@AfterTest()
public void CloseTabs()
{
	driver.close();
	
	}
}