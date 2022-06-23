package AdminTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.FrontofficePage;
import hms.pages.Loginpage;

public class FrontofficeTest extends Testbase {
	
	Loginpage objlog;
	FrontofficePage objff;
	
	public FrontofficeTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		objlog=new Loginpage();
		objff=objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}
	@Test
	public void testfrontoffice()
	{
		objff.clickonffmenu();
		String Expectedtabletitle="Appointment Details";
		String Actualtabletitle=objff.getboxtitle();
		Assert.assertEquals(Actualtabletitle, Expectedtabletitle);
		objff.clickonvistorbook();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
