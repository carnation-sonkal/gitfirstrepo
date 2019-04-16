package com.sc;


	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;
	public class Sc {
	
		public static WebDriver driver;
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "E:\\sonali\\jars\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
				Sc1.takeScreenshot(driver, "facebook");
				driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("sonali jarhad");
			 Sc1.takeScreenshot(driver,"facebookid");
				
			}
}
    driver.quite();