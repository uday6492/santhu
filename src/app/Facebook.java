package app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("santoshreddy624@gmail.com");
		Thread.sleep(2000);
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("",Keys.ENTER);
		//Thread.sleep(10000);
		//driver.close();
		//driver.quit();
		

	}

}
