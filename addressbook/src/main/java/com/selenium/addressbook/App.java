package com.selenium.addressbook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriverException;

	public class App {

		public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Sireesha\\Downloads\\chromedriver_win32\\chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*");
				ChromeDriver driver = new ChromeDriver(chromeOptions);
				System.out.println("Hi,welcome to selenium testcases");
				
				driver.get("http://35.171.21.86:8081/addressbook/");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				driver.findElement(By.className("v-button")).click();
				driver.findElement(By.id("gwt-uid-5")).sendKeys("suneel");
				driver.findElement(By.id("gwt-uid-7")).sendKeys("Ammanabrolu");
				driver.findElement(By.id("gwt-uid-9")).sendKeys("6304787767");
				driver.findElement(By.id("gwt-uid-11")).sendKeys("suneelgkce@gmail.com");
				driver.findElement(By.id("gwt-uid-13")).sendKeys("4/2/23,");
				driver.findElement(By.className("v-button-primary")).click();
				System.out.println("TestCase Executed");
				Thread.sleep(5000);
				//driver.quit();
			}
		}