package AdminTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hms.base.Testbase;
import hms.pages.FrontofficePage;
import hms.pages.Loginpage;
import hms.pages.Vistorpage;
import hms.utility.ReadExcel;

public class Vistorpagetest extends Testbase {
	
	Loginpage objlog;
	FrontofficePage objff;
	Vistorpage objvis;
	
  public Vistorpagetest()
  {
	  super();
  }
	
  @BeforeMethod
	public void setup()
	{
		initilization();
		objlog=new Loginpage();
		objff=objlog.adminlogin(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		objff.clickonffmenu();
		objvis=objff.clickonvistorbook();
	}
  
  @DataProvider
  public Object[][] getvisdata()
  {
	  Object[][]vistestdata=ReadExcel.getTestData("testdata");
	return vistestdata;
  }
  @Test(dataProvider="getvisdata")
  public void addvistor(String datatest[])
  {
	  String Expectedboxtitle="Visitor List";
	  String actualboxtitle=objvis.getboxtitle();
	  Assert.assertEquals(actualboxtitle, Expectedboxtitle);
	  
	  objvis.clickonaddvistor();
	  
	  String Expectedscreentitle="Add Visitor";
	  String actualscreentitle=objvis.getscreentitle();
	  Assert.assertEquals(actualscreentitle,Expectedscreentitle);
	  
	  objvis.addvistordetails(datatest);
	  
  }
  
  
  
  
}
