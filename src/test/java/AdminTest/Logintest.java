package AdminTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.Loginpage;

public class Logintest extends Testbase {
	
	Loginpage objlog;
	
	public Logintest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initilization();
		objlog=new Loginpage();
	}
	
	@Test
	public void adminlogintest()
	{
		String Expectedpagetitle="Smart Hospital : Hospital Management System";
		String actualpagetitle=objlog.getpagetitle();
		Assert.assertEquals(actualpagetitle, Expectedpagetitle);
		
	     Assert.assertTrue(objlog.logodisplayed());
	     
	     String Expectedlogintitle="Admin Login";
	     String Actuallogintile=objlog.getlogintitle();
	     Assert.assertEquals(Expectedlogintitle, Actuallogintile);
	     
	     objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	     
	     objlog.clickonprofile();
	     
	     String Expectedusername="Super Admin";
	     String Actualusername=objlog.getprofiletext();
	     Assert.assertEquals(Expectedusername, Actualusername);
	     
	     objlog.clickonlogout();
	 	
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}
