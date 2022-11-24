package Page_Objects;

import org.openqa.selenium.By;

import Enums.WaitStrategy;

public class Logout_Page extends BaseTest{
	
	private final By LogoutTab = By.xpath("//img[@class='oxd-userdropdown-img']");
	private final By LogoutLink = By.xpath("//a[@href='/web/index.php/auth/logout']");


	
	
	public Logout_Page Logout_Tab() {

		click(LogoutTab, WaitStrategy.CLICKABLE);
		
		return this;
	}

	public Login_Page Click_Logout() {

		click(LogoutLink, WaitStrategy.CLICKABLE);
		
		return new Login_Page();
	}
	
}
