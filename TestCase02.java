package sample.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase02 {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Harini");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("B");
	driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("harinibalaa09@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("harini@2003");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,125000)", "");
	driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("09/09/2003");
	driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("India");
	driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("9876543210");
	driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]")).sendKeys("india");
	driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("9898989765");
	driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]")).sendKeys("09/09/2023");
	driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("3");
	driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("3");
	driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
	}
}