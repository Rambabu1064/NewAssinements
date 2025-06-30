package assignements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonList {
	WebDriver driver = new ChromeDriver();

	@BeforeTest()
	public void OpenURL() {
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	

}
	@Test
	public void Locators() {
		WebElement AccountList = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
		AccountList.click();
		
		//Create WishList
		WebElement WishList = driver.findElement(By.className("nav-text"));
		WishList.click();
		driver.navigate().back();
		
		//WishFromAnyWebsite
		WebElement AccountList1 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
		AccountList1.click();
		WebElement WishFromAnyWebsite = driver.findElement(By.xpath("//span[text()='Wish from Any Website']/ancestor::a[contains(@class,'nav-link')]"));
		WishFromAnyWebsite.click();
		
		
		//BabyWishList
		WebElement AccountList2 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
		AccountList2.click();
		WebElement BabyWishList = driver.findElement(By.xpath("//span[text()='Baby Wishlist']/ancestor::a[contains(@class,'nav-link')]"));
		BabyWishList.click();
		
		//DiscoverYourStyle
		WebElement AccountList3 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
		AccountList3.click();
		WebElement DiscoverYourStyle = driver.findElement(By.xpath("//span[text()='Discover Your Style']/ancestor::a[contains(@class,'nav-link')]"));
		DiscoverYourStyle.click();
		
		//ExploreShowroom
		WebElement AccountList4 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/button"));
		AccountList4.click();
		WebElement ExploreShowroom = driver.findElement(By.xpath("//span[text()='Explore Showroom']/ancestor::a[contains(@class,'nav-link')]"));
		ExploreShowroom.click();
	}
	@AfterTest()
	
		public void CloseURL() {
			
			driver.close();
		}
	}
