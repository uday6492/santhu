package app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:/login.do");
		
		WebElement unTb = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		unTb.sendKeys("admin");
		WebElement pwTb = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		pwTb.sendKeys("manager",Keys.ENTER);
		
	}

}
