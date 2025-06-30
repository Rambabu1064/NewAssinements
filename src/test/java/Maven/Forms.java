package Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Forms {
	WebDriver driver= new ChromeDriver();

	@Test
	public void Test() throws InterruptedException {
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void TestCase1() throws InterruptedException {
		driver.findElement(By.id("CONTINUE")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
		@Test
		public void close(){
			driver.close();
		}


	
	}



