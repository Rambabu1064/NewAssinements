package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                    //Info : Assignement 13 - Add Location in organisation  ;OrangeHrm//
public class Assignement13 {
	EdgeDriver driver = new EdgeDriver();
	@BeforeTest()
	public void OpenUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
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
		WebElement Org = driver.findElement(By.xpath("//span[contains(@class,'nav-tab-item') and text()='Organization ']"));
		Org.click();
		WebElement Locations =driver.findElement(By.xpath("//a[contains(@class,'body-nav-tab-link') and text() = 'Locations']"));
		Locations.click();
		
		WebElement Select = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		Select.click();
		
		WebElement country = driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='India']"));
		country.click();
		
		WebElement search = driver.findElement(By.xpath("//button[contains(@class,'secondary orangehrm-left-space') and text()=' Search ']"));
		search.click();
		
		WebElement Add = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary' and text()=' Add ']"));
		Add.click();
		
	}
	
	@Test(priority =3)
	public void addLocation() 
	
	{
        WebElement name = driver.findElement(By.xpath("//label[contains(text(),'Name')]/ancestor::div[contains(@class,'oxd-input-group')]//input"));
        name.click();
        name.sendKeys("RAM");
		
		WebElement select = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		select.click();
		
		WebElement Country = driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='India']"));
		Country.click();
	
		
		WebElement save = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		save.click();
	}
	
	@Test(priority = 4)
	public void Search() throws InterruptedException 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oxd-select-text--after']"))).click();
//		WebElement Select = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
//		Select.click();
		
		WebElement country = driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='India']"));
		country.click();
		
		WebElement search = driver.findElement(By.xpath("//button[contains(@class,'secondary orangehrm-left-space') and text()=' Search ']"));
		search.click();
		
		
		
	}


}
