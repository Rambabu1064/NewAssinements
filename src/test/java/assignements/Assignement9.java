package assignements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                         //Info : Assignement 9 - Allerts in rahul shetty//
public class Assignement9 {
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
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Ram");
		
		WebElement alertproperty=driver.findElement(By.id("alertbtn"));
		alertproperty.click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
	
		}
	@Test()
	public void TestCase2() throws InterruptedException
	{
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Babu");
		
		WebElement alertproperty=driver.findElement(By.id("confirmbtn"));
		alertproperty.click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	@Test()
	public void TestCase3() throws InterruptedException 
	{
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("RamBabu");
		
		WebElement alertproperty=driver.findElement(By.id("confirmbtn"));
		alertproperty.click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	

}
