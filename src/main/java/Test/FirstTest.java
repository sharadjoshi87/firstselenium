package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	WebDriver driver;

	public static void main(String[] args) {
		
		System.out.println("running");

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "BrowserDrivers\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://www.google.com");
	}

}
