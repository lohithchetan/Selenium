package LaunchApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test01 {

	public static void main(String[] args) {
	WebDriver drives = new ChromeDriver();
	drives.get("https://www.facebook.com");
    System.out.println(drives.getTitle());
    System.out.println(drives.getCurrentUrl());
    drives.close();
    

    
	
	
	}

}
