package RahulShettyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
List <WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

for(WebElement option :options)
{
	if(option.getText().equalsIgnoreCase("India"))
	
	{
		option.click();
		break;
	}
	
}

	}

}
