package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPages {
	
	ChromeDriver driver = new ChromeDriver ();
	
	@BeforeTest()
	public void OpenUrl()
	{
		driver.get("https://testpages.eviltester.com/styled/tag/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 	}
	@Test(priority = 1)
	public void HtmlTableTag()
	{
		WebElement Alan = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[2]/td[1]"));
		 Alan.click();
		System.out.println("Alan");
		
		 WebElement Bob = driver.findElement(By.xpath("/html/body/div/div[3]/div/table/tbody/tr[3]/td[1]"));
		 Bob.click();
		 System.out.println("Bob");
		 
		 WebElement Aleister = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[4]/td[1]"));
		 Aleister.click();
		 System.out.println("Aleister");
		 
		 WebElement Douglas = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[5]/td[1]"));
		 Douglas.click();
		 System.out.println("Douglas");
		 
		}
	  @Test(priority = 2)
	  public void Amount() 
	  {
		  WebElement Amount1 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[2]/td[2]"));
		  Amount1.click();
		  System.out.println("Amount1");
		  
		  WebElement Amount2 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[3]/td[2]"));
		  Amount2.click();
		  System.out.println("Amount2");
		  
		  WebElement Amount3 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[4]/td[2]"));
		  Amount3.click();
		  System.out.println("Amount3");
		  
		  WebElement Amount4 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[5]/td[2]"));
		  Amount4.click();
		  System.out.println("Amount4");
		  
		  }
	  @AfterTest()
	  public void Close()
	  {
		  driver.close();
	  }
   

}
