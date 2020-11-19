package seleniumprojects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdowndemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	/*Select sel=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	sel.selectByIndex(3);
	sel.selectByValue("inr");
	sel.selectByVisibleText("USD");
	*/
	driver.manage().window().maximize();
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	int i;
	/*while(i<5)
	{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		i++;
	}
	*/
	for(i=1;i<5;i++)
	{
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	
			
	}
	
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
Thread.sleep(1000);
driver.findElement(By.id("btnclosepaxoption")).click();
Thread.sleep(2000);
driver.close();
	}

}
