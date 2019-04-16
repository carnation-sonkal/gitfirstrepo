package waitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\JARS\\Selenium WebDrivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.onlinesbi.com/");
driver.manage().window().maximize();
/*WebDriverWait wait=new WebDriverWait(driver, 10);
wait.pollingEvery(5, TimeUnit.SECONDS);
wait.withTimeout(5, TimeUnit.SECONDS);
*/
driver.findElement(By.xpath(("(//span[@class='hidden-xs'])[1]"))).click();
	}

}
