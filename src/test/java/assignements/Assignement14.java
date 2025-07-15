package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                     //Info : Assignement 14 - Scroll Down in  Herokuapp//
public class Assignement14 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		}
	@Test()
	public void TestCase1() throws InterruptedException {
		
		WebElement contextproperty=driver.findElement(By.linkText("Context Menu"));
		contextproperty.click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Scroll down by 500 pixels
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		
		// Scroll Up by 500 pixels
		js.executeScript("window.scrollBy(0, -500);");
		

	}




}
