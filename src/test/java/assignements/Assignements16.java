package assignements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignements16 {
	
	ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());
	}
	@Test()
	public void TestCase1()
	 {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    WebElement viewFullTableLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("view full table")));
	    js.executeScript("arguments[0].scrollDown += 500;",viewFullTableLink);
	    viewFullTableLink.click();
	    
		List<WebElement> Rows = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[contains(@class,'datatable w-full border border-zinc-200 datatable-table')]/tbody/tr")));
		
		for(WebElement rows:Rows) {
			List<WebElement> Cells = rows.findElements(By.tagName("td"));
			if(Cells.size()>=11) {
				String FirstColumn = Cells.get(0).getText();
				String SecondColumn = Cells.get(1).getText();
				String LastColumn = Cells.get(11).getText();
				 System.out.println("SI.No: "+FirstColumn+ " |CountryName: "+SecondColumn+ " & World Share: "+LastColumn);
				 
			}
		}
	}

	                            
	                                  //Horizontal Scroll  
	@Test()
	public void TestCase2() {
		
		driver.navigate().back();
		
		WebElement Summary = driver.findElement(By.xpath("//th[text()='2100']/following::td[text()='10.2']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Summary);
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		// Scroll down by 500 pixels
		Js.executeScript("window.scrollBy(200, 0);");
		String summaryReport = Summary.getText();
		System.out.println("summaryReport :"+summaryReport);
		
		
	}
	
	
}
