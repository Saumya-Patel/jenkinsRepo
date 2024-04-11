package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyScript {
	@Test
	public void test() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saumyapatel\\Desktop\\selenium\\Browser drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("iphone 15");		
		driver.findElement(By.id("nav-search-submit-button")).click();

	}
}
