package Maven;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class Alerts {
	

	public class alert {
	WebDriver driver= new ChromeDriver();

	@BeforeTest
	public void BeforeTest() throws InterruptedException {
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void TestCaseOne() throws InterruptedException {
		driver.findElement(By.id("alertexamples")).click();
		String obj = driver.switchTo().alert().getText();
		System.out.println(obj);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		

	}
	@Test(priority = 2)
	public void TestCaseTwo() throws InterruptedException {
		driver.findElement(By.id("confirmexample")).click();
		String obj1 = driver.switchTo().alert().getText();
		System.out.println(obj1);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	}
	@Test(priority = 3)
	public void TestCaseThree() throws InterruptedException {
		driver.findElement(By.id("confirmexample")).click();
		String obj2 = driver.switchTo().alert().getText();
		System.out.println(obj2);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
	}
	@Test(priority = 4)
	public void TestCaseFour() throws InterruptedException {
		driver.findElement(By.id("promptexample")).click();
		String obj3 = driver.switchTo().alert().getText();
		System.out.println(obj3);
		driver.switchTo().alert().sendKeys("Ramisetti");
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

	}

	@Test(priority = 5)
	public void TestCaseFive() throws InterruptedException{
		driver.findElement(By.id("promptexample")).click();
		String obj4 = driver.switchTo().alert().getText();
		System.out.println(obj4);
		driver.switchTo().alert().sendKeys("Rambabu");
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);

	}

	@AfterTest
	public void close(){
		driver.close();
	}
	}


}
