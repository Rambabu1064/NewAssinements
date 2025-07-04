package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrmJob {
	ChromeDriver driver = new ChromeDriver ();
	
	@BeforeTest()
	public void OpenUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
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
	@Test 
	public void Job() 
	{
		WebElement JobBtn = driver.findElement(By.xpath("//span[@class = 'oxd-topbar-body-nav-tab-item' and normalize-space() ='Job']"));
		JobBtn.click();
		
		WebElement JObTitle = driver.findElement(By.xpath("//a[@class ='oxd-topbar-body-nav-tab-link']"));
		JObTitle.click();
		
		WebElement AddBtn = driver.findElement(By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--secondary']"));
		AddBtn.click();
		
	}
		
		@Test 
		public void Jobtitle() {
		
		//ADD JOB TITLE
		
		WebElement JobTitle = driver.findElement(By.xpath("//label[@class='oxd-label oxd-input-field-required']/following::input[@class='oxd-input oxd-input--focus']"));
		JobTitle.click();
		JobTitle.sendKeys("Automation Test Engineer");
		
		WebElement SaveBtn = driver.findElement(By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		SaveBtn.click();
		
		}
	
	
	
@AfterTest
public void CloseURL() {
	driver.close();
}
}
