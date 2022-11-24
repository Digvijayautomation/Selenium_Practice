package Factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constants.Constants;
import Enums.WaitStrategy;
import Page_Objects.BaseTest;

public class ExplicitWait extends BaseTest {

	
	
	// WaitStrategy For By
	public static void explicitwait(WaitStrategy WAITING, By by) {

		if (WAITING == WaitStrategy.CLICKABLE) {
			WebDriverWait wait = new WebDriverWait(driver, Constants.getExplicitwait());
			wait.until(ExpectedConditions.elementToBeClickable(by));

		}

		else if (WAITING == WaitStrategy.VISIBLE) {
			WebDriverWait wait = new WebDriverWait(driver, Constants.getExplicitwait());
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

		}

		else if (WAITING == WaitStrategy.PRESENSE) {
			WebDriverWait wait = new WebDriverWait(driver, Constants.getExplicitwait());
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));

		}

		else if (WAITING == WaitStrategy.NONE) {

		}

	}
	

	
	// WaitStrategy For List<WebElement>
	public static void explicitwait(WaitStrategy WAITING, WebElement element) {

		if (WAITING == WaitStrategy.CLICKABLE) {
			WebDriverWait wait = new WebDriverWait(driver, Constants.getExplicitwait());
			wait.until(ExpectedConditions.elementToBeClickable((By) element));

		}

		else if (WAITING == WaitStrategy.VISIBLE) {
			WebDriverWait wait = new WebDriverWait(driver, Constants.getExplicitwait());
			wait.until(ExpectedConditions.visibilityOf((WebElement) element));

		}

		else if (WAITING == WaitStrategy.PRESENSE) {
			WebDriverWait wait = new WebDriverWait(driver, Constants.getExplicitwait());
			wait.until(ExpectedConditions.presenceOfElementLocated((By) element));

		}

		else if (WAITING == WaitStrategy.NONE) {

		}

	}
	
	
}