package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement AccountList = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
		AccountList.click();
		
		//Create WishList
		WebElement WishList = driver.findElement(By.className("nav-text"));
		WishList.click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button")).click();
		
		//Wish from any website 
		WebElement WebSite = driver.findElement(By.className("nav-flyout-button nav-icon nav-arrow"));
		WebSite.click();
		
	}

}






