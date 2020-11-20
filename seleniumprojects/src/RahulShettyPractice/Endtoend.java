package RahulShettyPractice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Endtoend {

	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		Select sel = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		sel.selectByIndex(4);
		sel.selectByValue("7");
		Select sel1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		sel1.selectByValue("2");

		Select sel2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		sel2.selectByValue("3");
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Thread.sleep(2000);

		Select sel4 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Thread.sleep(2000);
		sel4.selectByIndex(3);
		Thread.sleep(2000);
		sel4.selectByVisibleText("USD");
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
