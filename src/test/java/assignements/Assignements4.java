package assignements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                                
                                //Info : Assignement 4 - Rahul Shetty Table Data//
public class Assignements4 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		}
	@Test()
	public void webTable() 
	{
		List<WebElement> RowData = driver.findElements(By.xpath("//table[@class='table-display']//tr[position()>1]//td"));
		List<String> NewData = new ArrayList<>();
		for (WebElement Data : RowData) {
			NewData.add(Data.getText());
			}
		for(String FinalData : NewData) 
		{
			System.out.println(FinalData);
		}
		
	}

}
