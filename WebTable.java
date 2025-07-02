package assignements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	ChromeDriver driver = new ChromeDriver();
	public void TestCase1() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> List2 = driver.findElements(By.xpath("//table[@class = 'table-display']//tr[position()>1]//td"));
		List<String> AllData = new ArrayList<>();
		for(WebElement list2 : List2) {
			AllData.add(list2.getText());
		}
		for(String AllData2 : AllData) {
			System.out.println("Table2 Data is: ");
			System.out.println(AllData2);
		}
	}

}
