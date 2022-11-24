package Page_Objects;

import org.openqa.selenium.By;


import Enums.WaitStrategy;

public class Login_Page extends BaseTest {

	private final By UsernameTextBox = By.xpath("//input[@name='username']");
	private final By PasswordTextBox = By.xpath("//input[@name='password']");
	private final By LoginButton = By.xpath("//button[1]");
	
	
	
	// Return type for this method should be this page only
	
	public Login_Page Enter_Username(String Usename) { // passing username as parameter so that we can pass the actual value at test level

		sendkeys(UsernameTextBox, Usename, WaitStrategy.PRESENSE);
		
		return this; // method returning same page
	}

	public Login_Page Enter_Password(String Password) {

		sendkeys(PasswordTextBox, "admin123", WaitStrategy.PRESENSE);
		
		return this;
	}

	
	//for this method return type should be differnrt becuase after click it will go to admin page
	public Add_Employee Click_Submit() {

		click(LoginButton, WaitStrategy.CLICKABLE);
		return new Add_Employee();// after succfull login it will land on home page
	}
	
	
}
