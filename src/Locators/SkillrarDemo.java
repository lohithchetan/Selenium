package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillrarDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("lohjhhjh");
		driver.findElement(By.id("password")).sendKeys("lcvbcvbhjh");
		driver.findElement(By.name("login")).click();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		
}
}
