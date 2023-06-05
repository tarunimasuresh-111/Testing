package sample.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DaySeven3 {
	
	WebDriver driver;
	@BeforeMethod
	
 public void BeforeMethod()
 {

	  WebDriverManager.edgedriver().setup();
	  driver =new EdgeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
 }
	@Test
	public void underMethod() throws InterruptedException
	 {
		Thread.sleep(3000);
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(4000);
	 }
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}
}
