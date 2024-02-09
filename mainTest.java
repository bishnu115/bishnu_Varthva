package varthana_Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class mainTest {

	@Test
	public void m1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		pomClass po=new pomClass(driver);
		po.search();
		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String)it.next();
		String childid = (String)it.next();
		driver.switchTo().window(childid);
		po.BUYNOW();
		driver.quit();

	}
}
