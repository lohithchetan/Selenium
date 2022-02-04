package LaunchApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");		
		Thread.sleep(30);
		driver.navigate().to("https://www.amazon.in/");	
		
		
		driver.navigate().back();
		Thread.sleep(30);
		

		driver.navigate().forward();
		Thread.sleep(30);
		

		driver.navigate().refresh();
		Thread.sleep(30);
		
		driver.close();
		
	

	}

}
