package waitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\JARS\\Selenium WebDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kalyani");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Handal");
	
	}

}
