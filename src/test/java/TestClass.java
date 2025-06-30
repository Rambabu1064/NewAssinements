import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestClass {
	WebDriver driver = new ChromeDriver();
	
	@Test(priority=-1)  
	public void test() 
	{
		driver.get("https://www.gmail.com");
		System.out.println("Hii");
	}    
	@Test(priority =1)
	public void Test1() 
	{
		driver.findElement(By.id("identifierId")).sendKeys("Ram1234@gmail.com");
		driver.manage().window().maximize();
		System.out.println("EmailId");
		
	}
	@Test(priority =2)
	public void Test2() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		System.out.println("click");
	}
	@Test (priority=3)
	public void SecondTest() throws InterruptedException
	{
	 System.out.println("Hello");
	 Thread.sleep(5000);
	 driver.quit();
	}

}
