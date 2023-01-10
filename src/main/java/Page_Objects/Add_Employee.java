package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Enums.WaitStrategy;

public class Add_Employee extends BaseTest {
	
	
	private final By PIM_Link = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
	private final By Add_Employee = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	private final By FirstName=By.xpath("//input[@name='firstName']");
	private final By MiddleName=By.xpath("//input[@name='middleName']");
	private final By LastName=By.xpath("//input[@name='lastName']");
	private final WebElement Profile=driver.findElement(By.xpath("//button[@class='oxd-icon-button employee-image-action']"));
	private final By SaveButton=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");	
	
	
	
	public Add_Employee Click_PIM_Link() {
		
		click(PIM_Link, WaitStrategy.CLICKABLE);
		
		return this;
	}
	
   public Add_Employee Click_Add() {
		
		click(Add_Employee, WaitStrategy.CLICKABLE);
		
		return this;
	}
   
   public Add_Employee Enter_FirstName(String Fname) {
	   sendkeys(FirstName, Fname, WaitStrategy.CLICKABLE);
	   
	   return this;
   }
   
   public Add_Employee Enter_MiddleName(String Mname) {
	   sendkeys(MiddleName, Mname, WaitStrategy.CLICKABLE);
	   
	   return this;
   }
   
   public Add_Employee Enter_LastName(String Lname) {
	   sendkeys(LastName, Lname, WaitStrategy.CLICKABLE);
	   
	   return this;
   }
   
   public Add_Employee EAdd_Profile(String Profile_Path) {
	   click_and_sendkeys(Profile,Profile_Path ,WaitStrategy.CLICKABLE);
	return this;
	   
   }
  
   
   public Add_Employee Save() {
		
		click(SaveButton, WaitStrategy.CLICKABLE);
		
		return this;
	}
   
 
  
}
