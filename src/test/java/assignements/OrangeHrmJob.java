package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		WebElement UsrNameObj =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		UsrNameObj.sendKeys("Admin");
		
		WebElement PswObj = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		PswObj.sendKeys("admin123");
		
		WebElement LogInObj = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		LogInObj.click();
		
		WebElement AdminBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
		AdminBtn.click();

	}
	@Test 
	public void Job() 
	{
		WebElement JobBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]"));
		JobBtn.click();
		
		WebElement JObTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a"));
		JObTitle.click();
		
		WebElement AddBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
		AddBtn.click();
		
	}
		
		@Test 
		public void Jobtitle() {
		
		//ADD JOB TITLE
		
		WebElement JobTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
		JobTitle.sendKeys("QA Engineers");
		
		WebElement SaveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]"));
		SaveBtn.click();
		
		}
	}
	
	


