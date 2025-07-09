package assignements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
               
                       //Info : Assignement 5 - RahulShetty Drop down x paths For Selecting countries option//
public class Assignements5 {
	ChromeDriver driver = new ChromeDriver();
	   

		@BeforeTest()
		public void OpenUrl()
		{
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 	}
		@Test() 
		public void dropDown()
		{
			WebElement dropdownElement =driver.findElement(By.id("dropdown-class-example"));
			Select dropdown = new Select(dropdownElement);
			dropdown.selectByVisibleText("Option2");
			dropdown.getFirstSelectedOption();
			WebElement selectedOption = dropdown.getFirstSelectedOption();
			System.out.println("Selected option " + selectedOption.getText());
			
		}
		@Test()
		public void SuggestionClass () 
		{
			WebElement selectCountries = driver.findElement(By.id("autocomplete"));
			selectCountries.sendKeys("Russ");
			
			List<WebElement> dropdownOptions = driver.findElements(By.xpath("//li[contains(@class, 'ui-menu-item')]/div"));
			
			for(WebElement options:dropdownOptions) {
			if(options.getText().equalsIgnoreCase("Russian federation")) {
			options.click();
				}
		    }
				
			
		    String selectedValue = selectCountries.getAttribute("value");
		    System.out.println(selectedValue);
		 
			}
//			@AfterTest
//			public void Close() {
//				driver.close();
//			}
//		
			
		
		}
	

