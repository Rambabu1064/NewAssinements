package assignements;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                     //Info : Assignement 11 - practice.expandtesting - ShadowRoot//
public class Assignement11 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl() 
	{
		driver.get("https://practice.expandtesting.com/shadowdom");
		driver.manage().window().maximize();
		}
	@Test()
	public void Testcase1() 
	{
		
	}

}
