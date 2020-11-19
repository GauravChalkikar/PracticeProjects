package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class containsDemo {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/#/index");
	driver.findElement(By.linkText("Practice Projects")).click();
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gaurav v Chalkikar");
	Thread.sleep(2000);
	

	}

}
