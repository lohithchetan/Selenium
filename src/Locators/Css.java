package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.php");
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("kjvndfjk");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("dkjfgv");
	driver.findElement(By.cssSelector("button[name='login']")).click();
	
	}

}
