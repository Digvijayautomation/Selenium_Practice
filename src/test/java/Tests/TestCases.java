package Tests;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import Page_Objects.Add_Employee;
import Page_Objects.BaseTest;
import Page_Objects.Delete_Employee;
import Page_Objects.Login_Page;
import Page_Objects.Logout_Page;

public class TestCases extends BaseTest {

	@Test
	public static void LoginPage() throws InterruptedException {

		// login Test
		Login_Page log = new Login_Page();

		log.Enter_Username("Admin");
		log.Enter_Password("admin123");
		log.Click_Submit();
	
		assertEquals("OrangeHRM", driver.getTitle());
		
		// Add Employee Under PIM Link
		Add_Employee add = new Add_Employee();

		add.Click_PIM_Link();
		add.Click_Add();
		add.Enter_FirstName("Digvijay");
		add.Enter_MiddleName("Tukaram");
		add.Enter_LastName("Tikka");
		add.EAdd_Profile("C:\\Users\\digvijayt\\Downloads\\IMG_20221113_154511.JPG");
		add.Save();
		
		
		//Delete Employee
		Delete_Employee delete=new Delete_Employee();
		
		delete.Click_Employee_List();
		delete.Search_Emp_Name("Digvijay");
		delete.Search_emp();
		delete.delete();
		delete.Confirmation();
			
		
		// logout Test
		Logout_Page out = new Logout_Page();

		out.Logout_Tab();
		out.Click_Logout();

		
		
	}

}
