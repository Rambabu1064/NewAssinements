package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrm {
	ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait;
	@BeforeTest
	public void Openurl() throws InterruptedException
	{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
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

        WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]"));
        LoginBtn.submit();
        //Thread.sleep(3000);
    }
	@Test(priority = 2)
	
	//navigate to the admin page from the dashboard
	public void TestCaseTwoAdminPAge() {
		WebElement AdminPageLink = driver.findElement(By.xpath("//a[contains(@class,'main-menu-item')]//span[text()='Admin']"));
		//WebElement AdminPageLink = driver.findElement(By.xpath("//span[text()='Admin']/ancestor::a"));
		AdminPageLink.click();
	}
	
	
	@Test(priority = 3)
	//add the user with status Enabled
	public void TestCaseThree() throws Exception {
		//Thread.sleep(3000);
		WebElement UserAddBtn = driver.findElement(By.xpath("//button[contains(@class,'oxd-button') and normalize-space()='Add']"));
		UserAddBtn.click();
		//Thread.sleep(3000);
		
		WebElement UserRoleDropDownOption = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		UserRoleDropDownOption.click();
		//Thread.sleep(2000);
		
		WebElement ListItem = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']"));
		ListItem.click();
		//Thread.sleep(2000);
		WebElement ToGetUserName = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String Name = ToGetUserName.getText();
		
		WebElement EmployeeNameTxtBox = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		EmployeeNameTxtBox.click();
		EmployeeNameTxtBox.sendKeys(Name);
		
		
		
		//Thread.sleep(2000);
		//status enabled
		WebElement StatusDropDown = driver.findElement(By.xpath("//label[text()='Status']/following::div[contains(@class,'oxd-select-wrapper')]//div[@class='oxd-select-text--after']"));
		StatusDropDown.click();                                  
		//Thread.sleep(2000);
		 
		
		WebElement ListItems = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Enabled']"));
		String SelectedStatus = ListItems.getText();
		ListItems.click();
		//Thread.sleep(2000);
		
		
		WebElement UserNameTextBox = driver.findElement(By.xpath("//label[text()='Username']/following::input[@class='oxd-input oxd-input--active']"));
		UserNameTextBox.click();
		UserNameTextBox.sendKeys("Rambabu");
		
		//Thread.sleep(2000);
		
		WebElement PAsswordTextBox = driver.findElement(By.xpath("//label[text()='Password']/following::input[@class='oxd-input oxd-input--active']"));
		PAsswordTextBox.click();
		PAsswordTextBox.sendKeys("Rambabu@1234");
		
		//Thread.sleep(2000);
		
		WebElement ConfirmPAsswordTextBox  = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[@class='oxd-input oxd-input--active']"));
		ConfirmPAsswordTextBox.click();
		ConfirmPAsswordTextBox.sendKeys("Rambabu@1234");
		
		//Thread.sleep(2000);
		
		WebElement SaveBtn = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-left-space')]"));
		SaveBtn.click();
		
		
		Assert.assertEquals(SelectedStatus, "Enabled", "Does not match");
		System.out.println(SelectedStatus);
		//Thread.sleep(2000);
        WebElement CancelBtn = driver.findElement(By.xpath("//button[contains(@class,'ghost')]"));
        CancelBtn.click();
	}
	
	@Test(priority = 4)
	public void TestCaseFour() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement UserAddBtn = driver.findElement(By.xpath("//button[contains(@class,'oxd-button') and normalize-space()='Add']"));
		UserAddBtn.click();
		//Thread.sleep(3000);
		
		WebElement UserRoleDropDownOption = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
		UserRoleDropDownOption.click();
		//Thread.sleep(2000);
		
		WebElement ListItem = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']"));
		ListItem.click();
		//Thread.sleep(2000);
		
		WebElement ToGetUserName = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String Name = ToGetUserName.getText();
		
		WebElement EmployeeNameTxtBox = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		EmployeeNameTxtBox.click();
		EmployeeNameTxtBox.sendKeys(Name);
		
		
		
		//Thread.sleep(2000);
		//status enabled
		WebElement StatusDropDown = driver.findElement(By.xpath("//label[text()='Status']/following::div[contains(@class,'oxd-select-wrapper')]//div[@class='oxd-select-text--after']"));
		StatusDropDown.click();                                  
		//Thread.sleep(2000);
		 
		
		WebElement ListItems = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Disabled']"));
		String SelectedStatus = ListItems.getText();
		ListItems.click();
		//Thread.sleep(2000);
		
		
		WebElement UserNameTextBox = driver.findElement(By.xpath("//label[text()='Username']/following::input[@class='oxd-input oxd-input--active']"));
		UserNameTextBox.click();
		UserNameTextBox.sendKeys("Ram Babu");
		
		//Thread.sleep(2000);
		
		WebElement PAsswordTextBox = driver.findElement(By.xpath("//label[text()='Password']/following::input[@class='oxd-input oxd-input--active']"));
		PAsswordTextBox.click();
		PAsswordTextBox.sendKeys("Rambabu@123456");
		
		//Thread.sleep(2000);
		
		WebElement ConfirmPAsswordTextBox  = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[@class='oxd-input oxd-input--active']"));
		ConfirmPAsswordTextBox.click();
		ConfirmPAsswordTextBox.sendKeys("Rambabu@123456");
		
		//Thread.sleep(2000);
		
		WebElement SaveBtn = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-left-space')]"));
		SaveBtn.click();
		
		
		Assert.assertEquals(SelectedStatus, "Disabled", "Does not match");
		System.out.println(SelectedStatus);}

@AfterTest
public void CloseURL() {
	
	driver.close();
}

}