package RahulShettyPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuppractice {

	public static void main(String[] args) throws InterruptedException
	{
		String text="gaurav";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
driver.findElement(By.id("confirmbtn")).click();
System.out.println(driver.switchTo().alert().getText());
Thread.sleep(2000);
driver.switchTo().alert().dismiss();
	}

}
