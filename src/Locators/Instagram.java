package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("jhgffcvhgvbngd");
		driver.findElement(By.name("password")).sendKeys("xvxngvngvfv");
		
		

		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		

	}

}
