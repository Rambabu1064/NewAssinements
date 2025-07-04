package assignements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	ChromeDriver driver = new ChromeDriver();
	public void TestCase1() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>TableData = driver.findElements(By.xpath("//table[@class='table-display']//tr[position()>2]//td"));
		List<String>AllData = new ArrayList<>();
		for(WebElement FullData : TableData) 
		{
			AllData.add(FullData.getText());
		}
		for(String AllData1 : AllData) {
			System.out.println("TableData is : ");
			System.out.println(AllData1 );
		}
		
		
		}

}
