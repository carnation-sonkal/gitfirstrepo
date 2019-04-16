package waitsDemo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\JARS\\Selenium WebDrivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    FluentWait wait=new FluentWait(driver);
    wait.pollingEvery(200, TimeUnit.MILLISECONDS);
    wait.ignoring(TimeoutException.class);
    wait.withTimeout(4, TimeUnit.SECONDS);
    wait.until(ExpectedConditions.attributeContains(By.xpath("//input[@name='firstname']"), "name", "firstname"));
    
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kalyani");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Handal");
	}

}
