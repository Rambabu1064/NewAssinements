package assignements;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
                     //Info : Assignement 12 - practice.expandtesting - UploadFile//
public class Assignment12 {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURL() {
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test
	public void TestCase1() {
		WebElement chooseFile = driver.findElement(By.id("fileInput"));
		String Filepath = "C:\\Users\\DELL\\OneDrive\\Desktop\\download.png";
		chooseFile.sendKeys(Filepath);
		
		
		WebElement UploadFile = driver.findElement(By.id("fileSubmit"));
		UploadFile.submit();
	}
}
