package Page_Objects;

import org.openqa.selenium.By;

import Enums.WaitStrategy;

public class Delete_Employee extends BaseTest{
	
	
	private final By Employee_List= By.xpath("//a[contains(text(), 'Employee List')]");
	private final By Employee_Search_Using_Name= By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)");
	private final By Button_Search=By.xpath("//button[@type=\"submit\"]");
	private final By Delete=By.xpath("//i[@class='oxd-icon bi-trash']");
	private final By Delete_Confirmation=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]");
	
	
	
	public Delete_Employee Click_Employee_List() {
		
		click(Employee_List, WaitStrategy.CLICKABLE);
		return this;
	}
	
	public Delete_Employee Search_Emp_Name(String value) {
		
		sendkeys(Employee_Search_Using_Name, value, WaitStrategy.VISIBLE);
		return this ;
	}
	
	public Delete_Employee Search_emp() {
		
		click(Button_Search, WaitStrategy.CLICKABLE);
		return this;
	}
	
	public Delete_Employee delete() {
		click(Delete, WaitStrategy.CLICKABLE);
		return this;
	}
	
	public Delete_Employee Confirmation() {
		
		click(Delete_Confirmation, WaitStrategy.CLICKABLE);
		return this;
	}
	
	
}
