package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                                
                               //Info : Assignement 6 - Radio button & Check box//
public class Assignements6 {
	
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl()
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	}
	@Test()
	public void RadioButtonsExample() 
	{
		WebElement Radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		Radio2.click();
	}
	
	@Test()
	public void CheckBoxExample() 
	{
		WebElement Option3 = driver.findElement(By.id("checkBoxOption3"));
		Option3.click();
	}
	

}
