package LaunchApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	drives =new  ChromeDriver();
		drives.manage().window().maximize();
		Thread.sleep(300);
		drives.get("https://www.facebook.com/");
		Thread.sleep(300);
		drives.navigate().to("https://www.amazon.in/");
		System.out.println(drives.getTitle());
		System.out.println(drives.getCurrentUrl());
		Thread.sleep(300);
		drives.navigate().back();
		Thread.sleep(300);
		drives.navigate().forward();
		Thread.sleep(300);
		drives.navigate().refresh();
		Thread.sleep(300);
		drives.close();
		
		

	}

}
