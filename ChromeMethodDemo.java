package webDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeMethodDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\JARS\\Selenium WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        System.out.println(driver.getPageSource());		
        System.out.println(driver.getTitle());
	}

}
