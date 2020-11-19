package seleniumprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Demonew {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");		
		driver.manage().window().maximize();	
	driver.findElement(By.linkText("Gmail")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gaurav Chalkikar");
	driver.findElement(By.cssSelector("input.gNO89b")).click();
	//driver.findElement(By.xpath("//button[@name='login']")).click();
	//System.out.println(driver.xpath(By.cssSelector("//*[@id=\'u_0_f\']")).getText());
	Thread.sleep(2000);


		
	}

}
