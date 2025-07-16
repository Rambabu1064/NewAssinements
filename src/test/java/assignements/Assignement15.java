package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                              //Info : Assignement 15 - ScrollDown  in OrangeHrm//
public class Assignement15 {
	EdgeDriver driver = new EdgeDriver();
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	@Test(priority =1)
	public void AdminPage() 
	{
		WebElement UsrNameObj =driver.findElement(By.xpath("//input[@name='username']"));
		UsrNameObj.sendKeys("Admin");
		
		WebElement PswObj = driver.findElement(By.xpath("//input[@name='password']"));
		PswObj.sendKeys("admin123");
		
		WebElement LogInObj = driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium')]"));
		LogInObj.click();
		
		WebElement AdminBtn = driver.findElement(By.xpath("//span[contains(@class ,'span oxd-main-menu-item--name')]"));
		AdminBtn.click();

	}
	@Test (priority =2)
	public void organizationPage() 
	{
		WebElement Org = driver.findElement(By.xpath("//span[contains(@class,'tab-item') and text()='Organization ']"));
		Org.click();
		
		WebElement Locations =driver.findElement(By.xpath("//a[contains(@class,'body-nav-tab-link') and text() = 'Locations']"));
		Locations.click();
		
		WebElement country = driver.findElement(By.xpath("//div[text()='Country']/div"));
		country.click();
		
}
	@Test(priority =3)
	public void Assending() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Scroll down by 500 pixels
		js.executeScript("window.scrollBy(0, 100);");
		Thread.sleep(2000);
		
		WebElement assending = driver.findElement(By.xpath("//div[text()='Country']/following::span[text()='Ascending'][1]"));
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].click();", assending);
		
		
		//assending.submit();
		
		}
	@Test(priority = 4)
	public void Descending() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Scroll down by 500 pixels
		js.executeScript("window.scrollBy(0, 100);");
		
        WebElement descending = driver.findElement(By.xpath("//div[text()='Country']/following::span[text()='Descending'][1]"));
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;

		Js.executeScript("arguments[0].click();",descending );
	}
}