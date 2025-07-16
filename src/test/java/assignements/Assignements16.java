package assignements;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignements16 {
	
	ChromeDriver driver = new ChromeDriver();
	
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
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Scroll down by 500 pixels
		js.executeScript("window.scrollBy(0, 900);");
		
		WebElement Ind = driver.findElement(By.xpath("//span[@class='rts-counter']/following::span[@rel='india-population']"));
		String IndiaPopulation = Ind.getText();
		System.out.println("India Population :"+IndiaPopulation);
	}
	
	@Test()
	public void TestCase2() 
	{
		WebElement Table = driver.findElement(By.xpath("//div[@class='grid grid-cols-1 lg:grid-cols-2 lg:gap-4 mt-2']"));
		
		List<WebElement> tableData = driver.findElements(By.xpath("//div[@class='grid grid-cols-1 lg:grid-cols-2 lg:gap-4 mt-2']"));
		List<String> Data = new ArrayList();
		for(WebElement TableData : tableData ) 
		{
			Data.add(TableData.getText());
		}
		for(String DATA :Data ) 
		{
			System.out.println(DATA);
		}

	}
	

}
