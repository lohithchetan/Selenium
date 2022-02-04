package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");	
		driver.findElement(By.id("email")).sendKeys("lohjhhjh");
		driver.findElement(By.name("pass")).sendKeys("jhghgguy");
		driver.findElement(By.name("login")).click();
		
	}

}
