package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		WebElement Restapi = driver.findElement(By.linkText("REST API"));
		Restapi.click();
		System.out.println("Title Of This Page: "+driver.getTitle());
		driver.navigate().back();
	}
	@Test()
	public void TestCase2() 
	{
		WebElement Soapui = driver.findElement(By.linkText("SoapUI"));
		Soapui.click();
		System.out.println("Title Of This Page: "+driver.getTitle());
		driver.navigate().back();
	}
	@Test()
	public void TestCase3() 
	{
		WebElement APPIUM = driver.findElement(By.linkText("Appium"));
		APPIUM.click();
		System.out.println("Title Of This Page: "+driver.getTitle());
		driver.navigate().back();
	}
	@Test()
	public void TestCase4() 
	{
		WebElement JMETER = driver.findElement(By.linkText("JMeter"));
		JMETER.click();
		System.out.println("Title Of This Page: "+driver.getTitle());
		
	}

}
