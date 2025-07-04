package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURL() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test(priority = 1)
    //login scenario
    public void TestCaseOne() throws InterruptedException {
        WebElement UserNameTextBox = driver.findElement(By.name("username"));
        //UserNameTextBox.click();
        UserNameTextBox.sendKeys("Admin");

        WebElement PasswordTextBox = driver.findElement(By.name("password"));
        PasswordTextBox.click();
        PasswordTextBox.sendKeys("admin123");

        WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        LoginBtn.submit();
        Thread.sleep(3000);
    }
	@Test(priority = 2)
	
	//navigate to the admin page from the dashboard
	public void TestCaseTwoAdminPAge() {
		WebElement AdminPageLink = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
		AdminPageLink.click();
	}
	
	
	@Test(priority = 3)
	//add the user with status Enabled
	public void TestCaseThree() throws Exception {
		Thread.sleep(3000);
		WebElement UserAddBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		UserAddBtn.click();
		Thread.sleep(3000);
		
	}
}
