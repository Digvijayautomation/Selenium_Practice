package Page_Objects;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Enums.WaitStrategy;
import Factories.ExplicitWait;
import Utilities.ReadConfigProperties;

public class BaseTest {

	public static WebDriver driver;

	// From Selenium Version 4.6.0 no need to do setup for driver , selenium will
	// take care of it

	// Obeject for accessing config properties
	static ReadConfigProperties config = ConfigFactory.create(ReadConfigProperties.class);

	@BeforeSuite
	public static void setup() {
		driver = new ChromeDriver();
		driver.get(config.URL());
	}

	@AfterSuite
	public static void teardown() {
		driver.quit();

	}

	// Click method for element which is find using by
	public static void click(By by, WaitStrategy WAIT) {
		ExplicitWait.explicitwait(WAIT, by);
		driver.findElement(by).click();
	}

	// Click method for element which is find using webelement
	public static void click(WebElement element, WaitStrategy WAIT, By by) {
		ExplicitWait.explicitwait(WAIT, by);
		element.click();
	}

	// Sendkeys method for element which is find using webelement
	public static void sendkeys(WebElement element, String value, WaitStrategy WAIT, By by) {
		ExplicitWait.explicitwait(WAIT, by);
		element.sendKeys(value);
	}

	// Sendkeys method for element which is find using by
	public static void sendkeys(By by, String value, WaitStrategy WAIT) {
		ExplicitWait.explicitwait(WAIT, by);
		driver.findElement(by).sendKeys(value);
	}
	
	//Click and sendkeys
	public static void click_and_sendkeys(WebElement element,String value, WaitStrategy WAIT)
	{
		ExplicitWait.explicitwait(WAIT, element);
		Actions action=new Actions(driver);
		action.moveToElement(element).click().sendKeys(value).build().perform();
	}
	
	// Gettext method for
	public static String gettext(By by, WaitStrategy WAIT) {
		ExplicitWait.explicitwait(WAIT, by);
		String presense=driver.findElement(by).getText();
		return presense;
	}
	
	// Alert accept method
	public static void Accept_Alert()
	{
		driver.switchTo().alert().accept();
	}
	
	// Alert Dismiss method
		public static void Dissmiss_Alert()
		{
			driver.switchTo().alert().dismiss();
		}
		
	
	
}
