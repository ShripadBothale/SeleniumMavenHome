package SeleniumCI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 	



public class SeleniumTest {

	@Test
	public  void FirstClass () {
	
		WebDriver driver = new FirefoxDriver();
		String baseurl = "http://en.wikipedia.org/wiki/Main_Page";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("software testing");
		driver.findElement(By.xpath("//*[@id='searchButton']")).click();
		driver.quit();
	}
	
	
}
