package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                                 
                                  //Info : Assignement 7 - MouseOver in rahul shetty//
public class Assignements7 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl()
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}
	@Test()
	public void TestCase() 
	{
		Actions actions = new Actions(driver);	
		WebElement mouseover = driver.findElement(By.id("mousehover"));
		actions.moveToElement(mouseover).build().perform();
		WebElement TopOption = driver.findElement(By.linkText("Top"));
		TopOption.click();
	}
	
	@Test()
	public void TestCase1() 
	{
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		Actions actions = new Actions(driver);	
		WebElement mouseover = driver.findElement(By.id("mousehover"));
		actions.moveToElement(mouseover).build().perform();
		WebElement ReLoadOption = driver.findElement(By.linkText("Reload"));
		ReLoadOption.click();
	}
	
	@Test()
	public void TestCase2() 
	{
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(Drag, Drop).perform();
		
	}
	

}
