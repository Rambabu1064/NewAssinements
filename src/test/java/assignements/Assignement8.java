package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignement8 {

	ChromeDriver driver = new ChromeDriver();
		@BeforeTest()
		public void Url() 
		{
			driver.get("");
			driver.manage().window().maximize();
		}
		
		@Test
		public void Docs() 
		{
			WebElement Name = driver.findElement(By.xpath(""));
			Name.sendKeys("");
			
			
		}
	}


