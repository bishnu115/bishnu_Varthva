package varthana_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomClass {
	public WebDriver driver;

	@FindBy(name="q")
	WebElement searchBox;

	@FindBy(xpath="//div[text()='Apple iPhone 15 (Black, 128 GB)']")
	WebElement phone;

	@FindBy(xpath="//button[text()='Buy Now']")
	WebElement buyNow;
	
	public pomClass(WebDriver driver)
	{

		PageFactory.initElements(driver, this);

	}
	public void search()
	{
		try {
			driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		} catch (Exception e) {

		}
		searchBox.clear();
		searchBox.sendKeys("iphone15");
		searchBox.submit();
		phone.click();
		
	}
	public void BUYNOW()
	{
		buyNow.click();

	}
}
