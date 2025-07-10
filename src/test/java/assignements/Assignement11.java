package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                     //Info : Assignement 11 - practice.expandtesting - ShadowRoot//
public class Assignement11 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
	@Test()
	public void Testcase1() 
	{
	
		
	}

}
